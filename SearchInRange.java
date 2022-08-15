package DSA;

public class SearchInRange {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,8};
        int target=4;
        System.out.println(linearSearch(arr, target,2, 4));
    }
    static int linearSearch(int[] arr,int target,int start, int end) {
        if(arr.length == 0){
            return -1;
        }
        for(int i= start; i<=end;i++){
            int element = arr[i];
            if(element == target){
                return element;
            }
        }return -1;
    }
    
    
}
