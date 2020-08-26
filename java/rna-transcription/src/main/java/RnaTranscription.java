import java.util.HashMap;
import java.util.Map;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder result = new StringBuilder();
        char[] dna = {'G', 'C', 'T', 'A'};
        char[] rna = {'C', 'G', 'A', 'U'};

        for (int i = 0; i < dnaStrand.length(); i++) {
            for (int x = 0; x < dna.length; x++) {
                if (dnaStrand.charAt(i) == dna[x]){
                    result.append(rna[x]);
                }
            }
        }


        return result.toString();
    }

}
