package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class ManipulateDna {

  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Jacob Walters " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen DNA string
    String strand = scanner.nextLine();
    System.out.println("Hello, your chosen DNA string is " + strand );
    // Step Two: Compute the complement of the DNA String
    String mutatedStrand = strand.substring(0,4);
    String upperCaseStrand = mutatedStrand.toUpperCase();
    String complementStrand1 = upperCaseStrand.replace('A', 'T');
    String complementStrand2 = complementStrand1.replace('T', 'A');
    String complementStrand3 = complementStrand2.replace('C', 'G');
    String complementStrand4 = complementStrand3.replace('G', 'C');
    System.out.println("The complement of this string is " + complementStrand4 );
    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    Random insert = new Random();
    char rdmLetter = chosenDNA.charAt(insert.nextInt(chosenDNA.legnth()));
    System.out.println("Inserting " + rmdletter + " at position 0 produces" + rdmLetter + chosenDNA);
    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string
    Random deletion = new Random();
    num1 = deletion.nextInt(chosenDNA.legnth());
    char delLetter = chosenDNA.charAt(num1);
    mutation5 = chosenDNA.replace(delLetter, " ");
    System.out.println("Deleting from position " + num1 + " gives" + mutation5);
    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter
    String replace(rmdletter oldChar, rmdletter newChar);
    // Step Six: Display a final thankyou message
    System.out.println("Thank you for using this program ");
  }

}
