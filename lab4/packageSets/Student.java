package packageSets;
import java.util.HashSet;
import java.util.Scanner;
public class Student {
    Scanner sc = new Scanner(System.in);
    private String Fullname;
    private int Age;
    private  HashSet<String> hashStudents;
   public Student(){
    Fullname ="";
    Age=0;
    hashStudents = new HashSet<>();
   }
   public String getFulname(){
    return Fullname;
   }
   public int Age(){
    return Age;
   }
   public HashSet<String> gethashStudents(){
    return hashStudents;
   }
   public void NhapThongTin(){
    System.out.println("nhap ten: ");
    Fullname=sc.next();
    System.out.println("nhap tuoi:");
    Age=sc.nextInt();
   }
   public void SuaThongTin(HashSet<Student> hashset){
    System.out.println("nhap vao ten sinh vien can sua doi: ");
    String name=sc.next();
    for(var i:hashset){
        if(i.getFulname().equals(name)){
            Student st = new Student();
            st.NhapThongTin();
            hashset.add(st);
        }
    }
   }
   public void ThemSinhVien(HashSet<Student> hashset){
    Student st = new Student();
    System.out.println("nhap vao so sinh vien can them: ");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        st.NhapThongTin();
        hashset.add(st);
    }
   }
   public void XoaSinhVien(HashSet<Student> hashset){
    System.out.println("nhap vao ten sinh vien can xoa: ");
    String name = sc.next();
    hashset.contains(name);
    hashset.remove(name);
    for(var i:hashset){
        System.out.println(i);
    }
   }
   public void HienThi(HashSet<Student> hashset){
    System.out.println(hashset);
   }
}
   