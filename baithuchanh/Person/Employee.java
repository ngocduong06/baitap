package Person;

import java.util.Scanner;

public class Employee extends person {
       float exp;
       int cong;
       float luong;
       float salary;
    public void kinhnghiem(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao kinh nghiem lam viec cua ban:");
        exp=sc.nextInt();
    }
    public void xuatluong(){
        System.out.print("\nluong cua nhan vien  thang nay la:"+salary);}
}
