package Lists;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   ArrayList<Students> arr = new ArrayList<> ();
   Students students=new Students();
   System.out.println("nhap so luong sinh vien: ");
   int n=sc.nextInt();
   for(int i=1;i<=n;i++){
    students.NhapThongTin();
   }
   students.ThemSinhVien(arr);
   students.Suathongtin(arr);
   students.XoaSinhVien(arr);
   students.HienThi(arr);
    }
}
