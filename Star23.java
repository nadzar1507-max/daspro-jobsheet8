import java.util.Scanner;
public class Star23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukan nilai n = ");
        int n = sc.nextInt();

        for (int i = 1 ; i <= n; i++ ){
            System.out.print("*");
        }
        System.out.println();
    }
}