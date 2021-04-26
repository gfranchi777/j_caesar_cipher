package ciphertools.caesarcipher.utils;

public class EnglishLetterFrequency extends LetterFrequencyTable {
  //Instance Variable(s)
  private LetterFrequencyFileReader fileReader;
  private String[][] englishLetterFrequencyTable;

  //Class Constant(s)
  public static final String INPUT_FILE =
    "../resources/" + "EnglishLanguageLetterFrequency.txt";

  //Constructor(s)

  /**
   *
   */
  public EnglishLetterFrequency() {
    fileReader = new LetterFrequencyFileReader();
    if (fileReader.openFile(INPUT_FILE)) {
      if (fileReader.openStream()) {
        setLetterFrequencyTable(fileReader, englishLetterFrequencyTable);
        fileReader.closeStream();
      } //End If
    } //End If
  } //End Method
}//End Class