import java.util.Scanner;
public class slide47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,tong=0;
        do {
            System.out.println("nhap so nguyen:");
            n=sc.nextInt();
            tong+=n;
        }while(tong<100);
        System.out.println("tong bang=:"+tong);
        sc.close();
    }
}
