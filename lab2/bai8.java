import java.util.Scanner;
public class bai8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n,m;
        double tong=0;
        System.out.println("nhap vao so phan tu cua day:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("nhap vao phan tu thu"+i+"cua day:");
            m=sc.nextInt();
        }
        for(int i=1;i<=n;i++){
         tong+=i;
        }
        System.out.println("ket qua:"+(tong/n));
    }
}