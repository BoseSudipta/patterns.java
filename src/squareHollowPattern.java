import java.util.Scanner;

public class squareHollowPattern {
    public static void main(String[] args) {
        Scanner numOne = new Scanner(System.in);
        System.out.println("Enter Count number");
        int count =  numOne.nextInt();
        
        for(int row = 0;row<count;row++){
            for(int col=0;col<count;col++){
                if(row == 0 || row == count-1){
                    System.out.print("* ");
                }else{
                    if(col == 0){
                        System.out.print("* ");
                    }else if(col == count-1){
                       System.out.print("*");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("");
        }

        numOne.close();

    }
}
