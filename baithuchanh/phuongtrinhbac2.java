//ax2+bx+c=0    
import java.util.Scanner;
public class phuongtrinhbac2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
      double a,b,x1,x2,delta,c;
      System.out.println("nhap gia tri he so a:");
      a= sc.nextDouble();
      System.out.println("nhap gia tri he so b:");
      b= sc.nextDouble();
      System.out.println("nhap gia tri he so c:");
      c= sc.nextDouble();
      if(a==0){
           if(b==0){
         System.out.println("vo li");
                   }
        else{
        System.out.printf("phuong trinh co nghiem la "+(-c/b));
            }
              }
       else{ delta=Math.pow(b,2) - ( 4*a*c) ; 
         System.out.println("delta cua phuong trinh bang "+delta);
           if(delta<0){
         System.out.println("phuong trinh vo nghiem");
                      }
           else if(delta==0){
            x1=x2=(-b/2*a);
            System.out.printf("nghiem cua phuong trinh la "+x1);
                           }
            else  {
             x1=(-b+Math.sqrt(delta))/(2*a);
             x2=(-b-Math.sqrt(delta))/(2*a);
             System.out.println("nghiem x1 cua phuong trinh co ket qua la:"+x1);
             System.out.println("nghiem x2 cua phuong trinh co ket qua la:"+x2);
                         }               
           }
           Sc close;
    }
}
