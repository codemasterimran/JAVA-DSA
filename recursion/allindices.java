import java.util.*;
public class allindices {
    public static int[] allindicies(int arr[] , int si, int data ,int count ){

        if( si==arr.length){
            int[] basearray=new int[count];
            return basearray;
        }
     
        int [] indices =null;
        if(si==data){
            indices = allindicies(arr, si+1, data, count+1);
        } else{
            indices= allindicies(arr, si+1, data, count);
        }
     if(si==data){
        indices[count]=si;
     }
    return indices;
    }
    
    public static void main(String[] args) {
        int arr[]={3,8,1,8,8,4};

        int ans[]=allindicies(arr, 0, 8, 0);
        System.out.println(Arrays.toString(ans));
  
    }
}
