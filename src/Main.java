import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("üssü alınacak sayı");
        int n= scanner.nextInt();
        System.out.println("üs olacak sayı");
        int k=scanner.nextInt();
        int total=1;
        for (int i=1;i<=k;i++){
            total*=n;
        }
        System.out.println(total);
    }
}
