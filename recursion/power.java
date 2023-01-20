public class power {
    public static int powernumber(int x,int n){
        if(n==0){
            return 1;
        }
   int pow1=powernumber(x, n-1);
   int fn=x*pow1;
   return fn;
    }
    public static void main(String[] args) {
        
        System.out.println(powernumber(2, 5));
    }
}
