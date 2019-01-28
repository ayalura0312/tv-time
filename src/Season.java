import java.util.ArrayList;

public class Season {
    private ArrayList<Episode> episodes;

    public ArrayList<Episode> getEpisodes() {
        return episodes;
    }

    public String getNameOfNthEpisode(int index) {
        return episodes.get(index - 1).getName();
    }
}
