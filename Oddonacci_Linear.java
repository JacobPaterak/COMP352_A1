import java.io.*;
import java.util.*;
public class Oddonacci_Linear {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        // start off with 1, 1, 1, then the next number is the addition of the last 3
        BufferedWriter bw  = new BufferedWriter( new FileWriter("OddoOut.txt"));
        for(int i = 5; i<= 200; i = i+5)
        {
            try {
                long start = System.nanoTime();
                int value = Oddonacci(i)[0];
                long end = System.nanoTime();
                long time = end - start;
                bw.write("" + value + " and took " + time + "ms");
                bw.newLine();

            }
            catch(Exception e){

            }
            finally{

            }
        }
    bw.close();
    }


    public static int[] Oddonacci(int x) {
        //creates an array to store previous values
        int[] a = new int[3];
        int i = 0;
        int j = 0;
        int k = 0;
        //base case
        if(x==1 || x==2 || x==3 ) {
            //assigns the starting values
            a[0] = 1;
            a[1] = 1;
            a[2] = 1;
            //returns the array with the previous values of Oddonacci
            return a;
        }
        //x>3
        else{
            //gets array of previous value of Oddonacci
            a = Oddonacci(x-1);
            //value at x-1
            i = a[0];
            //values at x-2
            j = a[1];
            //values at x-3
            k = a[2];
            // value at given x
            int next = i + j + k;
            //assinging back to array value at x, x-1, x-2
            a[0] = next;
            a[1] = i;
            a[2] = j;
            //returns array
            return (a);
        }

    }
}

