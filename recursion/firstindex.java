public class firstindex {

    public static int firstIndex(int  arr[],int si,int data){
   if (si==arr.length){
    return -1;   
}
if (arr[si]==data){

    return si;
} else {
    int fn=firstIndex(arr, si+1, data);
    return fn;
}

}

public static void main(String[] args) {
    int arr[]={6,8,1,1,8,3,4};
    System.out.println(firstIndex(arr, 0, 1));
}
    
}
