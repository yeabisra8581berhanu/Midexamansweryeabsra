
package package5;

import java.util.Scanner;

public class NumberSearch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("element:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        mergeSort(array, 0, size - 1);

        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

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

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    public static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = array[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
}
