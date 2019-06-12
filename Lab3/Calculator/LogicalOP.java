package Lab3.Calculator;

import lab2.Calculator.IfElseSwitch;

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

    public String TextVsInt (String a, int b) {

        if (a.equals("FastTrackIT") && b <= 3) {
            return a + b;
        }
        if (!a.equals("FastTrackIT") && b>= 4 ) {

            return b+ a;
        }
        else {


                return ("None of the conditions are fulfilled");
            }


        }
    }









