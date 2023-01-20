public class pattern {
    public static void patterns(int n,int row,int col){

        if (row>n){
            return;
          }
    if( col>row){
        System.out.println();
        patterns(n, row+1, 1);
        return;
    }
    System.out.print("*");
    patterns(n, row, col+1);
        }
     public static void main(String[] args) {
        patterns(5, 1, 1);
    
     }
}
