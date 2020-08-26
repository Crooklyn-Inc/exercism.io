import java.util.ArrayList;

class NaturalNumber {
    public int num;

    NaturalNumber(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.num = num;
    }

    ArrayList<Integer> getDivisors(int number) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= number - 1; i++) {
            if (number % i == 0) {
                list.add(i);
            }
        }
        return list;
    }

    Classification getClassification() {

        if (isPerfect(this.num)) {
            return Classification.PERFECT;
        }
        if (isAbundant(this.num)) {
            return Classification.ABUNDANT;
        }
        if (isDeficient(this.num)) {
            return Classification.DEFICIENT;
        }
        return null;
    }

    boolean isPerfect(int number) {
        int check = 0;
        for (Integer integer : getDivisors(number)) {
            check += integer;
        }
        return check == number;
    }

    boolean isAbundant(int number) {
        int check = 0;
        for (Integer integer : getDivisors(number)) {
            check += integer;

        }
        return check > number;
    }

    boolean isDeficient(int number) {
        int check = 0;
        for (Integer integer : getDivisors(number)) {
            check += integer;

        }
        return check < number;
    }


}
