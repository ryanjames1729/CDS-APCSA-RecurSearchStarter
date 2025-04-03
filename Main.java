// Recursive Search Starter    A+CR
import java.util.ArrayList;

class Main {

	public static int binarySearch(int[] arr, int left, int right, int target){
      //complete the method using recursion in an array of int values

	}

  public static int binarySearch1(ArrayList<String> myList, int left, int right, String target){
      //complete the method using recursion in an ArrayList of String objects
      
	}


  public static void main(String[] args) {

    int[] numberList = {1, 13, 17, 19, 23, 29, 31, 37, 41};

    int result = binarySearch(numberList, 0, 8, 13);
		System.out.println(result);
		result = binarySearch(numberList, 0, 8, 41);
		System.out.println(result);
		result = binarySearch(numberList, 0, 8, 8);
		System.out.println(result);


		ArrayList<String> wordList = new ArrayList<String>();
		wordList.add("bird");
		wordList.add("cat");
		wordList.add("dog");
		wordList.add("fish");
		wordList.add("hamster");
		wordList.add("lizard");
		wordList.add("snake");

		//add new test cases for binarySearch1

  }
}