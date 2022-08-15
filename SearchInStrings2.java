package DSA;

import java.util.Arrays;

public class SearchInStrings2 {
    public static void main(String[] args) {
        String name = "Navaneeth";
        // char target ='n';
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search2(String str, char target) {
        if(str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
