import java.util.ArrayList;

public class Episode {
    /**
     * make all the properties that a TV show should have based on the JSON
     */
    private int id;
    private String url;
    private String name;
    private int season;
    private int number;
    private String airdate;
    private String airtime;
    private String airstamp;
    private int runtime;
    private ArrayList<Episode> episodes;

    public int getId() {
        return id;
    }
    public String getUrl() {
        return url;
    }
    public String getName() {
        return name;
    }
    public int getSeason() {
        return season;
    }
    public int getNumber() {
        return number;
    }
    public String getAirdate() {
        return airdate;
    }

    public String getAirstamp() {
        return airstamp;
    }
    public int getRuntime() {
        return runtime;
    }
}
