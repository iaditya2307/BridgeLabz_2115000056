import java.util.Scanner;
public class Smallest {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the first number: ");
int number1 = scanner.nextInt();
System.out.print("Enter the second number: ");
int number2 = scanner.nextInt();
System.out.print("Enter the third number: ");
int number3 = scanner.nextInt();
System.out.println("Is the first number the smallest? " + (number1 < number2 && number1 < number3));
}
}
