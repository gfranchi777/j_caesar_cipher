package ciphertools.caesarcipher.test;

import ciphertools.caesarcipher.utils.*;
import ciphertools.caesarcipher.decryption.*;

public class TestBruteForceDecryption {
  public static void main(String[] args) {
    String encryptedMessageString = "LOFFM CFGPSF APE";
    char[] encryptedMessage = encryptedMessageString.toCharArray();
    
    Alphabet clearAlphabet = new Alphabet();
    Alphabet cipherAlphabet = new Alphabet();
    BruteForceDecryption bruteForceDecrypt = new BruteForceDecryption();

    System.out.println("Clear Alphabet: " + clearAlphabet.toString());
    System.out.println("Cipher Alphabet: " + cipherAlphabet.toString());
    for (int i = 0; i < Alphabet.NUM_LETTERS_IN_ALPHABET; i++) {
      bruteForceDecrypt.decrypt(encryptedMessage, i);
      if (i < 10) {
        System.out.println("Decrypted Message - Shift Degree 0" + i + ": " +
                           bruteForceDecrypt.getDecryptedMessageAsString());
      } else {
        System.out.println("Decrypted Message - Shift Degree " + i + ": " +
                           bruteForceDecrypt.getDecryptedMessageAsString());
      }
    }
  }
}
