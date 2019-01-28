import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import com.google.gson.Gson;

public class testClassTest {

    private TvTime Narcos;
    private Episode episode;
    Embedded embedded;
    @Before
    public void setUp() throws AssertionError {
        Gson gson = new Gson();
        episode = gson.fromJson(Data.getFileContentsAsString("oneEpisodeFile.json"), Episode.class);
        Narcos = gson.fromJson(Data.getFileContentsAsString("files.json"), TvTime.class);
        embedded = gson.fromJson(Data.getFileContentsAsString("oneSeason.json"), Embedded.class);
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

}