package prblm;



import java.util.Scanner;

public class probelem111 {
    
    public static int findIndex(int[] arr) {
        int index = 1;
        while (arr[index - 1] != -1) {
            index *= 2;
        }
        int low = index / 2;
        int high = index;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid - 1] == -1 && (mid == 1 || arr[mid - 2] != -1)) {
                return mid;
            } else if (arr[mid - 1] == -1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements of the array  ");
        String input = scanner.nextLine();
        String[] strArr = input.split(" ");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        int index = findIndex(arr);
        System.out.println("Index x: " + index);

        scanner.close();
    }
}
