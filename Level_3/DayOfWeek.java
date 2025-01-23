import java.util.Scanner;
public class DayOfWeek {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
try {
System.out.print("Enter month (1 for January, 2 for February, etc.): ");
int m = scanner.nextInt();
System.out.print("Enter day: ");
int d = scanner.nextInt();
System.out.print("Enter year: ");
int y = scanner.nextInt();
if (m < 1 || m > 12 || d < 1 || d > 31) {
System.out.println("Invalid date. Please enter a valid month (1-12) and day (1-31).");
return;
}
int y0 = y - (14 - m) / 12;
int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
int m0 = m + 12 * ((14 - m) / 12) - 2;
int d0 = (d + x + (31 * m0) / 12) % 7;
System.out.println("Day of the week: " + d0 + " (0 = Sunday, 1 = Monday, ..., 6 = Saturday)");
} catch (Exception e) {
System.out.println("Invalid input. Please enter numeric values for the date.");
} finally {
scanner.close();
}
}
}
