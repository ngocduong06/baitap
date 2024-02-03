import java.util.Scanner;
public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,tich=1;
        System.out.println("nhap n:");
        n=sc.nextInt();
        for(int i=2;i<=n;i++){
            tich*=i;
        }
        System.out.println("gia tri giai thua cua n la:"+tich);
    }
}
