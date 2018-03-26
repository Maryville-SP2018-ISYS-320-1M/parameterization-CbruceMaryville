/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 3/25/2018
*/

/*
 4. Your output prediction:
  touch your eye to head
  touch your head to eye
  touch your shoulders to elbow
  touch your eyes and ears to eyes and ears 
  touch your toes to toes
  touch your shoulders to knees to your toes
  
 */

/*
 6. Were you correct? Explain if you were not (what did you learn?)
 I was correct but that was tedious and tricky what I just went through! Naming variables is very important!
 
 */

public class P4_MysteryTouch {

	  public static void main(String[] args) {
	        String head = "shoulders";
	        String knees = "toes"; 
	        String elbow = "head";
	        String eye = "eyes and ears";
	        String ear = "eye"; 
	        
	        touch(ear, elbow);
	        touch(elbow, ear); 
	        touch(head, "elbow"); 
	        touch(eye, eye);
	        touch(knees, "Toes"); 
	        touch(head, "knees " + knees );
	    }
	    
	    public static void touch(String elbow, String ear) { 
	        System.out.println( "touch your " + elbow + " to your " + ear );
	    }

}
