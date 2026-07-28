public class Scanner1 {
    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        if (a%2 == 0 && b%2 == 0)
            System.out.println(a + " and " + b + " are even numbers.");
        else
            if (a%2!=0 && b%2 == 0)
                System.out.println(a + " is an odd number and " + b + " is an even number.");
            else
                if (a%2 == 0 && b%2 != 0)
                    System.out.println(a + " is an even number and " + b + " is an odd number.");
                else
                    System.out.println(a + " and " + b + " are odd numbers.");
        }
    }
