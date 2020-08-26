import java.lang.reflect.Array;
import java.util.ArrayList;

public class PangramChecker {
    public boolean isPangram(String input) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 97; i <= 122; i++) {
            array.add(i);
        }
        for (int x = 0; x < input.length(); x++) {
            for (int i = 0; i < array.size(); i++) {
                if (Character.toLowerCase(input.charAt(x)) == array.get(i)) {
                    array.remove(i);
                }
            }
        }
        return array.size()==0;
    }

}
