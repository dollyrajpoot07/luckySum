//luckySum
// Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards 
// the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.

// luckySum(1, 2, 3) → 6
// luckySum(1, 2, 13) → 3
// luckySum(1, 13, 3) → 1

import java.util.*;

public class LuckySum {
    public static int luckySum(int a, int b, int c) {
        int sum = 0;
        if (a < 13 && b < 13 && c < 13) {
            sum = a + b + c;
            return sum;
        } else if (a == 13) {
            sum = 0;
            return sum;
        } else if (a < 13 && b == 13) {
            sum = a;
            return sum;
        } else if (a < 13 && b < 13 && c == 13) {
            sum = a + b;
            return sum;
        } else {
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter value of c: ");
        int c = sc.nextInt();
        int sumOfLuck = luckySum(a, b, c);
        System.out.println("Lucky Sum is: " + sumOfLuck);
        sc.close();
    }

}
