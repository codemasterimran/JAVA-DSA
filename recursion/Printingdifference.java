public class Printingdifference{
 public static void PD(int n)
 {
    if(n==0){
    return;
 }
 
System.out.println(n);
PD(n-1);

 }
public static void main(String[] args) {
    PD(5);
}
}