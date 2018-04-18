// Cresencio Quereapa

import java.io.*;
import java.util.*;

public class TestEncodeProtein
{
	public static void main(String[] args)
	{
		testRNA("shortRNA.txt");
		System.out.println();
		testRNA("longRNA.txt");
	}
	
	public static void testRNA(String fileName)
	{
		File f = new File(fileName);
		try (Scanner in = new Scanner(f);)
		{
			String rna = in.nextLine();
			String peptide = EncodeProtein.translate(rna);
			String correctPeptide = in.nextLine();
			if (peptide.equals(correctPeptide))
				System.out.println("Test passed for file " + fileName);
			else
				System.out.println("Test failed for file " + fileName + " Incorrect peptide");
			System.out.println(peptide);
			
		} catch (FileNotFoundException e) {
			System.out.println("File in wrong location");
		} catch (RuntimeException e) {
			System.out.println("Test failed for file " + fileName);
			System.out.println("You have a runtime error. See the following error message below");
			e.printStackTrace();
		}
	}
}