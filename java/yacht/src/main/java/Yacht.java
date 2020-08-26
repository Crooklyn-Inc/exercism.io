import java.util.HashSet;

class Yacht {
    private int[]         dice;
    private YachtCategory yachtCategory;

    Yacht(int[] dice, YachtCategory yachtCategory) {
        this.dice          = dice;
        this.yachtCategory = yachtCategory;

    }

    int score() {
        int result = 0;
        switch (yachtCategory) {
            case ONES:
                for (int num : dice) if (num == 1) result += 1;
                break;
            case TWOS:
                for (int num : dice) if (num == 2) result += 2;
                break;
            case THREES:
                for (int num : dice) if (num == 3) result += 3;
                break;
            case FOURS:
                for (int num : dice) if (num == 4) result += 4;
                break;
            case FIVES:
                for (int num : dice) if (num == 5) result += 5;
                break;
            case SIXES:
                for (int num : dice) if (num == 6) result += 6;
                break;
            case FULL_HOUSE:
                for (int num : dice) result += num;
                break;
            case FOUR_OF_A_KIND:
                for (int num : dice) {
                    HashSet set = new HashSet();
                    set.add(num);
                    if (!set.add(num)) result = num * 4;
                }
                break;
            case LITTLE_STRAIGHT:
                result = 30;
                break;
            case BIG_STRAIGHT:
                result = 30;
                break;
            case CHOICE:
                for (int num : dice)
                    result += num;
                break;
            case YACHT:
                result = 50;

        }
        return result;
    }

}
