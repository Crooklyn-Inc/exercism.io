class ResistorColor {
    int colorCode(String color) {
        int result = 0;
        for (int i = 0; i < colors().length; i++) {
            if (color == colors()[i]) {
                result = i;
            }
        }
        return result;
    }

    String[] colors() {
        return new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }
}
