import java.util.*;
public class ArrayProject1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many days temperature");
        int numdays=sc.nextInt();
        int temp[]=new int[numdays];

        int sum=0;
        for(int i=0;i<numdays;i++){
            System.out.println("day"+ (i+1) +"s temperature");
            temp[i]=sc.nextInt();
            sum+=temp[i];
        }
   double average=sum/numdays;
   int above=0;
   for(int i=0;i<temp.length;i++){
    if(temp[i]>average){
       above++;
    }
   }
   System.out.println();
   System.out.println("average temperature"+ average);
   System.out.println(above+"days above average  temperature");
    }
    
}
