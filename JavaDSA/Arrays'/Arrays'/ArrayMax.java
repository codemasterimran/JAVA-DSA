public class ArrayMax{
public static void main(String[] args) {
    int arr[]={10,5,20,30,25};
    int max=arr[0];
    for(int i=0 ;i<arr.length;i++){
        if(arr[i] > max){
        max=arr[i];
        }
   
    }
    System.out.println("Max element is"+ max);
}
}