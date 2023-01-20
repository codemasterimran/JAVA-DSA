/* 
public class printincreasingorder {


    public static void PD(int n)
 {
    if(n>5){
    return;
 }

System.out.println(n);
PD(n+1);

 }
public static void main(String[] args) {
    PD(1);
}
}
   */ 


   public class printincreasingorder {


    public static void PD(int n)
 {

    if(n==0){
    return;
 }


PD(n-1);
System.out.println(n);

 }
public static void main(String[] args) {
    PD(5);
}
}