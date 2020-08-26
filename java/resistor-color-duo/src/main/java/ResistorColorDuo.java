class ResistorColorDuo {

    int value(String[] colors) {
        StringBuilder finalNumber = new StringBuilder();
        String[] base = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        for (int i = 0; i < colors.length; i++) {
            for (int x = 0; x < base.length; x++) {
                if (colors[i] == base[x]) {
                    finalNumber.append(x);
                }
            }
        }
        if (finalNumber.length() > 2) {
            finalNumber.replace(2, finalNumber.length(), "");
        }
        return Integer.parseInt(String.valueOf(finalNumber));
    }
}
