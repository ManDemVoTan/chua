import java.util.ArrayList;
import java.util.List;

public class StringHelper {
    public static List<String> splitBySpaces(String str) {
        List<String> result = new ArrayList<>();
        String[] pieces = str.split(" ");
        for (int i = 0; i < pieces.length; i++) {
            result.add(pieces[i]);
        }
        return result;
    }

}