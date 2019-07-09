package lab5.Calculator;

public class Calculator {

    public  int sum(int a,int b) {



        int adunare  = a+b;

        return adunare;

    }

    public  int substraction(int a,int b) {

        int scadere = a-b;
        return scadere;
    }
    public  double division(double a, double b) {

        double impartire = a/b;
        return impartire;



    }

    public  int multiplication (int a, int b) {
        int inmultire = a*b;
        return inmultire;

    }

    public  float average(int a, int b, int c) {

        float media = (a+b+c)/3f;
        return media ;
    }
    public  int restulImpartirii(int a, int b){

        int rest = a%b;
        return rest;


    }
}
