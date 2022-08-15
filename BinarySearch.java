public class BinarySearch {
   
    public static void main(String[] args) {
        int [] arr ={-12,-11,-10,0,1,4,6,8,9,10,15,17};
        int target = 89;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }

    //return the index
    //return -1 if it doesnot exit
    static int binarySearch(int[] arr, int target) {
        int start =0;
        int end = arr.length - 1;
        while(start <= end) {
            //find the middle element
            //int mid = (start + end) / 2; might get an error if start+end/2 exceeds the int range
            int mid = start + (end- start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
