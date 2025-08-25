import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text = "";
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter array: ");
            text = scanner.nextLine();
            System.out.println("Enter sum: ");
            int sum = scanner.nextInt();
            String[] data = text.split(",");
            int left = 0;
            int right = data.length - 1;
            while (left <= right) {
                int current_sum = Integer.parseInt(data[left]) + Integer.parseInt(data[right]);
                if (current_sum == sum) {
                    System.out.println(data[left] + " + " + data[right] + " = " + sum);
                    break;
                } else if (current_sum < sum)
                    left++;
                else if (current_sum > sum)
                    right--;
                else {
                    System.out.println("not found");
                    break;
                }
            }
        }
    }
}
