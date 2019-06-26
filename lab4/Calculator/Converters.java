package lab4.Calculator;

public class Converters {


    public  float temperatura (int F) {

        float celsius = 5/9f * (F -32);
        return celsius;

    }

    public  float distantainchtometers(int M){

        float inch = (float)M * (254f/10000f);
        return inch;

    }

    public  float viteza (int d,int h, int m, int s) {

        float metripersecunda = (float)d/((h*3600)+(m*60)+s);
        return metripersecunda;
    }


    public  float viteza2(int d, int h, int m, int s) {


        float kmperora = (d/1000f) / (h+(m/60f)+(s/3600f));
        return kmperora;

    }
    public  float viteza3(float d, float h, float m, float s){

        float mileperora = (d/1609) / (h+(m/60)+(s/3600));
        return mileperora;
    }

}
