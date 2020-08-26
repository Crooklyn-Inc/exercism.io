import java.math.BigInteger;
import java.util.ArrayList;

class Grains {
    BigInteger numberOfGrains = new BigInteger("0");
    ArrayList<BigInteger> array = new ArrayList<>();

    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        } else {
            numberOfGrains(square);
            return new BigInteger(String.valueOf(array.get(square - 1)));
        }
    }

    BigInteger grainsOnBoard() {
        numberOfGrains(64);
        BigInteger total = new BigInteger("0");
        for (int i = 0; i < array.size(); i++) {
            total = total.add(array.get(i));
        }
        return total;
    }

    BigInteger numberOfGrains(int square) {
        for (int i = 1; i <= square; i++) {
            if (i == 1) {
                numberOfGrains = numberOfGrains.add(new BigInteger("1"));
                array.add(numberOfGrains);
            } else {
                numberOfGrains = numberOfGrains.multiply(new BigInteger(String.valueOf(2)));
                array.add(numberOfGrains);
            }
        }
        return numberOfGrains;
    }
}
