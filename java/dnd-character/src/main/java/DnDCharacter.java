import java.util.*;

class DnDCharacter {

    int initial_hitpoints = 10;

    int ability() {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            array.add(new Random().nextInt((6 - 1) + 1) + 1);
        }
        Collections.sort(array);
        int sum = 0;
        for (int x = 1; x < array.size(); x++) {
            sum += array.get(x);
        }
        return sum;
    }

    int modifier(int input) {
        if (input == 0) {
            input = getConstitution();
        }
        return roundDown((double) (input - 10) / 2);
    }

    int strength = ability();

    int getStrength() {
        return strength;
    }

    int dexterity = ability();

    int getDexterity() {
        return dexterity;
    }

    int constitution = ability();

    int getConstitution() {
        return constitution;
    }

    int intelligence = ability();

    int getIntelligence() {
        return intelligence;
    }

    int wisdom = ability();

    int getWisdom() {
        return wisdom;
    }

    int charisma = ability();

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return initial_hitpoints + modifier(getConstitution());
    }


    int roundDown(double number) {
        double result = number / 1;
        result = Math.floor(result);
        result *= 1;
        return (int) result;
    }

}
