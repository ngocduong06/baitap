import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b;
        System.out.println("nhap vao so a:");
        a= sc.nextDouble();
        System.out.println("nhap vao so b:");
        b=sc.nextDouble();
        System.out.println("tong cua 2 so a va b la:" +(a+b));
        System.out.println(" hieu cua 2 so a vav b la:" +(a-b) +"\t"+(b-a));
        System.out.println("tich cua 2 so la:" +(a*b));
        System.out.println(" thuong cua 2 so a va b la:" +(a/b) + "\t"+(b/a));
        System.out.println("chia lay phan du cua 2 so a va b:" +(a%b) + "\t"+(b%a));
        sc.close();
    }
    
}
