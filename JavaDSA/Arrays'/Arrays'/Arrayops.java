// take array input from user

import java.util.*;
public class Arrayops {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Size of array ");
    int a=sc.nextInt();
    int arr[]=new int[a];

    for(int i=0 ; i<a; i++){
        System.out.println("Enter elements");
        arr[i]=sc.nextInt();
    }
        sc.close();
     for(int i=0;i<arr.length ;i++){
        System.out.print(arr[i] );
     }
    }
    }



    


