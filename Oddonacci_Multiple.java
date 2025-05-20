//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Oddonacci_Multiple {
    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);

       System.out.print("Enter desired oddonacci itteration: ");
       int input = kb.nextInt();
       System.out.print("The number is: " + oddonacci(input));
       kb.close();
    }

    public static int oddonacci(int x){
        if (x == 1 || x == 2 || x == 3){
            return 1;
        }
        else {
            //returns the sum of the previous 3, this code only runs if x > 3
            return oddonacci(x - 1) + oddonacci(x - 2) + oddonacci(x - 3);
        }
    }

}
