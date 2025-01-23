import java.util.Scanner;
public class Armstrong {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = scanner.nextInt();
int sum = 0;
int originalNumber = number;
while (originalNumber != 0) {
int remainder = originalNumber % 10;
sum += Math.pow(remainder, 3);
originalNumber /= 10;
}
if (number == sum) {
System.out.println(number + " is an Armstrong number.");
} else {
System.out.println(number + " is not an Armstrong number.");
}
scanner.close();
}
}
