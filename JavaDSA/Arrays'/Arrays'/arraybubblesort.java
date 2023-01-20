import java.util.Arrays;

public class arraybubblesort {

    public static void main(String[] args) {
        int []arr = {88,66,55,44,22};
        System.out.println( "increasing order will be");
        bubblesort(arr); 
      System.out.println(Arrays.toString(arr));     
    } 
    public static void bubblesort(int []arr){
 
        for(int counter=0;counter<arr.length-1;counter++){

            for(int j=0;j<arr.length-1-counter ;j++){
                if(arr[j]>arr[j+1]){
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                }
            }
        }
       
        
    }
 
    

    
    
}
