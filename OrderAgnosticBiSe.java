public class OrderAgnosticBiSe {
    public static void main(String[] args) {
        // int [] arr ={-12,-11,-10,0,1,4,6,8,9,10,15,17};
        int[] arr = { 100, 80, 60, 16, 7, 6, 5, 3, 1, 0, -10 };
        int target = 0;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];
        // if(arr[start] < arr[end]) {
        // isAsc = true;
        // } else {
        // isAsc = false;
        // }

        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; might get an error if start+end/2 exceeds the
            // int range
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {

                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }

        }

        return -1;
    }
}
