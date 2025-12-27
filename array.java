// leetcode problem of  running sum aray (1480)
import java.util.Scanner;

public class array {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] sum = new int[n];
        sum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
 array obj = new array();
        int[] result = obj.runningSum(nums);
 System.out.println("Running Sum:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}