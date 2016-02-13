package activity.junior.com.br.agendacultural;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;

import java.io.IOException;
import java.util.List;

import activity.junior.com.br.agendacultural.model.Event;
import activity.junior.com.br.agendacultural.service.EventsService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    private EventsService eventsService;
    private List<Event> events;

    @ViewById
    protected TextView textoTeste;

    @AfterViews
    public void appConfig() {

        serviceConfig();
        Call<List<Event>> call = eventsService.getEvents();
        call.enqueue(new Callback<List<Event>>() {
            @Override
            public void onResponse(Call<List<Event>> call, Response<List<Event>> response) {
                events = response.body();
                textoTeste.setText(events.get(0).getTitle());
            }

            @Override
            public void onFailure(Call<List<Event>> call, Throwable t) {

            }
        });

    }

    private void serviceConfig() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://b737a92f.ngrok.io")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        eventsService = retrofit.create(EventsService.class);
    }

}
