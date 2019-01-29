import java.util.ArrayList;

public class Embedded {
    private ArrayList<Episode> episodes;

    //heirarchical class because all seasons are stored inside "_embedded"
    public ArrayList<Episode> getEpisodes() {
        return episodes;
    }
}
