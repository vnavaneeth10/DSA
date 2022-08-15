package DSA;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = { 22, 3, 45, 32, 19 };
        int target = 0;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    // search in the array: & return the index if item found or return -1 if item
    // not found
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run for a loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is target
            int element = arr[index];
            if (element == target) {
                return index;

            }
        }
        // this line will execute if none of the return statements above have excuted
        // hence the target not found
        return -1;
    }
}
