import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import com.google.gson.Gson;

public class testClassTest {

    private TvTime Narcos;
    private Episode episode;

    @Before
    public void setUp() throws AssertionError {
        Gson gson = new Gson();
        episode = gson.fromJson(Data.getFileContentsAsString("oneEpisodeFile.json"), Episode.class);
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

}