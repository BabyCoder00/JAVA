import java.util.Scanner;

public class DivisibleBySeven {
    static int countDivisibleBy7(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 7 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        int result = countDivisibleBy7(arr);
        System.out.println("Number of elements divisible by 7: " + result);
    }
}
