public class lastindex {
    public static int lastIndex(int arr[],int si,int data){

        if(si==arr.length){
            return -1;

        }
     int index=lastIndex(arr, si+1, data);
     if(index ==-1){
        if(arr[si]==data){
            return si;
        }else{
            return -1;
        }
     }
    return index;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,8,8,5,7,8};
        System.out.println(lastIndex(arr, 0, 8));
    }
}
