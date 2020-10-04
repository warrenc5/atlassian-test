package my;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author wozza
 */
public class Election {

    public static void main(String args[]) {
        List<String> votes = Arrays.asList("A", "B", "A", "C", "D", "B", "A");

        Election election = new Election();
        
        String result = election.findWinner(votes);
        
        Logger.getLogger("test").info("winner !! !" + result);
    }

    public String findWinner(List<String> votes) {
        Map<String, List<String>> groups = votes.stream().collect(Collectors.groupingBy(String::toString));

        /**
        Optional<Map.Entry<String, List<String>>> result = groups.entrySet().stream().max((k1, k2) -> {
            return Integer.compare(k1.getValue().size(), k2.getValue().size());
        });
        **/

        Optional<Map.Entry<String, List<String>>> result = groups.entrySet().stream().map(k->)
                (((k1, k2) -> {
            return Integer.compare(k1.getValue().size(), k2.getValue().size());
        });

        if (result.isPresent()) {
            return result.get().getKey();
        } else {
            throw new IllegalArgumentException("No winner");
        }
    }
}
