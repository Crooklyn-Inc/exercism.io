class RaindropConverter {

    String convert(int number) {

        StringBuilder speak = new StringBuilder();

        for (int i = 1; i <= number; i++) {
            int res = number % i;
            if (res == 0) {
                switch (i) {
                    case 3:
                        speak.append("Pling");
                        break;
                    case 5:
                        speak.append("Plang");
                        break;
                    case 7:
                        speak.append("Plong");
                        break;
                }
            }

        }
        if (speak.toString().equals("")) {
            return Integer.toString(number);
        } else {
            return speak.toString();

        }
    }

}
