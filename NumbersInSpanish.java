public class NumbersInSpanish {
    public static void main(String[] args) {
       // read the first argument passed to the program
       int number = Integer.parseInt(args[0]); 
 
       // delete the line below and replace with your code
    
        // Using switch
     switch(number) {
        case 1:
           System.out.println( "uno" ); break; // don't forget the break after each case!
        case 2:
           System.out.println( "dos" ); break;
        case 3:
           System.out.println( "tres" ); break; // don't forget the break after each case!
        case 4:
           System.out.println( "quatro" ); break;
        case 5:
           System.out.println( "cinco" ); break;
        default: System.out.println( "not in valid range" );
}
    }

 }