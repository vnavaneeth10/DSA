package DSA;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,-1,-2,-10,100,9};
        System.out.println(min(arr));
    }
    //assuming the arr.length !=0
    static int min (int[] arr) {
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                ans = arr[i];
                
            }
        }return ans;
        
    }
    
}
