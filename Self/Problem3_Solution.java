import java.util.Scanner;

public class Problem3_Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base = scanner.nextDouble();
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(result);
    }
}
