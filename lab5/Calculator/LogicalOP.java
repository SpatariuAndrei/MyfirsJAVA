package lab5.Calculator;

public class LogicalOP {


    public int[] getArrayToHundred() {


        int[] myArray = new int[100];
        for (int i = 1; i <= 100; i++) {
            myArray[i - 1] = i;


        }
        return myArray;

    }

    public float getAverageArray(int[] my2Array) {


        float sum = 0;
        for (int i = 0; i < my2Array.length; i++) {
            sum = sum + my2Array[i];


        }
        return (sum / my2Array.length);
    }

    public int [] printEvenArrays(int[] my2Array) {
        for(int i= 1; i<=100; i++) {
           if(i%2==0){
               my2Array[i/2-1]= i;
           }
        }
        return my2Array;

    }

    public int getanotherAverageArray (int [] array1 ) {

        int sum = 0;
        for (int i = 0; i<array1.length; i++ ) {

            sum = sum + array1[i];


        }
        return  sum/array1.length;
    }

    public boolean returnTrueOrFalseArray (String [] array3, String a) {

        for (String element:  array3) {

            if (element.equals(a)) {

                return true;

            }
        }
        return false;


    }

    public boolean returnTrueOrFalseArray2 (String [] array3, String a) {


        boolean found = false;

        for (int i = 0; i<array3.length; i++ ) {

            if (array3[i].equals(a)) {

                found = true;
                break;

            }
        }
        return found;


}

    public int [] returnArrayWithoutA (int [] array4, int a) {

        int array[]= new int[array4.length-1];

        for (int i=0, j=0; i<array4.length; i++) {



            if (array4[i]!=a) {

                array4 [j]=  array[i] ;
                j++;

            }



        }



        return array;


}

}


