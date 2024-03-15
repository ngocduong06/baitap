import java.util.Scanner;
public class classEmployee {
    public String fullname;
    public String manhanvien;
    public float salary;
    public int cong;
    public float thuong=200000;
    public float luong1ngay;
    void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten nhan vien:");
        fullname=sc.nextLine();
        System.out.print("nhap ma nhan vien:");
        manhanvien=sc.nextLine();
        System.out.print("so ngay nhan vien di lam duoc trong thang:");
        cong=sc.nextInt();
        System.out.print("tien luong 1 ngay cua nhan vien la:");
        luong1ngay=sc.nextFloat();
       }
    public void hienthi(){
        System.out.print("ten nhan vien:"+fullname);
        System.out.print("\n ma nhan vien:"+manhanvien);
        System.out.print("\n ngay cong:"+cong);
    }
     public void luong(){
        if(cong>25){
            salary=thuong+luong1ngay*cong;
        }
        else{
            salary=luong1ngay*cong;
        }
        System.out.print("\n tien luong 1 thang cua nhan vien "+fullname+" la:" +salary+"VND");
    }
          
}
