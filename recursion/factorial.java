public class factorial {

    public static int findfactorial(int n){
   if (n==1){

return 1;
}
 
   int fact1= findfactorial(n-1);
   int finalfact=n*fact1;
 
   return finalfact;
}
    public static void main(String[] args) {
     
    System.out.println(findfactorial(4));
    }
}

