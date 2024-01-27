import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        System.out.println("nhap gia tri cua so a:");
        a=sc.nextDouble();
        if(a%2==0){
            System.out.println("a la so chan:");
        }
        else{
            System.out.println("a la so le");
        }
          sc.close();
    }
}