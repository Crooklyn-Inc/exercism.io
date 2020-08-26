import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {

        List<String> rna     = new ArrayList<>();
        List<String> rnaName = new ArrayList<>();

        for (int i = 0; i < rnaSequence.length(); i += 3) {
            StringBuilder builder = new StringBuilder();
            builder.append(rnaSequence.charAt(i));
            builder.append(rnaSequence.charAt(i + 1));
            builder.append(rnaSequence.charAt(i + 2));

            rna.add(builder.toString());
            builder = new StringBuilder();
        }

        for (int i = 0; i < rna.size(); i++) {
            if (rna.get(i).equals("AUG")) {
                rnaName.add("Methionine");
            }
            if (rna.get(i).equals("UUU") || rna.get(i).equals("UUC")) {
                rnaName.add("Phenylalanine");
            }
            if (rna.get(i).equals("UUA") || rna.get(i).equals("UUG")) {
                rnaName.add("Leucine");
            }
            if (rna.get(i).equals("UCU") || rna.get(i).equals("UCC") || rna.get(i).equals("UCA") || rna.get(i).equals("UCG")) {
                rnaName.add("Serine");
            }
            if (rna.get(i).equals("UAU") || rna.get(i).equals("UAC")) {
                rnaName.add("Tyrosine");
            }
            if (rna.get(i).equals("UGU") || rna.get(i).equals("UGC")) {
                rnaName.add("Cysteine");
            }
            if (rna.get(i).equals("UGG")) {
                rnaName.add("Tryptophan");
            }
            if (rna.get(i).equals("UAA") || rna.get(i).equals("UAG") || rna.get(i).equals("UGA")) {
                break;
            }
        }
        return rnaName;
    }
}
