// aX+b=0
import java.util.Scanner;
public class phuongtrinhbac1 {
    public static void main (String[]args)
    {  
        Scanner sc = new Scanner(System.in);
        double a,b;
        System.out.println("nhap gia tri cua a");
        a=sc.nextDouble();
        System.out.println("nhap gia tri cua b");
        b=sc.nextDouble();
        System.out.println("ta co phuong trinh la "+a+"x+"+b);
        if(a==0){
            if(b==0){
            System.out.println("phuong trinh vo so nghiem"); 
                    }
            System.out.println("phuong trinh vo nghiem");        
                }
                else{
                    System.out.printf("phuong trinh co nghiem la %.3f",(-b/a));
                }
    }
}
