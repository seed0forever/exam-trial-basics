package countas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountAs {

  public static void main(String[] args) {
    // Create a function that takes a filename as string parameter,
    // counts the occurances of the letter "a", and returns it as a number.
    // If the file does not exist, the function should return 0 and not break.

    // example: on the input "afile.txt" the function should return 28 - print this result
    // example: on the input "not-a-file" the function should return 0 - print this result

    final String FILE_PATH_EXIST = "countas/afile.txt";
    final String FILE_PATH_NOT_EXIST = "countas/not-a-file";
    int exampleOutValid;
    int exampleOutInvalid;

    exampleOutValid = countCharA(FILE_PATH_EXIST);
    System.out.println(exampleOutValid);
    exampleOutInvalid = countCharA(FILE_PATH_NOT_EXIST);
    System.out.println(exampleOutInvalid);
  }

  private static int countCharA(String filename) {
    char charToCount = 'a';
    int numOfCharA = 0;
    try {
      Path filePath = Paths.get(filename);
      List<String> lines = Files.readAllLines(filePath);
      for (String l : lines) {
        for (int i = 0; i < l.length(); i++) {
          if (l.toLowerCase().charAt(i) == charToCount) {
            numOfCharA++;
          }
        }
      }
    } catch (IOException e) {
    }
    return numOfCharA;
  }
}
