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
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    private Call<List<Event>> events;
    private EventsService eventsService;
    private List<Event> responseEvents;

    @ViewById
    protected TextView textoTeste;

    @AfterViews
    public void appConfig() {

        serviceConfig();
        events = eventsService.getEvents();
        retrieveEvents();
    }

    private void serviceConfig() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://b737a92f.ngrok.io")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        eventsService = retrofit.create(EventsService.class);
    }

    @Background
    protected void retrieveEvents(){
        try {
            responseEvents =  events.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @UiThread
    protected void updateViews(){
        textoTeste.setText(responseEvents.size());
    }

}
