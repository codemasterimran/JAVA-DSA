import java.util.Arrays;

public class arrayselectionsort {
    public static void selectionSort(int arr[]){

         for(int counter=0;counter<arr.length-1;counter++){
           int min=counter;

           for(int j=counter+1;j<=arr.length-1;j++){
            if(arr[j]<arr[min])
                min=j;
            
         }
         int temp=arr[min];
             arr[min]=arr[counter];
             arr[counter]=temp;
        }
             
    }


    public static void main(String[] args) {
        int arr[]={99,88,77,66,55};
        System.out.println("array after arrranging in increasing order");
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
