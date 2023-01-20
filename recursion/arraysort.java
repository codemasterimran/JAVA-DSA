public class arraysort {

    public static boolean issorted(int arr[],int i){
      
        if(arr.length==i){
            return true;

        }

 if( arr[i]> arr[i+1])
   
{
    return false;
}
else {
    boolean answer= issorted(arr, i+1);
    return answer;
}
 

}
  public static void main(String[] args) {
    int arr[]={4,5,9,12,45};
    System.out.println(issorted(arr, 0));
  }  
}
