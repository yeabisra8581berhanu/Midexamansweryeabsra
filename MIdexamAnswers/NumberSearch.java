package package1;

import java.util.Scanner;

public class NumberSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

       
        System.out.print("Enter a number to be searched: ");
        int numberToSearch = scanner.nextInt();


        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == numberToSearch) {
                count++;
            }
        }

       
        if (count > 0) {
            System.out.println("The number " + numberToSearch + " appears " + count + " time(s) in the array.");
        } else {
            System.out.println("The number " + numberToSearch + " is not present in the array.");
        }

        scanner.close();
    }
}
