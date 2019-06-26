package lab4.Calculator;

import java.util.Scanner;

public class LogicalOP {

    public int CheckBiggerNumber(int a, int b) {

        if (a > b) {

            return a;
        } else {
            return b;
        }

    }


    public String TextComparison(String a, String b) {

        String word = "FastTrackIT";
        String word1 = "FastTrackit";

        if (word1.equals(word)) {
            return a;
        } else {
            return b;


        }


    }

    public String TextVsInt(String a, int b) {

        if (a.equals("FastTrackIT") && b <= 3) {
            return a + b;
        }
        if (!a.equals("FastTrackIT") && b >= 4) {

            return b + a;
        } else {


            return ("None of the conditions are fulfilled");
        }


    }

    public String SnowInCm(int a) {

        if (a > 8 || a == 6) {

            return ("The amount of snow this winter was(cm):") + a;
        } else {
            return ("The forecast snow is(cm)):") + a;
        }


    }

    public String NUMBERCOMPARISON(int a) {

        if (a > 3 && a != 4) {

            return ("The number is greater than 3 and not equal to 4");

        }
        if (a == 4) {
            return "The number is equal to 4";

        }
        if (a < 3) {

            return ("The number is lower than 3");
        } else {
            return "The number IS 3";

        }
    }
        public boolean IsNumberEven (int x)

    {
        if (x%2 ==0)
    {
        return true;
    }    else {
            return false;
        }



}
        public Boolean isEligibleToVote ( int x) {

        if (x>=18) {
            return (true);}
        else { return (false);


        }


        }


        public int WhichIsBigger (int a,int b, int c) {

            if (a > b && a > c) {
                return a;

            }
            else if (b>a && b>c) {

                return b;
            }
            else return c;


            }
        public void printToHundred(int number){

        for (int i = number; i<= 100; i++) {
            System.out.println(i);

        }

        }

        public void printSumAndAverage() {

       int sum= 0;
        for (int i=1; i<=100; i++) {

            sum += i;
            System.out.println(sum);
            System.out.println("Average is: " + (sum/100f));
        }


        }
        public void printBackwards (int num) {
        for (int i= num; i>= -100;i--){

            System.out.println(i);

        }


        }
        public void printSumAndAverageWhile () {
        int sum =0;
        int i = 1;
        while (i<=100) {

            sum += i;
            i++;

            }
            System.out.println(sum);
            System.out.println("Average is: " + (sum/100f));}


            public void printFromAtoB (int a, int b){
        for (int i = a; i<= b; i++) {
            System.out.println(i);
        }

            }

        public void printOddNumbers (){

        for (int i=1; i<=100;i++ ){

            if (i%2!=0  ){
                System.out.println(i);
            }


        }

        }
    public void printEvenNumbers (){

        for (int i=1; i<=100;i++ ){

            if (i%2==0  ){
                System.out.println(i);
            }


        }

    }
    public void printSum() {

        int sum= 0;
        for (int i=77; i<100;i++) {

            sum += i;


    }
        System.out.println(sum);
    }
    public void  printStars(int a){


        for (int i=7; i>= a; i--){

            for (int j= 1; j<=i; j++) {

            System.out.print("*");


            }
                System.out.println();
        }
    }

    public void printCountTo100() {
        int a = 97;
        while (a<=100){

            System.out.println(a);
    a++;

        }


    }
public void printCountBackwards () {
        int a = -97;
        while(a>=-100){

            System.out.println(a);
            a--;
        }

}
public void printFromAtoBwhile() {

        int a = 22;
        int b = 17;

        while (a<b){
            System.out.println(a);
            a++;

        }
        while (a>=b) {
            System.out.println(b);
            b++;
        }

}
public void prinOddNumbersWhile(){
        int i=1;

        while (i<=100){



                System.out.println(i);
                i=i+2;

            }


            }
    public void prinEvenNumbersWhile(){
        int i=0;

        while (i<=100){



            System.out.println(i);
            i++;
            i=i+1;

        }}
public void printCountMethod(){

        int sum= 0;
        int a = 111;

        while (a<=8899){

            sum +=a;
            a++;
        }
    System.out.println(sum);

        }







}
































