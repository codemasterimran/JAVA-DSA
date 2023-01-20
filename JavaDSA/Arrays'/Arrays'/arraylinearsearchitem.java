public class arraylinearsearchitem  {
     
    public static int linearsearch(int arr[],int item){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                return i;
            }
        }
    return -1;
    }
  public static void main(String[] args) {
    int arr[]={10,20,30,40};
    

    System.out.println("element found at index : "+ linearsearch(arr , 30));
  }

    }

    
    
