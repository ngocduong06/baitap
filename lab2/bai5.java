import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,tong=0;
        String s="";
        do {
            System.out.println("nhap so nguyen:");
            n=sc.nextInt();
            tong+=n;
           s=s+n + "+";
        }while(tong<100);
        System.out.println("tong bang="+tong);
        System.out.println("cac so vua nhap la:"+(s.substring(0,s.length()-1)));
        sc.close();
    }
}
