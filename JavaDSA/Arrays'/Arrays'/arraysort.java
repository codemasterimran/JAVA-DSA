public class arraysort {
	public static void main(String[] args) {
		int arr[] ={3,6,9,9,6,14,19};
		boolean result=issort(arr);
      System.out.println(result);
	}

    public static boolean issort(int arr[]){
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;i++){
                
                if(arr[i]<=arr[j]){
                    return true;
                }
            }
            
        }
        return false;
    
}
}
    

