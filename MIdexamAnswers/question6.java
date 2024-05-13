package package6;

public class question6{
    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4};
        int indexToDelete = 2;
        
        int[] modifiedarray = deleteElement(array, indexToDelete);
        if (modifiedarray != null) {
            System.out.print("new array is: ");
            for (int num : modifiedarray) {
                System.out.print(num + " ");
            }
        }
    }

    public static int[] deleteElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("The inde is invalid.");
            return array;
        }

        int[] newArray = new int[array.length - 1];
        int newIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                newArray[newIndex] = array[i];
                newIndex++;
            }
        }
        return newArray;
    }
}
