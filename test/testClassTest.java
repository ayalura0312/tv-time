import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import com.google.gson.Gson;

public class testClassTest {

    private TvTime Narcos;
    private Episode episode;

    Episode episodes;
    @Before
    public void setUp() throws AssertionError {
        Gson gson = new Gson();
        episodes = gson.fromJson(Data.getFileContentsAsString("oneSeason.json"), Episode.class);
    }

//    @Test
//    public void getEpisodeID() {
//        assertEquals(203469, episode.getId());
//    }
//    @Test
//    public void getEpisodeURL() {
//        assertEquals("http://www.tvmaze.com/episodes/203469/narcos-1x01-descenso", episode.getUrl());
//    }
//    @Test
//    public void getEpisodeName() {
//        assertEquals("Descenso", episode.getName());
//    }
    @Test
    public void testGetThirdEpisodeName() {
        assertEquals("The Men of Always", episodes.getEpisodes().get(2).getName());
    }
    @Test
    public void testGetFourthEpisodeID() {
        assertEquals(208980, episodes.getEpisodes().get(3).getId());
    }
    @Test
    public void getSecondEpisodeURL() {
        assertEquals("http://www.tvmaze.com/episodes/208978/narcos-1x02-the-sword-of-simon-bolivar", episodes.getEpisodes().get(1).getUrl());
    }

}