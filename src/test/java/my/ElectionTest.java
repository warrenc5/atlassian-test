package my;


import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ElectionTest {

    @Test
    void testElectionResults() {
        List<String> votes = Arrays.asList("A", "B", "A", "C", "D", "B", "A");

        Election election = new Election();
        
        String result = election.findWinner(votes);

        assertEquals("A".equals(result),"ok");
    }

    
}
