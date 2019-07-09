package lab5.Calculator;

public class Main {




        public static void main(String[] args) {

            LogicalOP lab5  = new LogicalOP();
            int [] myArray = lab5.getArrayToHundred();
            for (int i=0; i< myArray.length; i++) {


            }

            int[] evenNumbers = new int[55];
            evenNumbers = lab5.printEvenArrays(evenNumbers);
            for (int i= 0; i< evenNumbers.length; i++) {


                System.out.println(evenNumbers[i]);
            }

            String [] strings = new String[] {"aaa", "333", "RRR"};
            String a = "CCC";
            System.out.println(lab5.returnTrueOrFalseArray(strings, a));



            }

        }






