
import java.util.ArrayList;






public class UsingArrayLists {

    // class variables go here
    // should always be private
    private ArrayList<Integer> myList;
    
    /**
     * Constructor for now just make sure you have one that looks like this
     */
    public UsingArrayLists() {
        super();
    }

    /**
     * Here is out work area for now
     */
    public void perform() {
        
        //1.	Creating an ArrayList. 
        myList = new ArrayList <Integer>();
        
        //2.	Adding 10 random values between 0 and 10 by using Math.random(),
        for (int i = 0; i < 10; i++) {
            myList.add((int) (Math.random() * 10));
          }
        
        //printing the ArrayList
        System.out.println(myList);
        
        //3.	Summing all elements
        int total = 0;
        for (int i = 0; i < myList.size(); i++) {
          total += myList.get(i);
        }
        
        // printing the result
        System.out.println("Sum is: " + total);
        
        //4.	Finding the largest element
        int max = myList.get(0);
        for (int i = 1; i < myList.size(); i++) {
          if (myList.get(i) > max) max = myList.get(i);
        }
        
        // printing the result
        System.out.println("Max is: " + max);
        
        //5.	Shifting elements
        int temp = myList.get(0); // Retain the first element

        // Shift elements left
        for (int i = 1; i < myList.size(); i++) {
          myList.set(i-1, myList.get(i));
        }

        // Move the first element to fill in the last position
        myList.set(myList.size()-1, temp);
        
        //printing the ArrayList
        System.out.println(myList);      
    }

    /**
     * The main method is where a program starts. While you can write any code
     * that you want in the main method you should not. This method just gets
     * the ball rolling and waits for the program to end.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Instantiate the first or primary object
        UsingArrayLists myArray = new UsingArrayLists();
        // Call the method that runs the show
        myArray.perform();
        // End the program
        System.exit(0);
    }
}


