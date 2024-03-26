package Person;
import java.util.Scanner;
public class person {
    String fullname;
    String id;
    String address;
    public person(){
        fullname="";
    }
    public void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nnhap vao ten :");
        fullname=sc.nextLine();
     System.out.println("nhap vao id :");
     id=sc.nextLine();
     System.out.println("nhap vao dia chi :");
     address=sc.nextLine();
    }
    public void age(int age){}
    public void xuatthongtin(){
        System.out.print("thong tin cua "+fullname+ " voi id la:"+id+" dia chi o:"+address);
    }
}
