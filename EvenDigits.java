package DSA;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/#:~:text=Find%20Numbers%20with%20Even%20Number%20of%20Digits%20%2D%20LeetCode&text=Given%20an%20array%20nums%20of,(even%20number%20of%20digits).
//Given an array nums of integers, return how many of them contain an even number of digits.

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,10,15,8,88,345,2,6,7896};
        System.out.println(findNumbers(nums));
        // Scanner in = new Scanner(System.in);
    }

    static int findNumbers(int[] nums){
        int count=0;
        for(int num : nums) {
            if(even(num)){
                count++;
            }

        } return count++;
    }
    static boolean even(int num) {
        int numberOfDigits = digits(num);

        // if(numberOfDigits % 2 ==0){
        //     return true;
        // } return false;
        return numberOfDigits % 2 ==0;
        //written in shorthand
    }
    static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }

    static int digits( int num) {
        if (num < 0){
            num = num  * -1;
        }
        if(num == 0) {
            return 1;
        }
        int count = 0;
        while(num > 0){
            count++;
            num = num /10;
        }
        return count;
    }
}
