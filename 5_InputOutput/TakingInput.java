// import java.math.BigInteger;
import java.util.Scanner;

public class TakingInput {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value for firstNum:");
        int firstNum = sc.nextInt();

        System.out.print("Enter the value for secondNum:");
        int secondNum = sc.nextInt();

        int ans = firstNum + secondNum;
        System.out.println("Answer is: " + ans);

        sc.close();

        //other inputs =>

            //BigInteger bg = sc.nextBigInteger();
            //System.out.println("BigInteger:" + bg);

            //boolean flag = sc.nextBoolean();

            //short shortVal = sc.nextShort();

            //float floatValue = sc.nextFloat(); 

    }
}