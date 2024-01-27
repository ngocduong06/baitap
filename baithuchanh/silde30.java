import java.util.Scanner;
public class silde30 {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n,tong=0;
        do{
            System.out.println("nhap gia tri n:");
            n=sc.nextInt();
        } while(n<0);
        while (n!=0){
            tong+=n%10;
            n/=10;
        }
        System.out.println("ket qua la:"+tong);
        sc.close();
    }
}