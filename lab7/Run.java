package lab7;

public class Run {

    private Read read = new Read();
    private Calculator calc = new Calculator();






    private void printOperations() {
        System.out.println("Hello!\n" +
                "Please select a value from the menu:\n" +
                "1. Sum\n" +
                "2. Difference\n" +
                "3. Multiply\n"   +
                "4. Division\n"   +
                "5. Average\n"    +
                "6. DivisionRemainder\n" +
                "7. Celsius To Fahrenheit convertor \n"  +
                "8. Inch to meters convertor \n" +
                "9. Speed in km/hours convertor \n" +
                "0. EXIT PROGRAM ");


    }







    private boolean selectItemFromMenu() {
        System.out.print("Please select menu number: ");
        int numberFromUser = read.getInt();
        switch (numberFromUser) {
            case 1:
                sum();
                return true;
            case 2:
                difference();
                return true;
            case 3:
                multiplication();
                return true;
            case 4:
                division();
                return true;
            case 5:
                average();
                return true;
            case 6:
                divisionRemainder();
                return true;
            case 7:
                temperatureFromFhrToCelsius();
                return true;
            case 8:
                distanceInchToMeters();
                return true;
            case 9:
                speedKmPerHour();
                return true;

            case 0:
                System.out.println("Bye!");
                return false;
            default:

                System.out.println("Try again!");
                return true;

        }

    }



    public void runProgram() {
        do {
            printOperations();

        } while (selectItemFromMenu());
    }


    private void sum() {
        System.out.print("Please enter the first number: ");
        int first = read.getInt();
        System.out.print("Please enter the second number: ");
        int second = read.getInt();
        System.out.println("The sum is: " +
                calc.sum(first, second));
    }

    private void difference() {
        System.out.print("Please enter the first number: ");
        int first = read.getInt();
        System.out.print("Please enter the second number: ");
        int second = read.getInt();
        System.out.println("The difference is: " +
                calc.substraction(first, second));
    }

    private void multiplication() {

        System.out.print("Please enter the first number: ");
        int first = read.getInt();
        System.out.print("Please enter the second number: ");
        int second = read.getInt();
        System.out.println("The result is: " +
                calc.multiplication(first, second));


    }
    private void division () {

        System.out.print("Please enter the first number: ");
        int first = read.getInt();
        System.out.print("Please enter the second number: ");
        int second = read.getInt();
        System.out.println("The result is: " +
                calc.division(first, second));

}
    private void average () {

        System.out.print("Please enter the first number: ");
        int first = read.getInt();
        System.out.print("Please enter the second number: ");
        int second = read.getInt();
        System.out.println("The average is: " +
                calc.average(first, second));
}

    private void divisionRemainder () {

        System.out.print("Please enter the first number: ");
        int first = read.getInt();
        System.out.print("Please enter the second number: ");
        int second = read.getInt();
        System.out.println("The remainder is: " +
                calc.divisionRemainder(first, second));

}
    private void temperatureFromFhrToCelsius () {

        System.out.print("Please enter Fahrenheit Temperature: ");
        double first = read.getInt();
        System.out.println("The Celsius temperature is: " +
                calc.temperatureFromFhrToCelsius(first));
}

    private void distanceInchToMeters () {

        System.out.print("Please enter distance in inch: ");
        float first = read.getInt();
        System.out.println("The distance in meters  is: " +
                calc.distanceInchToMeters(first));
    }
    private void speedKmPerHour () {

        System.out.print("Please enter distance in meters: ");
        float first = read.getInt();
        System.out.print("Please enter hours: ");
        float second = read.getInt();
        System.out.print("Please enter minutes:  ");
        float third = read.getInt();
        System.out.print("Please enter seconds: ");
        float fourth = read.getInt();
        System.out.println("The speed is: " +
                calc.speedKmPerHour(first,second,third,fourth));
        }
}

