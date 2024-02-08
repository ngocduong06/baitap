import java.util.Scanner;
public class bai11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,max=0;
        System.out.println("nhap so phan tu cua mang");
       n=sc.nextInt();
     int []a= new int[n];
     for(int i=0;i<n;i++){
        System.out.println("nhap phan tu thu "+i+":");
        a[i]=sc.nextInt();
     }
     for(int i=0;i<n;i++){
        for(int j=i+1;j<n-1;j++){
            if(a[i]>a[j]){
            max=a[i];
            a[i]=a[j];
            max=a[j];}
            }
        }
        System.out.println("mang sau khi da sap xep la ");
                for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");}
     }
    }
