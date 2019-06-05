package lab2.Calculator;

public class Main {

    //

    public static void main(String[] args) {
        int adunare = sum(2,8);
        int scadere = substraction(2,8);
        double impartire = division (2, 8);
        int inmultire = multiplication(2,8);
        float media = average(3,4,6);
        int rest = restulImpartirii(47,9);
        float celsius = temperatura(24);
        float inch = distantainchtometers(22);
        float metripersecunda = viteza(10000,1,10,10);
        float kmperora = viteza2(10000, 1,10,10);
        float mileperora = viteza3(10000,1,10,10);


        System.out.println("Rezultatul adunarii este:" + adunare);
        System.out.println("Rezultatul scaderii este:"+scadere);
        System.out.println("Rezultatul impartirii este:"+impartire);
        System.out.println("Rezultatul inmultirii este:"+inmultire);
        System.out.println("Exercitiul 6: " + rest);
        System.out.println("Exercitiul 4: " + media);
        System.out.println("Exercitiul 7: " +celsius);
        System.out.println("Exercitiul 8: " +inch);
        System.out.println("Exercitiul 9: " + metripersecunda);
        System.out.println("Exercitiul 9: " + kmperora);
        System.out.println("Exercitiul 9: "+mileperora);

        System.out.println("    J     a    v     v    a");
        System.out.println("    J    a a    v   v    a a");
        System.out.println(" J  J   aaaaa    V V    aaaaa");
        System.out.println("  JJ   a     a    V    a     a");



        System.out.println();
        System.out.println();



        System.out.println("   +'''''+    ");
        System.out.println(" [ I o o I ]  ");
        System.out.println("   I  ^  I    ");
        System.out.println("   I     I    ");
        System.out.println("   I '-' I    ");
        System.out.println("   +-----+    ");


    }

    public static int sum(int a,int b) {



        int adunare  = a+b;

        return adunare;
    }

    public static int substraction(int a,int b) {

    int scadere = a-b;
    return scadere;
    }


        public static double division(double a, double b) {

        double impartire = a/b;
        return impartire;



    }

    public static int multiplication (int a, int b) {
        int inmultire = a*b;
        return inmultire;



    }

    public static float average(int a, int b, int c) {

        float media = (a+b+c)/3f;
        return media ;
    }

    public static int restulImpartirii(int a, int b){

        int rest = a%b;
        return rest;


    }
    public static float temperatura (int F) {

    float celsius = 5/9f * (F -32);
    return celsius;

    }

    public static float distantainchtometers(int M){

        float inch = (float)M * (254f/10000f);
        return inch;


    }

    public static float viteza (int d,int h, int m, int s) {

        float metripersecunda = (float)d/((h*3600)+(m*60)+s);
        return metripersecunda;
    }

     public static float viteza2(int d, int h, int m, int s) {


        float kmperora = (d/1000f) / (h+(m/60f)+(s/3600f));
        return kmperora;

     }

     public static float viteza3(float d, float h, float m, float s){

        float mileperora = (d/1609) / (h+(m/60)+(s/3600));
        return mileperora;
        }
}
