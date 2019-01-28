import java.util.ArrayList;

public class TvTime {
    Embedded _embedded;

    public Embedded get_embedded() {
        return _embedded;
    }

    public ArrayList<Episode> getEpisodesFromSeason(int season) {
        ArrayList<Episode> toReturn = new ArrayList<>();
        for (int i = 0; i < this.get_embedded().getEpisodes().size(); i++) {
            if (this.get_embedded().getEpisodes().get(i).getSeason() == season) {
                toReturn.add(this.get_embedded().getEpisodes().get(i));
            }
        }
        return toReturn;
    }

//    public ArrayList<Episode> getEpisodesThatHaveStringInName(String input) {
//        ArrayList<Episode> toReturn = new ArrayList<>();
//        for (int i = 0; i < this.get_embedded().getEpisodes().size(); i++) {
//            if (this.get_embedded().getEpisodes().get(i).getName().
//        }
//    }
//    //contains helper
//    public boolean contains(String bigString, String smallString) {
//
//    }
}
