/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 3/25/2018
*/

public class P8_NumberPrinter {

	public static void main(String[] args) {
		PrintNums(5);
		System.out.println();
		PrintNumsTwo(5,2);
	}

	public static void PrintNums(int nums) {
		nums = (nums+1);
		for (int i = 1; i < nums; i++) {
			System.out.print("["+i+"] ");
		}
	}


//PrintNums but with a second parameter that counts by that many per
	public static void PrintNumsTwo(int nums, int increment) {
		nums = (nums+1);
		for (int i = 1; i < nums; i += increment) {
			System.out.print("["+i+"] ");
		}
	}	

}


/*
OUTPUT
[1] [2] [3] [4] [5] 
[1] [3] [5] 

*/
