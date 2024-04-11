import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        System.out.println("Введите число1:");
        BigInteger num1 = skan.nextBigInteger();
        System.out.println("Введите число2:" );
        BigInteger num2 = skan.nextBigInteger();
        BigInteger res1 = (num1.add(num2));
        BigInteger res2 = (num1.subtract(num2));
        BigInteger res3 = (num1.multiply(num2));
        BigInteger res4 = (num1.divide(num2));
        BigInteger res5 = (num1.remainder(num2));
        System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4 + "\n" + res5 + "\n");
    }
}
