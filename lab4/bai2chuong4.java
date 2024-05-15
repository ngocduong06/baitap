import java.util.Scanner;
import java.util.LinkedList;
public class bai2chuong4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedInt = new LinkedList<> ();
        int sum=0;
        int dem=0;
    System.out.println("nhap so phan tu cua mang linked");
    int n =sc.nextInt();
    for(int i=0;i<n;i++){
    System.out.println("nhap vao phan tu thu "+i);
    int add =sc.nextInt();
    linkedInt.add(add);
    }
    System.out.println("mang linked sau khi nhap:");
    for(int i : linkedInt){
        System.out.println(i);
    }
    for(int i : linkedInt){
    if(i%2==0){
     sum+=i;
     dem++;
    }
    } 
    System.out.println("trung binh cong cua mang linked: "+sum/dem);
    }
}
