import java.util.Scanner;
import java.io.*;

public class Oddonacci_Multiple {
    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);


       System.out.print("Enter desired oddonacci itteration: ");
       int input = kb.nextInt();

       PrintWriter outputStream = null;
       try {
           //set output stream to append
           outputStream = new PrintWriter(new FileOutputStream("OddoOutMultiple.txt"));
           outputStream.println("Java Runtime test file");
           for (int i = 1; i <= input; ){

               //compute the time in ns that the oddonacci program takes
               long start = System.nanoTime();
               int value = oddonacci(i);
               long end = System.nanoTime();
               long duration  = (end - start)/1000000;
               System.out.println(duration);

               if (duration < 5000) {
                   outputStream.println("Itteration: " + i + ", Oddo Value: " + value + ", System Time: " + duration + " milliseconds");
               }

               if (duration >= 5000 && duration <= 60000){
                   duration = duration/1000;
                   outputStream.println("Itteration: " + i + ", Oddo Value: " + value + ", System Time: " + duration + " seconds");
               }

               if (duration >= 60000){
                   duration = duration/60000;
                   outputStream.println("Itteration: " + i + ", Oddo Value: " + value + ", System Time: " + duration + " minutes");
               }
               //increment i by 5;
               i += 2;
           }
           outputStream.println("Notice past itteration 45, the code becomes exponentially long and unfeasable to run");
       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       }
       finally{
           outputStream.close();
       }

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
