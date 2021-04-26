package ciphertools.caesarcipher.decryption;

import ciphertools.caesarcipher.utils.Alphabet;

public class BruteForceDecryption {

  private char[] decryptedMessage;

  public BruteForceDecryption() {

  }

  public String getDecryptedMessageAsString() {
    String decriptedMessageString = "";

    for (int i = 0; i < decryptedMessage.length; i++) {
      decriptedMessageString = decriptedMessageString + decryptedMessage[i];
    }

    return decriptedMessageString;
  }

  public void decrypt(char[] encryptedMessage, int shiftDegree) {
    decryptedMessage = new char[encryptedMessage.length];

    for (int i = 0; i < encryptedMessage.length; i++) {
      if(encryptedMessage[i] < Alphabet.ASCII_UPPER_CASE_LETTER_START || 
         encryptedMessage[i] > Alphabet.ASCII_UPPER_CASE_LETTER_END)
      {
        decryptedMessage[i] = encryptedMessage[i];
      }
      else
      {
        decryptedMessage[i] = (char)(((encryptedMessage[i] - shiftDegree) % Alphabet.NUM_LETTERS_IN_ALPHABET) + 
                                                                            Alphabet.ASCII_UPPER_CASE_LETTER_START);
      }
    } // End For
  } // End Method
}// End Class
