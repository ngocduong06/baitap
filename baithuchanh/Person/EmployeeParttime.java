package Person;
import java.util.Scanner;
public class EmployeeParttime extends Employee {
    int gio;
    int luonggio=20000;
    public void tinhluong(){
        Scanner sc = new Scanner(System.in);
            System.out.print("day la nhan vien parttime:");
            System.out.print("\n nhap vao so gio lam viec cua ban trong thang:");
            gio=sc.nextInt();
            if(exp<1/2){
             salary=luonggio*gio +200000;
            }
            else 
            salary=luonggio*gio;
        }
       
}
