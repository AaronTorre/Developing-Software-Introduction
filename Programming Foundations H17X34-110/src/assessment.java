import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class assessment {
    public static void arrayTask1(){
        Random rand = new Random(100);
        int[] array = new int[15];
        for (int i = 0; i <array.length ; i++) {
            array[i] = rand.nextInt(256);
        }
        System.out.println("Scenario. A series of files has different whole-number sizes in megabytes. The program must identify the largest file size.\n" +
                "\n");
        System.out.println("This is the array \n"+Arrays.toString(array));
        System.out.println("This largest file size is : " +maximum(array) +" MB");

    }
    public static void arrayTask2(){
        Random rand = new Random(100);
        double[] array = new double[15];
        for (int i = 0; i <array.length ; i++) {
            array[i] = rand.nextInt(256);
        }
        System.out.println("Scenario. A series of files has different whole-number sizes in megabytes. Report how many files there are, the total storage used and the average file size.\n" +
                "\n");
        System.out.printf("This is the average size of files: %.4f%n", average(array));
        System.out.println("There are " +total(array) +" files.");


    }

    public static void doubleArray(){
        Random rand = new Random(100);
        double[] array = new double[15];
        double minimum = 10.0;
        double maximum = 30.0;
        double value = minimum + rand.nextDouble() * (maximum - minimum);

        for (int i = 0; i <array.length ; i++) {
            array[i] = rand.nextDouble() * (maximum - minimum) + minimum;

        }

        System.out.println("Scenario. Fifteen calculation times are stored as milliseconds. Display them in ascending order, so the lowest/fastest time appears first.\n");
        System.out.println();
        System.out.println("This is the array \n" + Arrays.toString(array));
        Arrays.sort(array);

        System.out.println("\nThis is the array sorted in ascending order and to 2decimal points:");
        printArray(array);



    }
    public static void printArray(double[] array) {
        System.out.print("[");

        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.printf("%.2f", array[i]);
        }

        System.out.println("]");
    }


    public static int maximum(int[] array){
        int maximum= array[0];
        for(int value : array){
            if(value > maximum){
                maximum = value;
            }
        }
        return maximum;
    }
    public static double total(double[] array){
        int total = 0;
        for(double value : array){
            total += value;

        }
        return total;
    }

    public static double average(double[] array){
        double average = 0;
        for(double value : array){
            average += value;
        }
        return average / array.length;
    }

    public static String userName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String firstName = input.nextLine();
        System.out.println("Please enter your lastName: ");
        String lastName = input.nextLine();
        if(!lastName.isEmpty()){
            lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
            // takes the first letter from the lastname and converts it into uppercase
            // then appends it to the rest of the lastname
        }
        String userName = String.valueOf(firstName.toUpperCase().charAt(0) + lastName);
        // ONLY takes the first character from firstName and converts it to uppercase and appends it to lastName

        return userName;

    }
    public static void createUsername(){

        System.out.println("Welcome to the create User Name tab, follow the steps");
        System.out.println("Welcome " +userName());
    }

    public static void menu(){
        Scanner input = new Scanner(System.in);
        boolean menu = true;
        while (menu){
            System.out.println("\nWelcome to the Software Development: Programming Foundations H17X34/110 assessment \n" +
                    "Choose an task from below:\n " +
                    "1. Task 1- Find the greatest storage space\n "+
                    "2. Task 2 - Count the files and calculate total and average storage\n "+
                    "3. Task 3- Create a username\n "+
                    "4. Task 4- Sort calculation times from fastest to slowest \n "+
                    "5. Exit\n ");
            int choice;
            try {
                choice = input.nextInt(); // check only for int values

            }catch (InputMismatchException e){
                input.next(); // if a string is passed execute the following
                System.out.println("Please enter a valid choice");
                continue;
            }
            switch (choice) {
                case 1:
                    arrayTask1();
                    break;
                case 2:
                    arrayTask2();
                    break;
                case 3:
                    createUsername();
                    break;
                case 4:
                    doubleArray();
                    break;
                case 5:
                    System.exit(0);
                    menu = false;
                    break;
                default:
                    System.out.println("Please enter a valid option");
            }
            if (menu){
                System.out.println("Rerun the program? (Y/N)");
                String answer = input.next();
                if (answer.equalsIgnoreCase("Y")){
//                    System.out.println("Please enter if you want to rerun");
                } else {
                    System.out.println("Bye");
                    menu = false;
                }
            }
        }

    }
     public static void tester(){
         System.out.println("This is my first commit using Git! ");
     }

    public static void main(String[] args) {
//        menu();


//        tester(); if we uncomment this it will show the function I created to do my first commit

    }
}
