package Lab3.Calculator;

import java.awt.desktop.SystemSleepEvent;
import java.security.PublicKey;

public class Main {

    //

    public static void main(String[] args) {
        Calculator Calc = new Calculator();


        System.out.println(Calc.sum(2,8));
        System.out.println(Calc.substraction(2,8));
        System.out.println(Calc.division(2,8));
        System.out.println(Calc.multiplication(2,8));
        System.out.println(Calc.average(2,8,6));
        System.out.println(Calc.restulImpartirii(46,9));

        Converters Conv = new Converters();

        System.out.println(Conv.temperatura(24));
        System.out.println(Conv.distantainchtometers(22));
        System.out.println(Conv.viteza(10000,1,10,10));
        System.out.println(Conv.viteza2(10000,1,10,10));
        System.out.println(Conv.viteza3(10000,1,10,10));

        LogicalOP LogOp = new LogicalOP();



        System.out.println("The Bigger number is:  " + LogOp.CheckBiggerNumber(12,18));

        System.out.println(LogOp.TextComparison("Learning text comparison","Got to try some more"));
        System.out.println(LogOp.TextVsInt("FastTrackIT", 9));
        System.out.println(LogOp.SnowInCm(9));
        System.out.println(LogOp.NUMBERCOMPARISON(1111111111));
        System.out.println((LogOp.IsNumberEven(-8)));
        System.out.println(LogOp.isEligibleToVote(17));
        System.out.println(LogOp.WhichIsBigger(2,7,55));



        Patterns patt = new Patterns();
        patt.JavaDesign();
        patt.JavaDesign2();


    }



    }


