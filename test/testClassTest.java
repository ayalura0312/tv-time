import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import com.google.gson.Gson;

import java.util.ArrayList;

public class testClassTest {

    private TvTime Narcos;
    private Episode episode;
    Embedded embedded;
    @Before
    public void setUp() throws AssertionError {
        Gson gson = new Gson();
        episode = gson.fromJson(Data.getFileContentsAsString("oneEpisodeFile.json"), Episode.class);
        embedded = gson.fromJson(Data.getFileContentsAsString("oneSeason.json"), Embedded.class);
        Narcos = gson.fromJson(Data.getFileContentsAsString("files.json"), TvTime.class);
    }

    @Test
    public void getEpisodeID() {
        assertEquals(203469, episode.getId());
    }
    @Test
    public void getEpisodeURL() {
        assertEquals("http://www.tvmaze.com/episodes/203469/narcos-1x01-descenso", episode.getUrl());
    }
    @Test
    public void getEpisodeName() {
        assertEquals("Descenso", episode.getName());
    }
    @Test
    public void testGetThirdEpisodeName() {
        assertEquals("The Men of Always", embedded.getEpisodes().get(2).getName());
    }
    @Test
    public void testGetFourthEpisodeID() {
        assertEquals(208980, embedded.getEpisodes().get(3).getId());
    }
    @Test
    public void getSecondEpisodeURL() {
        assertEquals("http://www.tvmaze.com/episodes/208978/narcos-1x02-the-sword-of-simon-bolivar", embedded.getEpisodes().get(1).getUrl());
    }
    @Test
    public void getSecondEpisodeInSecondSeasonName() {
        assertEquals("Cambalache", Narcos._embedded.getEpisodes().get(11).getName());
    }
    @Test
    public void getSecondEpisodeInSecondSeasonID() {
        assertEquals(832099, Narcos._embedded.getEpisodes().get(11).getId());
    }
    @Test
    public void getThirdEpisodeInSecondSeasonURL() {
        assertEquals("http://www.tvmaze.com/episodes/832100/narcos-2x03-our-man-in-madrid", Narcos._embedded.getEpisodes().get(12).getUrl());
    }
    @Test
    public void getEpisodesFromSeasonTwo() {
        ArrayList<Episode> seasonTwoEpisodes = new ArrayList<>();
        for (int i = 10; i < 20; i++) {
            seasonTwoEpisodes.add(Narcos.get_embedded().getEpisodes().get(i));
        }
        assertEquals(seasonTwoEpisodes, Narcos.getEpisodesFromSeason(2));
    }
    @Test
    public void getEpisodesWithLaInThem() {
        ArrayList<Episode> episodesWithString = new ArrayList<>();
        episodesWithString.add(Narcos.get_embedded().getEpisodes().get(7));
        episodesWithString.add(Narcos.get_embedded().getEpisodes().get(8));
        assertEquals(episodesWithString, Narcos.getEpisodesThatHaveStringInName("La"));
    }
    @Test
    public void getEpisodesWith2017Airdate() {
        ArrayList<Episode> episodesWithAirdate = new ArrayList<>();
        for (int i = 20; i < 30; i++) {
            episodesWithAirdate.add(Narcos.get_embedded().getEpisodes().get(i));
        }
        assertEquals(episodesWithAirdate, Narcos.getEpisodesThatHaveAirdateOfGivenYear("2017"));
    }
    @Test
    public void getThirdEpisodeInEverySeason() {
        ArrayList<Episode> thirdEpisodes = new ArrayList<>();
        for (int i = 2; i <= 22; i += 10) {
            thirdEpisodes.add(Narcos.get_embedded().getEpisodes().get(i));
        }
        assertEquals(thirdEpisodes, Narcos.getSpecificNumberOfEpisodeInEverySeason(3));
    }
    @Test
    public void getTotalNumberOfEpisodesInSeasonOne() {
        assertEquals(10, Narcos.getTotalNumberOfEpisodes(Narcos.getEpisodesFromSeason(1)));
    }
    @Test
    public void getAverageLengthOfAllEpisodesInSeasonThree() {
        assertEquals(60, Narcos.averageLengthOfEpisodes(Narcos.getEpisodesFromSeason(3)));
    }
    @Test
    public void getMaximumLengthOfAllEpisodesInSeasonOne() {
        assertEquals(60, Narcos.maximumLengthOfPassedEpisodes(Narcos.getEpisodesFromSeason(1)));
    }
    @Test
    public void getMinimumIdOfAllEpisodesInSeasonTwo() {
        assertEquals(832098, Narcos.minimumIdOfPassedEpisodes(Narcos.getEpisodesFromSeason(2)));
    }
}