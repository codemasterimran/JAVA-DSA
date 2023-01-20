/* 
import java.util.Scanner;
public class twodarrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int rows=sc.nextInt();
        System.out.println("Enter no. of coloumns");
        int cols=sc.nextInt();
        int numbers[][]=new int [rows][cols];

        for(int i=0;i<rows;i++){

            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            
            }
        }
     for(int i=0;i<rows;i++){
        for (int j=0;j<cols;j++){

            System.out.print(numbers[i][j]+" ");
        }
    System.out.println(); 
    }
    
    }
}
*/

// to find no.x and print indicies 

        import java.util.Scanner;
public class twodarrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int rows=sc.nextInt();
        System.out.println("Enter no. of coloumns");
        int cols=sc.nextInt();
        int numbers[][]=new int [rows][cols];

        for(int i=0;i<rows;i++){

            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            
            }
        }
int x=sc.nextInt();

     for(int i=0;i<rows;i++){
        for (int j=0;j<cols;j++){

            if(numbers[i][j]==x){
                System.out.println("number found at indicies("+i +";"+ j+")");
            }
        }
  
    }
    
    }
}