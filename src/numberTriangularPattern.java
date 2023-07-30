import java.util.Scanner;


public class numberTriangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number");
        int num =  sc.nextInt();
        for(int row = 1;row<=num;row++){
            for(int i = 1;i<=num-row;i++){
             System.out.print(" ");   
            }
            for(int j=1;j<=row;j++){
                System.out.print(row + " ");
            }
            System.out.println("");
        }
      sc.close();

    }
}
