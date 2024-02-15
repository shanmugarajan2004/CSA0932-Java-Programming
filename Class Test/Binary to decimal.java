import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary number:");
        String binaryStr = scanner.nextLine();
        int decimal = Integer.parseInt(binaryStr, 2);
        System.out.println("Decimal equivalent: " + decimal);

        scanner.close();
    }
}
