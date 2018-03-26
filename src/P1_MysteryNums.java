/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 3/25/2018
*/

/*
 1. Your output prediction:
  I would say that it prints a 15, 42 
  then it will print then 10, (15+10) which would be 10, 25
  
 */

/*
 3. Were you correct? Explain if you were not (what did you learn?)
 I was correct! 
 
 */

public class P1_MysteryNums {

    public static void main(String[] args) {
        int x = 15;
        sentence( x, 42 );
        
        int y = x - 5;
        sentence( y, x + y);
    }
    
    public static void sentence( int num1, int num2 ) {
        System.out.println( num1 + " " + num2 );
    }

}
