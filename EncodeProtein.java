// Cresencio Quereapa
import java.util.*;



public class EncodeProtein
{
	public static String translate(String rna)
	{
	   String peptide = "";
      System.out.println("RNA length = "+ rna.length());
      for(int i = 0; i < rna.length(); i = i+3)
      {
         String codon = rna.substring(i, i+3);
         String protein = codonTable(codon);
         //System.out.println(codon);
         peptide = peptide + protein;
         
      }
      return peptide;   
	} 
	
	public static String codonTable(String codon)
	{
		HashMap<String, String> aminoAcids = new HashMap<String, String>()
		{{
			put("UUU", "F"); put("UUC", "F");
			put("UUA", "L"); put("UUG", "L");
			put("UCU", "S"); put("UCC", "S"); put("UCA", "S"); put("UCG", "S");
			put("UAU", "Y"); put("UAC", "Y");
			put("UAG", "*"); put("UGA", "*"); put("UAA", "*");
			put("UGU", "C"); put("UGC", "C");
			put("UGG", "W");
			put("CUU", "L"); put("CUC", "L"); put("CUA", "L"); put("CUG", "L"); 
			put("CCU", "P"); put("CCC", "P"); put("CCA", "P"); put("CCG", "P");
			put("CAU", "H"); put("CAC", "H");
			put("CAA", "Q"); put("CAG", "Q");
			put("CGU", "R"); put("CGC", "R"); put("CGA", "R"); put("CGG", "R");
			put("AUU", "I"); put("AUC", "I"); put("AUA", "I");
			put("AUG", "M");
			put("ACU", "T"); put("ACC", "T"); put("ACA", "T"); put("ACG", "T");
			put("AAU", "N"); put("AAC", "N");
			put("AAA", "K"); put("AAG", "K");
			put("AGU", "S"); put("AGC", "S"); 
			put("AGA", "R"); put("AGG", "R");
			put("GUU", "V"); put("GUC", "V"); put("GUA", "V"); put("GUG", "V");
			put("GCU", "A"); put("GCC", "A"); put("GCA", "A"); put("GCG", "A");
			put("GAU", "D"); put("GAC", "D"); 
			put("GAA", "E"); put("GAG", "E");
			put("GGU", "G"); put("GGC", "G"); put("GGA", "G"); put("GGG", "G");
		}};
		
		return aminoAcids.get(codon);
	}
}