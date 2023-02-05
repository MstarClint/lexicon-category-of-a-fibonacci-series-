import java.util.Scanner;
public class LexiAlgo {
 public static void main(String[] args) {
 int FibLength;
 Scanner sc = new Scanner(System.in);
 System.out.print("Please enter length: ");
 FibLength = sc.nextInt();
 if (FibLength <= 0) {
 System.out.println("Invalid input. Please enter a positive number.");
 return;
 }
 if (FibLength > 45) {  
 System.out.println("Invalid input. Please enter a number less than 45.");
 return;
 }
 int[] num = new int[FibLength];
 num[0] = 0;
 num[1] = 1;
 for (int i = 2; i < FibLength; i++) {
 num[i] = num[i - 1] + num[i - 2];
 }
 System.out.println("Fibonacci Series: ");
 for (int i = 0; i < FibLength; i++) {
 System.out.print(num[i] + " ");
 }
 
 int count = 0;
 for (int i = 0; i < FibLength; i++) {
 count++;
 }
 System.out.println("\nThe number of comments in the code is: " + count);
 
 count = 0;
 for (int i = 0; i <= FibLength - 1; i++) {
 count++;
 }
 System.out.println("\nThe number of separators in the series is: " + count);
 
 count += FibLength - 2;
 System.out.println("\nThe number of operators in the series is: " + count);
 
 int length = 0;
 for (int i = 0; i < FibLength; i++) {
 String str = Integer.toString(num[i]);
 length += str.length();
 }
 System.out.println("\nThe number of literals in the series is: " + length);
 }
}