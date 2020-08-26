class Acronym {

    String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        StringBuilder result = new StringBuilder();
        String[] arr = phrase.split("[\\s,\\-,\\_]+");
        for (int i = 0; i<arr.length; i++){
            result.append(arr[i].charAt(0));
        }
        return String.valueOf(result).toUpperCase() ;
    }

}
