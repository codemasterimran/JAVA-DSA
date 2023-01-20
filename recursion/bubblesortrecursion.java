import java.util.Arrays;
public class bubblesortrecursion {
    public static void bubblesort(int arr[],int si,int li){

        if(li==0){
            return;
        }
    if(si==li){
        bubblesort(arr, 0, li-1);
      return;
    }
   if(arr[si]>arr[si+1]){
    int temp=arr[si];
    arr[si] =arr[si+1];
arr[si+1]=temp;  
 
bubblesort(arr, si+1, li);
}    
}
public static void printarray(int arr[]){
   for(int i=0;i<arr.length ;i++){
  System.out.print(arr[i] + ",");
   }
 System.out.println();

}
 public static void main(String[] args) {
    int arr[]={50,40,30,20,10};
   bubblesort(arr, 0, arr.length-1);
   printarray(arr);
}   
}
