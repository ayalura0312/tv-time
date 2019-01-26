import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import java.util.ArrayList;

public class TvTime {
    /**
     * parse the JSON and do any extra work
     */

    public Episode parseJSON() {
        Gson gson = new Gson();
        String gsonString = Data.getFileContentsAsString("oneEpisodeFile.json");
        Episode input = gson.fromJson(gsonString, Episode.class);
        return input;
    }

}
