import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n= sc.nextInt();
        int sum =0;

        for(int i=1; i<=n; i++){
            System.out.println(i);
            sum = sum + i;

        }
        System.out.println("Sum Of Natural number "+ n +" IS ==="+sum);
    }
}
