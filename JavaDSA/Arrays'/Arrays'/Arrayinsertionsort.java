import java.util.*;
public class Arrayinsertionsort {
 public static void insertionsort(int arr[]){

    for(int counter=1;counter<=arr.length-1;counter++){
    int value=arr[counter];

    int j=counter-1;
    while(j>=0 && arr[j]>value){
              arr[j+1]=arr[j];  
                j--;
    }
   arr[j+1]=value;

    }
    
 }
   
 


public static void main(String[] args) {
    int arr[] = {88,11,44,99,33};
  System.out.println("array after sorting in increasing order is :");

  insertionsort(arr);
  System.out.println(Arrays.toString(arr));
}
}

