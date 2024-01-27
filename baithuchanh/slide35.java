import java.util.Scanner;
public class slide35 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double a,b;
    System.out.println("nhap vao so thu 1:");
    a=sc.nextDouble();
    System.out.println("nhap vao so thu 2:");
    b=sc.nextDouble();
    if(a<b){
        System.out.println("so nho nhat trong 2 so la:"+a);
    }
    else if(a>b){
        System.out.println("so nho nhat trong 2 so la:"+b);
    }
    else{
        System.out.println("2 so vua nhap bang nhau");
    }
    sc.close();
}
}
