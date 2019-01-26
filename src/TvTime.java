import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import java.util.ArrayList;

public class TvTime {
    /**
     * parse the JSON and do any extra work
     */
    private static final String TV_SHOW = "\"episodes\":[  \n" +
            "         {  \n" +
            "            \"id\":203469,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/203469/narcos-1x01-descenso\",\n" +
            "            \"name\":\"Descenso\",\n" +
            "            \"season\":1,\n" +
            "            \"number\":1,\n" +
            "            \"airdate\":\"2015-08-28\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2015-08-28T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/16/41472.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/16/41472.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>A Chilean drugsproducer, the chemist Cockroach, brings his product to the Colombian smuggler Pablo Escobar. DEA-Agent Steve Murphy is fighting drugs in Bogota.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/203469\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":208978,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/208978/narcos-1x02-the-sword-of-simon-bolivar\",\n" +
            "            \"name\":\"The Sword of Simón Bolívar\",\n" +
            "            \"season\":1,\n" +
            "            \"number\":2,\n" +
            "            \"airdate\":\"2015-08-28\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2015-08-28T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/16/41473.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/16/41473.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>The communistic radical group M-19 are counteracting the drug lords and Murphy's new partner Peña teaches him the Colombian way of law enforcement.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/208978\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":208979,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/208979/narcos-1x03-the-men-of-always\",\n" +
            "            \"name\":\"The Men of Always\",\n" +
            "            \"season\":1,\n" +
            "            \"number\":3,\n" +
            "            \"airdate\":\"2015-08-28\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2015-08-28T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/16/41474.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/16/41474.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>Murphy is confronted with corruption in the Colombian government once he tries to discolate Escobar's his political ambition together with his partner Peña.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/208979\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":208980,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/208980/narcos-1x04-the-palace-in-flames\",\n" +
            "            \"name\":\"The Palace in Flames\",\n" +
            "            \"season\":1,\n" +
            "            \"number\":4,\n" +
            "            \"airdate\":\"2015-08-28\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2015-08-28T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/16/41475.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/16/41475.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>Despite a new extradition treaty, the USA is increasing their budget to fight communism. It will create new challenges for Murphy and Peña to hunt for Pablo Escobar.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/208980\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":208981,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/208981/narcos-1x05-there-will-be-a-future\",\n" +
            "            \"name\":\"There Will Be a Future\",\n" +
            "            \"season\":1,\n" +
            "            \"number\":5,\n" +
            "            \"airdate\":\"2015-08-28\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2015-08-28T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/16/41476.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/16/41476.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>Pablo's extreme methods is almost leading to a war between drug lords, Carillo and the government. Peña tries to protect his witness Elisa.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/208981\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":208982,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/208982/narcos-1x06-explosivos\",\n" +
            "            \"name\":\"Explosivos\",\n" +
            "            \"season\":1,\n" +
            "            \"number\":6,\n" +
            "            \"airdate\":\"2015-08-28\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2015-08-28T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/16/41477.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/16/41477.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>Gacha was almost caught by Peña and Carillo. Murphy tries to protect candidate Gaviria against assassins with ties to Pablo as she is in favour for extradition.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/208982\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":208983,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/208983/narcos-1x07-you-will-cry-tears-of-blood\",\n" +
            "            \"name\":\"You Will Cry Tears of Blood\",\n" +
            "            \"season\":1,\n" +
            "            \"number\":7,\n" +
            "            \"airdate\":\"2015-08-28\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2015-08-28T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/16/41478.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/16/41478.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>Pablo went to hiding as political tides are turning against him, but he finds a way to beat back. The CIA is finally offering their help to Peña and Murphy.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/208983\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":208984,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/208984/narcos-1x08-la-gran-mentira\",\n" +
            "            \"name\":\"La Gran Mentira\",\n" +
            "            \"season\":1,\n" +
            "            \"number\":8,\n" +
            "            \"airdate\":\"2015-08-28\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2015-08-28T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/16/41479.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/16/41479.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>A tragic mistake forces the government to change strategies to fight Pablo, but Pablo has bigger issues as there is danger from within his empire.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/208984\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":208985,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/208985/narcos-1x09-la-catedral\",\n" +
            "            \"name\":\"La Catedral\",\n" +
            "            \"season\":1,\n" +
            "            \"number\":9,\n" +
            "            \"airdate\":\"2015-08-28\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2015-08-28T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/16/41480.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/16/41480.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>The hunt for Pablo seems to be over once he signs a deal with the government, but Murphy, Peña and the Calicartel have different thoughts about that.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/208985\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":208986,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/208986/narcos-1x10-despegue\",\n" +
            "            \"name\":\"Despegue\",\n" +
            "            \"season\":1,\n" +
            "            \"number\":10,\n" +
            "            \"airdate\":\"2015-08-28\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2015-08-28T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/16/41481.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/16/41481.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>Pablo's activities in prison forces the government to use extreme actions. Murphy and Peña have to deal with a problematic situation.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/208986\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":832098,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/832098/narcos-2x01-free-at-last\",\n" +
            "            \"name\":\"Free at Last\",\n" +
            "            \"season\":2,\n" +
            "            \"number\":1,\n" +
            "            \"airdate\":\"2016-09-02\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2016-09-02T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/73/182764.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/73/182764.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>In the aftermath of a massive military effort to take Pablo into custody, the family reunites while enemies worry. Steve and Connie fight about safety.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/832098\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":832099,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/832099/narcos-2x02-cambalache\",\n" +
            "            \"name\":\"Cambalache\",\n" +
            "            \"season\":2,\n" +
            "            \"number\":2,\n" +
            "            \"airdate\":\"2016-09-02\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2016-09-02T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/73/182765.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/73/182765.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>Tata gets impatient with life on the run. Pablo responds to President Gaviria's reward offer. Steve and Javier meet their new boss.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/832099\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":832100,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/832100/narcos-2x03-our-man-in-madrid\",\n" +
            "            \"name\":\"Our Man in Madrid\",\n" +
            "            \"season\":2,\n" +
            "            \"number\":3,\n" +
            "            \"airdate\":\"2016-09-02\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2016-09-02T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/73/182776.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/73/182776.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>President Gaviria has a new job for an old colleague. The Search Bloc's new tactics shake up Pablo, but also unsettle Steve and Javier.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/832100\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":832101,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/832101/narcos-2x04-the-good-the-bad-and-the-dead\",\n" +
            "            \"name\":\"The Good, the Bad, and the Dead\",\n" +
            "            \"season\":2,\n" +
            "            \"number\":4,\n" +
            "            \"airdate\":\"2016-09-02\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2016-09-02T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/73/182778.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/73/182778.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>The Cali cartel discusses moving in on Pablo's territory. Limon proposes a plan to Maritza. Tata gets a gun for protection.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/832101\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":832102,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/832102/narcos-2x05-the-enemies-of-my-enemy\",\n" +
            "            \"name\":\"The Enemies of My Enemy\",\n" +
            "            \"season\":2,\n" +
            "            \"number\":5,\n" +
            "            \"airdate\":\"2016-09-02\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2016-09-02T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/73/182782.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/73/182782.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>The Search Bloc gets a new leader. Javier loses faith in the system. Pablo brings Tata brother Carlos down from Miami to cheer her up.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/832102\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":832103,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/832103/narcos-2x06-los-pepes\",\n" +
            "            \"name\":\"Los Pepes\",\n" +
            "            \"season\":2,\n" +
            "            \"number\":6,\n" +
            "            \"airdate\":\"2016-09-02\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2016-09-02T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/73/182783.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/73/182783.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>The newly-formed Los Pepes want to destroy Pablo and his empire. Tata's brother urges her to leave and seek safety with her children.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/832103\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":832256,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/832256/narcos-2x07-deutschland-93\",\n" +
            "            \"name\":\"Deutschland 93\",\n" +
            "            \"season\":2,\n" +
            "            \"number\":7,\n" +
            "            \"airdate\":\"2016-09-02\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2016-09-02T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/73/182784.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/73/182784.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>As the danger intensifies for the Escobars, Pablo sends his family to another country. Gaviria weighs the opportunity to use them as leverage.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/832256\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":832257,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/832257/narcos-2x08-exit-el-patron\",\n" +
            "            \"name\":\"Exit El Patrón\",\n" +
            "            \"season\":2,\n" +
            "            \"number\":8,\n" +
            "            \"airdate\":\"2016-09-02\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2016-09-02T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/73/182786.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/73/182786.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>Colombia begins to turn on Escobar after his latest terrorist attack. Tata receives help from an unlikely ally. Quica gets increasingly anxious.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/832257\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":832258,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/832258/narcos-2x09-nuestra-finca\",\n" +
            "            \"name\":\"Nuestra Finca\",\n" +
            "            \"season\":2,\n" +
            "            \"number\":9,\n" +
            "            \"airdate\":\"2016-09-02\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2016-09-02T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/73/182788.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/73/182788.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>Pablo is reunited with an estranged family member. Judy Moncada's life is put in danger. The DEA and CIA clash over how to handle Los Pepes.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/832258\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":832259,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/832259/narcos-2x10-al-fin-cayo\",\n" +
            "            \"name\":\"Al Fin Cayó!\",\n" +
            "            \"season\":2,\n" +
            "            \"number\":10,\n" +
            "            \"airdate\":\"2016-09-02\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2016-09-02T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/73/182789.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/73/182789.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>Javier deals with the repercussions from Judy's interview. Tata tries to convince Pablo to surrender for the sake of his children.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/832259\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":1249969,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/1249969/narcos-3x01-the-kingpin-strategy\",\n" +
            "            \"name\":\"The Kingpin Strategy\",\n" +
            "            \"season\":3,\n" +
            "            \"number\":1,\n" +
            "            \"airdate\":\"2017-09-01\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2017-09-01T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/126/317059.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/126/317059.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>The Gentlemen of Cali gather their associates together for a big surprise announcement about the future of their business.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/1249969\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":1285381,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/1285381/narcos-3x02-the-cali-kgb\",\n" +
            "            \"name\":\"The Cali KGB\",\n" +
            "            \"season\":3,\n" +
            "            \"number\":2,\n" +
            "            \"airdate\":\"2017-09-01\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2017-09-01T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/126/317072.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/126/317072.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>A gas incident threatens to disrupt the Cali-government deal and Jorge is asked to help out. Peña grapples with his former Los Pepes connection.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/1285381\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":1285382,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/1285382/narcos-3x03-follow-the-money\",\n" +
            "            \"name\":\"Follow the Money\",\n" +
            "            \"season\":3,\n" +
            "            \"number\":3,\n" +
            "            \"airdate\":\"2017-09-01\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2017-09-01T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/126/317399.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/126/317399.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>The Rodriguez brothers go into hiding during negotiations. Pacho meets with the Lord of the Skies in Mexico. Peña's new DEA team visits Cali.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/1285382\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":1285383,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/1285383/narcos-3x04-checkmate\",\n" +
            "            \"name\":\"Checkmate\",\n" +
            "            \"season\":3,\n" +
            "            \"number\":4,\n" +
            "            \"airdate\":\"2017-09-01\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2017-09-01T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/126/315938.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/126/315938.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>Peña hatches a plan to try to capture Cali leader Gilberto Rodriguez. Amado proposes a business idea to Pacho.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/1285383\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":1285384,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/1285384/narcos-3x05-mro\",\n" +
            "            \"name\":\"MRO\",\n" +
            "            \"season\":3,\n" +
            "            \"number\":5,\n" +
            "            \"airdate\":\"2017-09-01\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2017-09-01T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/132/330716.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/132/330716.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>Paranoid about leaks, Miguel cracks down on his security. Pacho makes a decision about his new offer. Peña works on cultivating a witness.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/1285384\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":1285385,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/1285385/narcos-3x06-best-laid-plans\",\n" +
            "            \"name\":\"Best Laid Plans\",\n" +
            "            \"season\":3,\n" +
            "            \"number\":6,\n" +
            "            \"airdate\":\"2017-09-01\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2017-09-01T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/132/330745.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/132/330745.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>Jorge takes a dangerous risk. An accident in New York threatens to expose Chepe. Peña travels to Curaçao to arrest a potential witness.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/1285385\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":1285391,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/1285391/narcos-3x07-sin-salida\",\n" +
            "            \"name\":\"Sin Salida\",\n" +
            "            \"season\":3,\n" +
            "            \"number\":7,\n" +
            "            \"airdate\":\"2017-09-01\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2017-09-01T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/132/330755.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/132/330755.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>Peña plans another covert operation to take down a key Cali cartel member, but he risks running out of time during his search.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/1285391\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":1285392,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/1285392/narcos-3x08-convivir\",\n" +
            "            \"name\":\"Convivir\",\n" +
            "            \"season\":3,\n" +
            "            \"number\":8,\n" +
            "            \"airdate\":\"2017-09-01\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2017-09-01T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/132/330778.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/132/330778.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>David seeks revenge on behalf of his father, putting Enrique in danger. Peña asks Don Berna for help on a rescue mission.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/1285392\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":1285393,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/1285393/narcos-3x09-todos-los-hombres-del-presidente\",\n" +
            "            \"name\":\"Todos Los Hombres del Presidente\",\n" +
            "            \"season\":3,\n" +
            "            \"number\":9,\n" +
            "            \"airdate\":\"2017-09-01\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2017-09-01T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/126/317021.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/126/317021.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>David follows his suspicions. Peña is shocked to discover the depth of corruption in the Colombian government. Miguel is sought after once again.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/1285393\"\n" +
            "               }\n" +
            "            }\n" +
            "         },\n" +
            "         {  \n" +
            "            \"id\":1285394,\n" +
            "            \"url\":\"http://www.tvmaze.com/episodes/1285394/narcos-3x10-going-back-to-cali\",\n" +
            "            \"name\":\"Going Back to Cali\",\n" +
            "            \"season\":3,\n" +
            "            \"number\":10,\n" +
            "            \"airdate\":\"2017-09-01\",\n" +
            "            \"airtime\":\"\",\n" +
            "            \"airstamp\":\"2017-09-01T12:00:00+00:00\",\n" +
            "            \"runtime\":60,\n" +
            "            \"image\":{  \n" +
            "               \"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/126/317018.jpg\",\n" +
            "               \"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/126/317018.jpg\"\n" +
            "            },\n" +
            "            \"summary\":\"<p>David and Peña are in a race against each other to find Pallomari. Peña makes a serious decision about the future of his career.</p>\",\n" +
            "            \"_links\":{  \n" +
            "               \"self\":{  \n" +
            "                  \"href\":\"http://api.tvmaze.com/episodes/1285394\"\n" +
            "               }\n" +
            "            }\n" +
            "         }\n" +
            "      ]";

    public Layout parseJSON() {
        Gson gson = new Gson();
        String gsonString = Data.getFileContentsAsString(TV_SHOW);
        Layout layout = gson.fromJson(gsonString, Layout.class);
        return layout;
    }

}
