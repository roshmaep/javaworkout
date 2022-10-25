import java.util.Scanner;

public class palindrome1 {
    public static void main(String[] args) {
        int flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = sc.nextLine();
        int length=str.length();
        for(int i=0;i<length;i++){
            if(str.charAt(i)!=str.charAt(length-1-i))
                flag++;
        }
        if(flag==0)
            System.out.println("string is a palindrome");
        else
            System.out.println("string is not a palindrome");
    }
}
