package DSA;

public class SearchStrings {
    public static void main(String[] args) {
        String name ="Navaneeth";
        char target = 'z';
        System.out.println(search(name, target));
    }
    static int search (String str, char target){
       if(str.length()==0) {
        return -1;
       }
       for(int i=0;i<str.length(); i++){
          if(target ==  str.charAt(i)){
            return i;
          }
       }
       return -1;//will return -1 only when the target is not in the string name after iterating all over the string
    }
}
