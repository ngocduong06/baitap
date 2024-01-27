import java.util.Scanner;
public class slide40 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
       do{ System.out.println("Nhap n:");
        n=sc.nextInt();}while(n<0||n>6);
        switch (n) {
            case 0:System.out.println("nay la CHU NHAT");
                break;
                case 1:System.out.println("nay la THU HAI");
                break;
                case 2:System.out.println("nay la THU BA");
                break;
                case 3:System.out.println("nay la THU TU");
                break;
                case 4:System.out.println("nay la THU NAM");
                break;
                case 5:System.out.println("nay la THU 6");
                break;
                case 6:System.out.println("nay la THU 7");
                break;
        }
        sc.close();
    }
}
