public class Factorial {
    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial:");
        int num = sc.nextInt();
        int factorial = 1;
        for(int i = num; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println(num + "! = " + factorial);
    }
}