package lab7;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
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


            }

        }

        while (repeat);
            return x;





        }

    public float getFloat () {

        Scanner scan1 = new Scanner(System.in);


        boolean repeat;

        float y =0.0f;
        do {

            try {
                y = scan1.nextFloat();
                repeat = false;


            }catch (InputMismatchException error){

                repeat = true;
                System.out.println("Not a number, try again");


            }

        }

        while (repeat);
        return y;



    }
    public double getDouble () {

        Scanner scan2 = new Scanner(System.in);


        boolean repeat;

        double z = 0.000d;
        do {

            try {
                z = scan2.nextDouble();
                repeat = false;


            }catch (InputMismatchException error){

                repeat = true;
                System.out.println("Not a number, try again");


            }

        }

        while (repeat);
        return z;




    }

    public long getLong () {

        Scanner scan3 = new Scanner(System.in);


        boolean repeat;

        long l = 0;
        do {

            try {
                l = scan3.nextLong();
                repeat = false;


            }catch (InputMismatchException error){

                repeat = true;
                System.out.println("Not a number, try again");


            }

        }

        while (repeat);
        return l;




    }
    public static void main(String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
}




}
public List<Integer> printListFromKeyboard (){

        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Insert List numbers: ");
        try {
            while (scan.hasNextInt()){
                list.add(scan.nextInt());



            }

        }catch (InputMismatchException e){

            System.out.print(list);
        }
    return list;
}
}