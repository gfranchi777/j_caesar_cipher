package ciphertools.caesarcipher.test;

import ciphertools.caesarcipher.utils.*;

public class TestAlphabetGeneration
{
  public static void main(String[] args)
  {
    Alphabet clearAlphabet = new Alphabet();
    Alphabet cipherAlphabet = new Alphabet();
    ShiftDegree shiftDegree = new ShiftDegree();

    System.out.print("Clear Alphabet  - No Shift: \n\n");

    clearAlphabet.printAlphabet();

    for (byte i = 1; i < Alphabet.NUM_LETTERS_IN_ALPHABET; i++)
    {
      shiftDegree.setShiftDegree(i);
      System.out.print("\nCipher Alphabet  - Shift Factor: " + shiftDegree.
                       getShiftDegree() + "\n\n");

      char cipherChar = ' ';

      for (byte j = 0; j < clearAlphabet.getLength(); j++)
      {
        if ((Alphabet.ASCII_UPPER_CASE_LETTER_START + j + shiftDegree.
             getShiftDegree()) <= Alphabet.ASCII_UPPER_CASE_LETTER_END)
        {
          cipherChar = (char) (Alphabet.ASCII_UPPER_CASE_LETTER_START + 
                               shiftDegree.getShiftDegree() + j);
        }
        else
        {
          cipherChar = (char) ((Alphabet.ASCII_UPPER_CASE_LETTER_START - 
                               (Alphabet.NUM_LETTERS_IN_ALPHABET - j)) + 
                               shiftDegree.getShiftDegree());
        }
        cipherAlphabet.setCharAt(j, cipherChar);
      }
      cipherAlphabet.printAlphabet();
    }
  } // End Main
}// End Class