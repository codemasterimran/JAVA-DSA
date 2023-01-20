public class backwardforward {

    public static void bf(int n){

        if(n ==0){
            return;
   }
    
   System.out.println(n);
    bf(n-1);
  
    System.out.println(n);
    }
  public static void main(String[] args) {
    bf(5);
  }  

}
