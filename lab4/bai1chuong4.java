import java.util.Scanner;
import java.util.ArrayList;
public class bai1chuong4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so phan tu cua mang Arr");
        int n = sc.nextInt();
        ArrayList<Integer>  arrInt = new ArrayList<> ();
        for(int i =0;i<n;i++){
            System.out.println("nhap vao phan tu thu "+i+" cua mang Arr");
            int add = sc.nextInt();
            arrInt.add(add);
        }
        System.out.println("mang arr sau khi nhap la:");
        for(int i : arrInt){
        System.out.println(i);
        }
       int max=arrInt.get(0);
       for(int i =0;i<n;i++){
        if(max<arrInt.get(i)){
            max=arrInt.get(i);
        }
       }
      System.out.println("so lon nhat trong mang Arr la "+max);
      System.out.println("nhap vao so nguyen can xoa khoi mang Arr");
      int m = sc.nextInt();
      if(arrInt.contains(m)){
        for(int i=0;i<arrInt.size();i++){
       if(m==arrInt.get(i)){
        arrInt.remove(i);
       } 
      }
      System.out.println("so nguyen "+m+" da duoc xoa khoi mang Arr");
      } else 
      System.out.println("so nguyen "+m+" khong ton tai");
       for(int i=0;i<=arrInt.size()-1;i++){
          for(int j=i+1;j<arrInt.size();j++){
            int temp;
            if(arrInt.get(j)<arrInt.get(i)){
                temp=arrInt.get(i);
                arrInt.set(i,arrInt.get(j));
                arrInt.set(j,temp);
            }
          }
       }
       for(int i : arrInt){
        System.out.println("mang Arr sau khi duoc sap xep: "+i);
       }
    }
}
