import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner numOne = new Scanner(System.in);
        System.out.println("Enter How many times you want show * pattern row wise");
        int numberOne =  numOne.nextInt();
        Scanner numTwo = new Scanner(System.in);
         System.out.println("Enter How many times you want show * pattern column wise");
         int numberTwo =  numTwo.nextInt();
         for(int i =0;i<numberTwo;i++){
        for(int j=0;j<numberOne;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
        numOne.close();
        numTwo.close();
    }
}
