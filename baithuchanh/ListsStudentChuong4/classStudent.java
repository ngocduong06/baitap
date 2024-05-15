package ListsStudentChuong4;
import java.util.Scanner;
public class classStudent {
    Scanner sc = new Scanner(System.in);
    public String Fullname;
    public int Age;
    public void NhapThongTin(){
        System.out.println("nhap vao thong tin cua sinh vien:");
        Fullname=sc.nextLine();
        Age=sc.nextInt();
    }
    public void XuatThongTin(){
        System.out.println(Fullname+"-"+Age);
    }
}
