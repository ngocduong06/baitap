package arrayListchuong4;
import java.util.Scanner;
import java.util.ArrayList;
public class slide24chuong4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("nhap vao so phan tu cua mang");
    int n = sc.nextInt();
    int number;
    int max;
    ArrayList<Integer> arrInt = new ArrayList<> ();
    for(int i =0;i<n;i++){
        System.out.println("nhap vao phan tu thu "+i);
        number = sc.nextInt();
        arrInt.add(number);
    } 
    max=arrInt.get(0);
    for(int i=0;i<arrInt.size();i++){
     if(arrInt.get(i)>max){
        max=arrInt.get(i);
     } 
    }
    System.out.println("phan tu lon nhat cua arrList la:"+max);
}
}
