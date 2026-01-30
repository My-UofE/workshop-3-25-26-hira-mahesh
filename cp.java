import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class AverageSquares.java {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        // Prompt for input
        //System.out.print("Enter your name: ");

        // Read in line from standard input
        //String name = in.nextLine();

        //System.out.println("Hi " + name + "!");


        System.out.print("Please enter the start value: ");
        int startNum = in.nextInt(); // Reads in an int from standard input
        in.nextLine();
        System.out.print("Please enter the end value: ");
        int temp =0;
        int endNum = in.nextInt();
        int i = startNum;
        while (i < endNum+1) {
            temp = temp +(i*i);
            i++;
        }
        System.out.println("Sum of squares from " + startNum + " to " + endNum+ ":");
        System.out.println(temp);
        //System.out.println("You entered: " + startNum + " and " + endNum);
    }
}