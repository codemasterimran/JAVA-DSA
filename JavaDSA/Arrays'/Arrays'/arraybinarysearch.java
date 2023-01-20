public class arraybinarysearch {
    public static int binarysearch(int arr[],int item){
        int low=0;
        int high=10;
        while(low<=high){
            int mid= (low+high)/2;
     if(arr[mid]<item){
        low=mid-1;
     }else if(arr[mid]>item)
     {
  high= mid+1;
     } else {
        return mid;
     }
    
        }
  return -1;
    }

public static void main(String[] args) {
    int arr[] ={1,2,3,4,5,6,7,8,9,10};
 int item =6;

 System.out.println(item +" "+ "Index of item is at:" + binarysearch(arr,item));
}
}
