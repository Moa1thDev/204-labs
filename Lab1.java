import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            showMenu();
            choice = input.nextInt();
            if (choice == 1) {
                //Declaring and Initializing one dimensional array
                System.out.println("How many elements of the array? ");
                int n = input.nextInt();
                int[] array = new int[n];
                initOneD(array);
                //Write a statement here to call the method "BelowAboveAvg()"
                BelowAboveAvg(array);





            }
            else if (choice == 2) {
                //Declaring and Initializing one dimensional array
                System.out.println("How many elements of the array? ");
                int n = input.nextInt();
                int[] array = new int[n];
                initOneD(array);
                //Write a statement here to call the method "CountEvenOdd()"


            }
            else if (choice == 3) {
                //Declaring and Initializing one dimensional array
                System.out.println("How many elements of the array? ");
                int n = input.nextInt();
                int[] array = new int[n];
                initOneD(array);
                //Write a statement here to call the method "SwapLargestSmallest()"


            }

            else if (choice == 4) {
                //Declaring and Initializing two dimensional array
                System.out.print("Enter number of rows: ");
                int m = input.nextInt();
                System.out.println();
                System.out.print("Enter number of columns: ");
                int n = input.nextInt();
                System.out.println();
                int[][] array = new int[m][n];
                initTwoD(array);
                //Write a statement here to call the method "SumRowsColumns()"


            }

            else if (choice == 5) {
                //Declaring and Initializing two dimensional array
                System.out.print("Enter number of rows: ");
                int m = input.nextInt();
                System.out.println();
                System.out.print("Enter number of columns: ");
                int n = input.nextInt();
                System.out.println();
                int[][] array = new int[m][n];
                initTwoD(array);
                //Write a statement here to call the method "LargestSumRow()"


            }

            else if (choice == 6) {
                //Declaring and Initializing two dimensional array
                System.out.print("Enter number of rows: ");
                int m = input.nextInt();
                System.out.println();
                System.out.print("Enter number of columns: ");
                int n = input.nextInt();
                System.out.println();
                int[][] array = new int[m][n];
                initTwoD(array);
                //Write a statement here to call the method "RepeatedElementsRow()"


            }


            else if (choice == 7) {
                System.out.println();
                System.out.println(" > Exiting...");
                System.out.println(" > Goodbye");
            }
            else {
                System.out.println();
                System.out.println(" > Invalid choice entered! Please try again.");
                System.out.println();
            }
        } while (choice != 7);
    }


    // Method to show the main menu
    public static void showMenu() {
        System.out.println("********************************************************************");
        System.out.println("************************* Array Exercises **************************");
        System.out.println("********************************************************************");
        System.out.println(" 1. Find how many elements are below and above the average         |");
        System.out.println(" 2. Find how many elements are even and how many are odd           |");
        System.out.println(" 3. Swap largest and smallest elements in the array                |");
        System.out.println(" 4. Summing elements in each row and each column of 2-D array      |");
        System.out.println(" 5. Find row of 2-D array which has the largest sum                |");
        System.out.println(" 6. Display row(s) of 2-D array containing repeated elements       |");
        System.out.println(" 7. Quit                                                           |");
        System.out.println(" -------------------------------------------------------------------");
        System.out.println();
        System.out.print(" > Enter your choice:  ");
    }


    // Method to initialize one dimensional array with random values between 0 and 100
    public static void initOneD(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
    }


    // Method to initialize two dimensional array with random values between 0 and 100
    public static void initTwoD(int[][] array) {
        System.out.println("Entering random numbers in matrix of " + array.length + " rows and " + array[0].length + " columns: ");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[0].length; column++) {
                array[row][column] = (int)(Math.random() * 100);
            }
        }

    }

    // Method to find how many elements are below and above the average
    //   1. Find the average of the elements present in the array
    //   2. Find how many elements are below the average
    //   3. Find how many elements are above the average
    //   4. Display the elements of the array
    //   5. Display the average found my you
    //   6. Display the number of elements below and above the average
    //
    public static void BelowAboveAvg(int[] array) {
        if (array.length == 0) {
            System.out.println("The array is empty.");
            return;
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        double average = (double) sum / array.length;
        int belowAverageCount = 0;
        int aboveAverageCount = 0;

        System.out.println("Elements in the array:");
        for (int num : array) {
            System.out.print(num + " ");
            if (num < average) {
                belowAverageCount++;
            } else if (num > average) {
                aboveAverageCount++;
            }
        }

        System.out.println("\nAverage: " + average);
        System.out.println("Number of elements below average: " + belowAverageCount);
        System.out.println("Number of elements above average: " + aboveAverageCount);
    }



    // Method to find how many elements are even and odd in an array
    //   1. Visit each and every element of the array
    //   2. Count how many elements of the array are even and how many are odd
    //   3. Display all elements of the array
    //   4. Display the total number of even elements
    //   5. Display the total number of odd elements
    //
    public static void CountEvenOdd(int[] array) {
        System.out.println("Elements in the array:");
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < array.length ; i++) {
            int odd = 0 ;
            int even = 0;

            if (array[i] % 2 == 0)
                even++;
            else
                odd++;
            System.out.println("The total number of even elements is: " + even);
            System.out.println("The total number of odd elements is: " + odd);


        }



    }

    // Method to swap largest and smallest elements in the array
    //   1. Find largest and smallest elements in the array
    //   2. Display all elements of the array before swapping
    //   3. Display largest and smallest elements of the array and their indices
    //   4. Swap these largest and smallest elements
    //   5. Display all elements of the array after swapping
    //
    public static void SwapLargestSmallest(int[] array) {










    }


    // Method to find and display sum of each row and each column of 2-D array
    //   1. Visit each row of the array and find its sum
    //   2. Visit each column of the array and find its sum
    //   3. Display the elements of the array with sum against each row and column

    public static void SumRowsColumns(int[][] array) {











    }


    // Method to find and display elements of the row which has largest sum of its elements
    //   1. Visit each row of the array and find its sum
    //   2. Display all elements of the array
    //   3. Display the elements of row which has largest elements of its elements

    public static void LargestSumRow(int[][] array) {











    }

    // Method to find and display elements of the row which contains repeated elements
    //   1. Visit each row of the array and find whether any of its elements is repeated
    //   2. Display all elements of the array
    //   3. Display the elements of all rows which contain repeated elements

    public static void RepeatedElementsRow(int[][] array) {











    }

    }

