package ciphertools.caesarcipher.encryption;

import ciphertools.caesarcipher.utils.*;

public class CaesarEncryption {
	// Instance Variable(s)
	// Class Constant(s)

	// Constructor(s)
	public CaesarEncryption() {

	}

	/**
	 *
	 * @param clearAlphabet
	 * @param shiftDegree
	 */
	public CaesarEncryption(ShiftDegree shiftDegree, Message clearText,
			Message cipherText) {
		applyCaesarEncryption(shiftDegree, clearText, cipherText);
	} // End Method

	// Custom Method(s)
	public void applyCaesarEncryption(ShiftDegree shiftDegree,
			Message clearText, Message cipherText) {
		char encryptedChar = ' ';

		for (int i = 0; i < clearText.getLength(); i++) {
			if (clearText.charAt(i) < Alphabet.ASCII_UPPER_CASE_LETTER_START
					|| clearText.charAt(i) > Alphabet.ASCII_UPPER_CASE_LETTER_END) {
				cipherText.setMessage(cipherText.getMessage()
						+ clearText.charAt(i));
			} else {
				if ((clearText.charAt(i) - Alphabet.ASCII_UPPER_CASE_LETTER_START)
						+ shiftDegree.getShiftDegree() < Alphabet.NUM_LETTERS_IN_ALPHABET) {
					encryptedChar = (char) (clearText.charAt(i) + shiftDegree
							.getShiftDegree());
				} else {
					encryptedChar = (char) (((clearText.charAt(i) + shiftDegree
							.getShiftDegree()) - Alphabet.NUM_LETTERS_IN_ALPHABET));
				}
				cipherText.setMessage(cipherText.getMessage() + encryptedChar);
			}
		}
	}
}// End Class