package lab7;

public class Calculator {



        public int sum(int firstNumber, int secondNumber) {
            int result = firstNumber + secondNumber; // face operatia de adunare
            return result; // returneaza valoarea adunata
        }

        public float sum(float first, float second) {
            return first + second;
        }



    public  int substraction(int a,int b) {

        int dif = a-b;
        return dif;
    }
    public  double division(double a, double b) {

        double division = a/b;
        return division;



    }

    public  int multiplication (int a, int b) {
        int multip = a*b;
        return multip;

    }

    public  float average(int a, int b) {

        float avg = (a+b)/2f;
        return avg ;
    }
    public  int divisionRemainder(int a, int b){

        int remainder = a%b;
        return remainder;


    }


    ///////////////////////////////////


    public  double temperatureFromFhrToCelsius (double F) {

        double celsius = 5/9d * (F -32);
        return celsius;

    }

    public  float distanceInchToMeters(Float M){

        float inch = (float)M * (254f/10000f);
        return inch;

    }

    public  float viteza (int d,int h, int m, int s) {

        float metripersecunda = (float)d/((h*3600)+(m*60)+s);
        return metripersecunda;
    }


    public  float speedKmPerHour(float d, float h, float m, float s) {


        float kmperora = (d/1000f) / (h+(m/60f)+(s/3600f));
        return kmperora;

    }
    public  float viteza3(float d, float h, float m, float s){

        float mileperora = (d/1609) / (h+(m/60)+(s/3600));
        return mileperora;
    }


}
