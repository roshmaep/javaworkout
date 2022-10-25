import java.util.Scanner;

public class recFibonacci {
    static int n1 = 0, n2 = 1, n3 = 0;

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter count:");
        int count = s.nextInt();
        System.out.print(n1+" "+n2);
        printfibo(count-2);
    }

   static void printfibo(int count)
   {
       if(count>0)
       {
           n3=n1+n2;
           System.out.print(" "+n3);
           n1=n2;
           n2=n3;
           printfibo(count-1);
       }
    }
}
