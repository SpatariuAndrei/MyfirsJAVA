package lab7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Read {

    public int getInt () {

        Scanner scan = new Scanner(System.in);


        boolean repeat;

        int x = 0;
        do {

            try {
                 x = scan.nextInt();
                repeat = false;


            }catch (InputMismatchException error){

                repeat = true;
                System.out.println("Not a number, try again");
                break;

            }

        }

        while (repeat);
            return x;





        }

        }




