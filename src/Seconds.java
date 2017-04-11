import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seconds {

  public static void main(String[] args) {
    // Create a function that takes a list as a parameter,
    // and returns a new list with every second element from the orignal list
    // example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result

    List<Integer> exampleInput = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    List<Integer> outputOfExample = getEverySecondElement(exampleInput);

    System.out.println(outputOfExample.toString());
  }

  private static List<Integer> getEverySecondElement(List<Integer> inputList) {
    List<Integer> outputList = new ArrayList<>();
    for (int i = 0; i < inputList.size(); i++) {
      if (i % 2 != 0) {
        outputList.add(inputList.get(i));
      }
    }
    return outputList;
  }
}
