package lab6.Calculator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {



//        int x =4;
//        Integer y = 4;
////
//        List<Integer> myList = new ArrayList<>();
//        myList.add(3); // adaug valoarea 3 la final de lista
//        myList.set(2,3); // adaug pe pozitia 2(3) valoarea 3
//        myList.remove(2);// sterg pozitia 2
//        myList.clear(); // golesc toata lista
//        myList.size(); // returneaza marimea listei
//
//        List<String> myStrings = new ArrayList<>();
//        myStrings.add("ceva");
//        myStrings.add("ceva");
//        myStrings.set(2, "altceva");

        public static void main(String[] args) {



            LogicalOP lab6 = new LogicalOP();


          List<Integer> list22 = new ArrayList<>();
          list22.add(22);
          list22.add(33);
          list22.add(15);


         // lab6.getListHundred(list22);




        List<Float> mList = new ArrayList<>();
        mList.add(0, 22f);
        mList.add(1,44f);
            mList.add(2,55f);
            mList.add(3,33f);
            mList.add(4,15f);

            //lab6.getListWithParameter(mList, 23f);
       //System.out.println(mList);

            List<Integer> mList1 = new ArrayList<>();
            mList1.add(14);
            mList1.add(15);
            mList1.add(16);
            mList1.add(17);
            mList1.add(18);
            mList1.add(1);


            //lab6.getParameterFirstThenList(mList1,99);
         //  System.out.println(mList1);



           List<Integer> l = new ArrayList<>();
           l.add(13);
           l.add(15);
           l.add(144);
           l.add(133);
           l.add(122);
          // System.out.println(lab6.getListBackwards(l));

           List<String> list12 = new ArrayList<>();

           list12.add("1234");
           list12.add("Ancuta");
           list12.add("Andrei");
           list12.add("CCC");
          // System.out.println(lab6.putStringAtParameterPosition(list12,  "BlaBla", 2));

            List<Integer> list = new ArrayList<>();

            list.add(11);
            list.add(33);
            list.add(22);
            list.add(444);
            list.add(55);

          // System.out.println("Max is:  " + lab6.findMaxInList(list));

            List<Integer> list32 = new ArrayList<>();
            list32.add(23);
            list32.add(22);
            list32.add(32);
            list32.add(2);
           // lab6.printIndexAndParameter(list32);

            List<String> myList = new ArrayList<>();
            myList.add("A");
            myList.add("odata");
            myList.add("fost");
            myList.add("ca-n");
            myList.add("povesti....");

          // lab6.swapTwoElementsInAList(myList);
            List<Integer> lll = new ArrayList<>();
            lll.add(12);
            lll.add(13);
            lll.add(14);
            lll.add(15);

           //System.out.println(lab6.printEvenList(lll));


}

}




