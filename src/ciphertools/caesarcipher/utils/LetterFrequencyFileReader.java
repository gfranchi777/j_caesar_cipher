package ciphertools.caesarcipher.utils;

import java.io.*;

public class LetterFrequencyFileReader {
  //Instance Variable(s)
  private BufferedReader bufferedReader;
  private File inputFile;

  //Constructor(s)

  public LetterFrequencyFileReader() {

  } //End Method

  public boolean openFile(String inputFilePath) {
    boolean isOpen = false;

    try {
      inputFile = new File(inputFilePath);
    } catch (NullPointerException exc) {
      System.out.println("File: " + inputFilePath + " does not exist.");
    } //End Try/Catch

    return isOpen;
  } //End Method

  public boolean openStream() {
    boolean isOpen = false;

    try {
      bufferedReader = new BufferedReader(new FileReader(inputFile));
    } catch (IOException exc) {
      System.out.println(exc.getMessage());
    } //End Try/Catch

    return isOpen;
  } //End Method

  public boolean closeStream() {
    boolean isClosed = false;

    try {
      bufferedReader.close();
      isClosed = true;
    } catch (IOException exc) {
      System.out.println(exc.getMessage());
    } //End Try/Catch

    return isClosed;
  } //End Method
}//End Class