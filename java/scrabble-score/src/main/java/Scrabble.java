import java.util.HashMap;
import java.util.Map;

class Scrabble {

    String word;

    Scrabble(String word) {
        this.word = word.toLowerCase();
    }

    int getScore() {
        int result = 0;
        char[] onePoint = "AEIOULNRST".toLowerCase().toCharArray();
        char[] twoPoints = "DG".toLowerCase().toCharArray();
        char[] threePoints = "BCMP".toLowerCase().toCharArray();
        char[] fourPoints = "FHVWY".toLowerCase().toCharArray();
        char[] fivePoints = "K".toLowerCase().toCharArray();
        char[] eightPoints = "JX".toLowerCase().toCharArray();
        char[] tenPoints = "QZ".toLowerCase().toCharArray();

        returnMyMap(onePoint, 1);
        returnMyMap(twoPoints, 2);
        returnMyMap(threePoints, 3);
        returnMyMap(fourPoints, 4);
        returnMyMap(fivePoints, 5);
        returnMyMap(eightPoints, 8);
        returnMyMap(tenPoints, 10);

        for (int i = 0; i < word.length(); i++) {
            result += score.get(word.charAt(i));
        }

        return result;
    }

    Map<Character, Integer> score = new HashMap<>();

    void returnMyMap(char[] arr, int value) {
        for (char c : arr) {
            score.put(c, value);
        }
    }

}
