import java.util.Scanner;
public class perfectSquare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int lower, upper, num,i;
        System.out.println("Enter a lower limit:");
        lower = sc.nextInt();
        System.out.println("Enter a upper limit:");
        upper = sc.nextInt();
        System.out.println("The perfect square numbers between the lower interval " + lower + " and upper interval " + upper + " are:");
        for (i = lower; i <= upper; i++) {
            num = i * i;
            if (num <= upper) {
                System.out.println(num);
            }
        }
    }
}

