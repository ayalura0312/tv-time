import java.lang.reflect.Array;
import java.util.ArrayList;

public class TvTime {
    Embedded _embedded;


    public Embedded get_embedded() {
        return _embedded;
    }

    //Filtering Methods
    public ArrayList<Episode> getEpisodesFromSeason(int season) {
        ArrayList<Episode> toReturn = new ArrayList<>();
        for (int i = 0; i < this.get_embedded().getEpisodes().size(); i++) {
            if (this.get_embedded().getEpisodes().get(i).getSeason() == season) {
                toReturn.add(this.get_embedded().getEpisodes().get(i));
            }
        }
        return toReturn;
    }

    public ArrayList<Episode> getEpisodesThatHaveStringInName(String input) {
        ArrayList<Episode> toReturn = new ArrayList<>();
        for (int i = 0; i < this.get_embedded().getEpisodes().size(); i++) {
            if (helperPassedEpisodeHasPassedString(this.get_embedded().getEpisodes().get(i).getName(), input)) {
                toReturn.add(this.get_embedded().getEpisodes().get(i));
            }
        }
        return toReturn;
    }
    public boolean helperPassedEpisodeHasPassedString(String bigString, String smallString) {
        String[] splitStringArray = bigString.split(" ");
        for (int i = 0; i < splitStringArray.length; i++) {
            if (splitStringArray[i].equals(smallString)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Episode> getEpisodesThatHaveAirdateOfGivenYear(String year) {
        ArrayList<Episode> toReturn = new ArrayList<>();
        for (int i = 0; i < this.get_embedded().getEpisodes().size(); i++) {
            if (helperForAirdateMethod(this.get_embedded().getEpisodes().get(i).getAirdate(), year)) {
                toReturn.add(this.get_embedded().getEpisodes().get(i));
            }
        }
        return toReturn;
    }
    public boolean helperForAirdateMethod(String bigString, String input) {
        String[] splitStringArray = bigString.split("-");
        if (splitStringArray[0].equals(input)) {
            return true;
        }
        return false;
    }

    public ArrayList<Episode> getSpecificNumberOfEpisodeInEverySeason(int input) {
        ArrayList<Episode> toReturn = new ArrayList<>();
        for (int i = 0; i < this.get_embedded().getEpisodes().size(); i++) {
            if (this.get_embedded().getEpisodes().get(i).getNumber() == input) {
                toReturn.add(this.get_embedded().getEpisodes().get(i));
            }
        }
        return toReturn;
    }

    //Aggregate Methods
    public int getTotalNumberOfEpisodes(ArrayList<Episode> input) {
        if (input == null) {
            return 0;
        }
        return input.size();
    }

    public int averageLengthOfEpisodes(ArrayList<Episode> input) {
        if (input == null) {
            return 0;
        }
        int totalRuntime = 0;
        for (int i = 0; i < input.size(); i++) {
            totalRuntime += input.get(i).getRuntime();
        }
        return totalRuntime / input.size();
    }

    public int maximumLengthOfPassedEpisodes(ArrayList<Episode> input) {
        if (input == null) {
            return 0;
        }
        int maxLength = input.get(0).getRuntime();
        for (int i = 0; i < input.size(); i++) {
            if (input.get(i).getRuntime() > maxLength) {
                maxLength = input.get(i).getRuntime();
            }
        }
        return maxLength;
    }

    public int minimumIdOfPassedEpisodes(ArrayList<Episode> input) {
        if (input == null) {
            return 0;
        }
        int minID = input.get(0).getId();
        for (int i = 0; i < input.size(); i++) {
            if (input.get(i).getId() < minID) {
                minID = input.get(i).getId();
            }
        }
        return minID;
    }

}
