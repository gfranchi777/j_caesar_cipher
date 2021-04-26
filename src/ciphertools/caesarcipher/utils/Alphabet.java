package ciphertools.caesarcipher.utils;

/**
 *
 * @author jc
 *
 */
public class Alphabet {
  // Instance Variable(s)
  private char[] alphabet;

  // Class Constant(s)
  public static final byte NUM_LETTERS_IN_ALPHABET = 26;
  public static final byte ASCII_UPPER_CASE_LETTER_START = 65;
  public static final byte ASCII_UPPER_CASE_LETTER_END = 90;
  public static final byte ASCII_LOWER_CASE_LETTER_START = 97;
  public static final byte ASCII_LOWER_CASE_LETTER_END = 122;
  public static final byte ASCII_NUMBER_START = 48;
  public static final byte ASCII_NUMBER_END = 57;

  // Constructor(s)

  /**
   *
   */
  public Alphabet() {
    alphabet=new char[NUM_LETTERS_IN_ALPHABET];
    generateAlphabet();
  } //End Method

  //Mutator Method(s)

  /**
   *
   * @param alphabet
   */
  public void setAlphabet(char[] alphabet) {
    this.alphabet=alphabet;
  } // End Method

  // Accessor Method(s)

  /**
   *
   * @return
   */
  public char[] getAlphabet() {
    return alphabet;
  } // End Method

  /**
   *
   * @param index
   * @return
   */
  public char charAt(int index) {
    return alphabet[index];
  } // End Method

  /**
   *
   * @return
   */
  public String toString() {
    String alphabetAsString = "";
    for(byte i = 0; i < alphabet.length; i++) {
      alphabetAsString=alphabetAsString + alphabet[i];
    } // End For
    return alphabetAsString;
  } //End Method

  /**
   *
   * @return
   */
  public byte getLength() {
    return (byte)alphabet.length;
  } //End Method

  //Custom Method(s)
  
  /**
   * 
   */
  public void setCharAt(int index, char charToSet) {
      alphabet[index] = charToSet;
  }
  
  /**
   *
   */
  public void generateAlphabet() {
    for(byte i = 0; i < NUM_LETTERS_IN_ALPHABET; i++) {
      alphabet[i]=(char)(ASCII_UPPER_CASE_LETTER_START + i);
    } //End For
  } //End Method
  
  /**
   *
   */
  public void printAlphabet() {
    for(byte i = 0; i < alphabet.length; i++) {
      System.out.print(alphabet[i] + " ");
    } //End For
    System.out.print("\n");
  } //End Method
}//End Class