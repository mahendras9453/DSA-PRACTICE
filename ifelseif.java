//leetcode problem 9(palindrome)
import java.util.Scanner;

class ifelseif {
    public  boolean isPalindrome(int x) {
        int d, sum = 0, original = x;
        if (x > 0) {
            while (x != 0) {
                d = x % 10;
                sum = sum * 10 + d;
                x = x / 10;
            }
        }
        if (sum == original) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        ifelseif obj = new ifelseif();
        boolean result = obj.isPalindrome(num);

        if (result) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}