import java.util.Scanner;
public class classStudent{ 
        public float toan;
        public float van;
        public float tienganh;
        public String fullname;
        public String msv;
        public String address;
         void nhapthongtin(){
            Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten cua sinh vien:");
        fullname=sc.nextLine();
        System.out.print("nhap ma sinh vien:");
        msv=sc.nextLine();
        System.out.print("nhap dia chi cua sinh vien:");
        address=sc.nextLine();
        System.out.print("nhap diem toan:");
        toan=sc.nextFloat();
        System.out.print("nhap diem van:");
        van=sc.nextFloat();
        System.out.print("nhap diem tieng anh:");
        tienganh=sc.nextFloat();
        }
       void diem(){
         System.out.print("\n diem trung binh cua sinh vien " +fullname+ " la:" +(toan+van+tienganh)/3);
        }
       void hienthi(){
            System.out.print("ho ten cua sinh vien la:"+fullname);
            System.out.print("\n msv: "+msv);
            System.out.print("\n dia chi cua sinh vien:"+address);
        }
}