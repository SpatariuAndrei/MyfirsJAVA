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

        }






















