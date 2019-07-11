package lab6.Calculator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public  class LogicalOP {


    public void  getListHundred (List <Integer> list22){


            for (int i= 0; i<list22.size(); i++) {


                System.out.println(list22.get(i));
            }



        }

        public void getListWithParameter  (List <Float> mList, float myNum){
        mList.add(myNum);


        }


    public List<Integer> getParameterFirstThenList (List<Integer> mList1, int myNum1){



        mList1.add(0,myNum1);{



            mList1.add(0,myNum1);
            return mList1;
        }

    }


    public List<Integer> getListBackwards ( List<Integer> l ){

       Collections.reverse(l);


        return l;

        }



        // Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de
    // String-uri, unul de tip intreg, si unul de tip String. Metoda sa adauge parametrul de
    // tip String in lista primita, iar parametrul de tip intreg reprezinta pozitia la care
    // sa fie pus acel String.


        public List <String> putStringAtParameterPosition (List<String> list12 , String position, int a)  {


            list12.add(a,position);
            return list12;

    }
        //Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.

        public Integer findMaxInList (List<Integer> list) {

            return Collections.max(list);
    }

        public void printIndexAndParameter (List<Integer> list32 ) {


        for (int i=0; i<list32.size();i++) {


           list32.get(i);
           int a= list32.get(i);
           System.out.println(" Pe pozitia " +  i + " este valoarea " + a);


    }



}
        public void swapTwoElementsInAList (List<String> myList) {
        Collections.swap(myList, 1,2);
        System.out.println(myList);




        }
        public List<Integer> printEvenList (List<Integer> myList1) {


            List<Integer> lll = new ArrayList<>();
            for (int i= 0; i<myList1.size();i++){

               myList1.get(i);
            if(myList1.get(i)%2==0) {

                lll.add(myList1.get(i));







            }

            }
            return lll;

        }

   // Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista, iar celalalt un numar intreg.
    //Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista,
    //fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.

  //  public  List<Integer> printFromParameter (List<Integer> muList, int a) {

      //  List<Integer> lll = new ArrayList<>();

        //for (int element:muList){

          //  muList.get(element);



         //   }



        //}

   // }
}










