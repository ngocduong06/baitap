import java.util.Scanner;
public class slide74{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n,i;
        double tong=0;
        System.out.println("nhap vao so phan tu cua mang");
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++){
            System.out.println("nhap vao phan tu thu"+i);
            a[i]=sc.nextInt();}
            for(i=0;i<n;i++){
            if(a[i]%2==0){
                 tong+=a[i];
            }
        }
        System.out.println("tong cac so chan trong mang la:"+tong);
    }
}