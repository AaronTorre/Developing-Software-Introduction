import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void array(){

        Random rand = new Random(100);
        int[] task1 = new int[15];
        for (int i = 0; i < task1.length; i++){
            task1[i] =   rand.nextInt(256);
        }
        System.out.println("This is the create array made with controlled and random generated data \n"+Arrays.toString(task1));

        System.out.println("This is the maximum value of the array " + findMaximum(task1));


    }

    public static int findMaximum(int[] values){

        int maximum= values[0];

        for(int value : values){
            if( value > maximum){
                maximum = value;
            }
        }
        return maximum;
    }

    public static void main(String[] args) {

        boolean menu = true;
        Scanner input = new Scanner(System.in);
        Random rand = new Random(100);

        System.out.println("Welcome to Programming Foundations H17X34-110 Assessment");
        System.out.println("Please enter your choice:\n" +
                "1) Task 1.\n" +
                "2) Task 2.\n" +
                "3) Task 3.\n" +
                "4) Task 4.\n" +
                "5) Exit the program.");

        while (menu){

            int choice;

            try {
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                input.nextLine(); // if a string is passed execute the following
                System.out.println("Please enter a valid choice");
                continue;
            }

            switch(choice){
                case 1:
                    System.out.println("Task 1");
                    array();
                    break;
                case 2:
                    System.out.println("Task 2");
                    break;
                case 3:
                    System.out.println("Task 3");
                    break;
                case 4:
                    System.out.println("Task 4");
                    break;
                case 5:
                    System.out.println("Exit");
                    System.exit(0);
                default:
                    System.out.println("Select a number from 1 to 5");
                    break;

            }


        }



    }

}
