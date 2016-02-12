package activity.junior.com.br.agendacultural.service;

import java.util.List;

import activity.junior.com.br.agendacultural.model.Event;
import retrofit2.Call;
import retrofit2.http.GET;

public interface EventsService {

    @GET("events.json")
    Call<List<Event>> getEvents();

}