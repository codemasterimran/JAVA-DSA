import java.util.Arrays;
public class Uniquearray {

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
       isunique(arr);
      boolean result=isunique(arr);
    System.out.println(result);
    }
     public static boolean isunique(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
           return false;
            }
            }
        }
     return true;
    }
}
