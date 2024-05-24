import java.util.Scanner;
import java.util.LinkedList;
public interface Face  {
  Scanner sc = new Scanner(System.in);
      public static  int age;
      public static String Fullname;
      public static String Thongtinkhac;
      LinkedList<String> ptSv;
      public static String getFullname(){
         return Fullname;}
     public static void NhapThongTin(){}
     public static void ThemThongTin(){}
     public static void XoaThongtin(LinkedList<Face> linked){}
     public static void Hienthi(LinkedList<Face> linked){}
}  
