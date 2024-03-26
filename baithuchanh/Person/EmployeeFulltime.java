package Person;
import java.util.Scanner;
public class EmployeeFulltime extends Employee {
       int day;
       int chuyencan;
       float thuong=200000;
       float luong1Ngay;
    public void tinhluong(){
        Scanner sc = new Scanner(System.in);
            System.out.print("day la nhan vien fulltime:");
            System.out.print("\n nhap vao so ngay ban lam viec:");
            day=sc.nextInt();
            if(exp<3){
                luong1Ngay=170000;}
                else luong1Ngay=300000;
            if(chuyencan>26){
                salary=luong1Ngay*day+thuong;}

            else salary = luong1Ngay*day;}
                         
}


