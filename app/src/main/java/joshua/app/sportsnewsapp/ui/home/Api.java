package joshua.app.sportsnewsapp.ui.home;


import joshua.app.sportsnewsapp.models.MyRes;
import joshua.app.sportsnewsapp.models.standings.StandingsResponse;
import joshua.app.sportsnewsapp.models.topscorers.TopScorersResponse;
import joshua.app.sportsnewsapp.models.transfers.TransfersResponse;
import joshua.app.sportsnewsapp.seasons.SeasonsResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface Api {

    String BASE_URL = "https://api-football-v1.p.rapidapi.com/v3/";
    @Headers({
            "x-rapidapi-key: 407f57c6c3msh39a5081824ca9eep1f6f52jsn6a9a6e410883",
            "x-rapidapi-host: api-football-v1.p.rapidapi.com"
    })
    @GET("leagues")
    Call<MyRes> getLeagues();



    @Headers({
            "x-rapidapi-key: 407f57c6c3msh39a5081824ca9eep1f6f52jsn6a9a6e410883",
            "x-rapidapi-host: api-football-v1.p.rapidapi.com"
    })
    @GET("players/topscorers?league=39&season=2020")
    Call<TopScorersResponse> getTopScorers();

    @Headers({
            "x-rapidapi-key: 407f57c6c3msh39a5081824ca9eep1f6f52jsn6a9a6e410883",
            "x-rapidapi-host: api-football-v1.p.rapidapi.com"
    })
    @GET("transfers?player=35845")
    Call<TransfersResponse> getTransfers();


    @Headers({
            "x-rapidapi-key: 407f57c6c3msh39a5081824ca9eep1f6f52jsn6a9a6e410883",
            "x-rapidapi-host: api-football-v1.p.rapidapi.com"
    })
    @GET("standings?season=2020&league=39")
    Call<StandingsResponse> getMStandings();

    @Headers({
            "x-rapidapi-key: 407f57c6c3msh39a5081824ca9eep1f6f52jsn6a9a6e410883",
            "x-rapidapi-host: api-football-v1.p.rapidapi.com"
    })
    @GET("leagues/seasons")
    Call<SeasonsResponse> getSeasons();


}