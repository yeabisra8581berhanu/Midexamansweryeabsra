package package4;

public class BubbleSort {
    public static void main(String[] args) {
        char[] array = {'d', 'b', 'a', 'c', 'e'};
        
        System.out.println("Original Array:");
        printArray(array);
        
        bubbleSort(array);
        
        System.out.println("when it is sorted:");
        printArray(array);
    }

    public static void bubbleSort(char[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                   
                    char temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(char[] array) {
        for (char ch : array) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}

