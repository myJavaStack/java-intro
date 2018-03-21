


public class Arrays {

    // class variables go here
    // should always be private
    private int [] myList;
    
    /**
     * Constructor for now just make sure you have one that looks like this
     */
    public Arrays() {
        super();
    }

    /**
     * Here is out work area for now
     */
    public void perform() {
        
        //1.	Creating an integer array called myList with size of 10. 
        myList = new int [10];
        
        //2.	Initializing the array with random values between 0 and 10 by using Math.random(),
        for (int i = 0; i < myList.length; i++) {
            myList[i] = (int) (Math.random() * 10);
          }
        
        //printing the array
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
          }
        System.out.println();
        //3.	Summing all elements
        int total = 0;
        for (int i = 0; i < myList.length; i++) {
          total += myList[i];
        }
        
        // printing the result
        System.out.println("Sum is: " + total);
        
        //4.	Finding the largest element
        int max = myList[0];
        for (int i = 1; i < myList.length; i++) {
          if (myList[i] > max) max = myList[i];
        }
        
        // printing the result
        System.out.println("Max is: " + max);
        
        //5.	Shifting elements
        int temp = myList[0]; // Retain the first element

        // Shift elements left
        for (int i = 1; i < myList.length; i++) {
          myList[i - 1] = myList[i];
        }

        // Move the first element to fill in the last position
        myList[myList.length - 1] = temp;
        
        //printing the array
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
          }
        System.out.println();        
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
        Arrays myArray = new Arrays();
        // Call the method that runs the show
        myArray.perform();
        // End the program
        System.exit(0);
    }
}

