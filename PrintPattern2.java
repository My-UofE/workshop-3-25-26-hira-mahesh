import java.util.Scanner;

public class PrintPattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number between 1 & 5");
        int num = in.nextInt();
        int size = 2 * num;
        while(num<1)
            {
                System.out.println("too small!");
                System.out.println("enter number between 1 & 5");
                num = in.nextInt();
                size = 2 * num;
            }
        while(num>5)
            {
                System.out.println("too big!");
                System.out.println("enter number between 1 & 5");
                num = in.nextInt();
                size = 2 * num;
            }
        for(int i =0;i<size;i++)
            {
            int start = (i < num) ? i + 1 : size - i;

            
            for (int j = 0; j < num; j++) {
                System.out.print(start + j);
            }

          
            for (int j = num - 1; j >= 0; j--) {
                System.out.print(start + j);
            }
                System.out.println();
            }
        in.close();
    }
}
