public class Missingnumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,18,19,20,21,22,23,24,25,26,27,28,29,30};
    
    missingnumber(arr);
}
    
    public static void missingnumber(int arr[]){
        int sum1=0;
        int sum2=0;

        for(int i:arr){
            sum1 +=i;
        }
    sum2= 30*(31)/2;
  int difference= sum2-sum1;

  System.out.println("missing number from the given array is "+difference);
    }
}
