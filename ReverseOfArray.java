import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Reverse array:");

        for (int i = 4; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}


Output:
Enter 5 elements:
10 20 30 40 50
Reverse array:
50 40 30 20 10