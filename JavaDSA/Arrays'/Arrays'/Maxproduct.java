import java.util.Arrays;
public class Maxproduct {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,60,50};
       String pairs= maxproduct(arr);
        System.out.println(pairs);
     
    }
  public static String maxproduct(int arr[]){
     int maxproduct=0;
     String pairs="";
     for(int i=0;i<arr.length; i++){
        for(int j=i+1;j<arr.length;j++ ){

            if(arr[i]*arr[j]>maxproduct){
                maxproduct=arr[i]*arr[j];
                pairs=Integer.toString(arr[i]) + ","+ Integer.toString(arr[j]);

            }
        }
     }
  
    return pairs;
}      
    }
    

