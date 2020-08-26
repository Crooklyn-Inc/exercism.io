class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int result = 0;
        String num = Integer.toString(numberToCheck);
        for (int i = 0; i < num.length(); i++) {
            result += Math.pow(Integer.parseInt(Character.toString(num.charAt(i))), num.length());
        }
        return numberToCheck == result;
    }

}
