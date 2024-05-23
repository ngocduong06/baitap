package Lists;
import java.util.ArrayList;
import java.util.Scanner;
public class Students {
    Scanner sc = new Scanner(System.in);
    private String Fullname;
    private int Age;
    private ArrayList<String> ptSv;
    public Students(){
        Fullname="";
        Age=0;
        ptSv = new ArrayList<>();
    }
    public String getFullname(){
        return Fullname;
    }
    public int getAge(){
        return Age;
    }
    public ArrayList<String> getptSv(){
     return getptSv();
    }
    public void NhapThongTin(){
        System.out.println("nhap ten:");
        Fullname=sc.next();
        System.out.println("nhap tuoi: ");
        Age=sc.nextInt();

    }
    public void ThemThongTin(){
        System.out.println("nhap thong tin muon them");
        String themthongtin=sc.next();
        ptSv.add(themthongtin);
    }
     public void Suathongtin(ArrayList<Students> arraylist){
      System.out.println("nhap ten hoc sinh can sua: ");
      String name= sc.next();
     for(int i=0;i<=arraylist.size();i++){
        if(arraylist.get(i).getFullname().equals(name)){
          Students student=new Students();
         student.NhapThongTin();
         arraylist.add(student);
        }
     }
     for(var i: arraylist){
        System.out.println(i);
     }
     }
public void ThemSinhVien(ArrayList<Students> arraylist){
    System.out.println("nhap so sinh vien can them vao: ");
    int n = sc.nextInt();
    Students students=new Students();
    for(int i=1;i<=n;i++){
        System.out.println("nhap vao thong tin cua sinh vien thu "+i);
        students.NhapThongTin();
        arraylist.add(students);
    }
}
public void XoaSinhVien(ArrayList<Students> arraylist){
    System.out.println("nhap vao ten sinh vien can xoa: ");
    String name = sc.next();
    for(int i=0;i<=arraylist.size();i++){
        if(arraylist.get(i).getFullname().equals(name)){
            arraylist.remove(i);   
        }
    }
}
public void HienThi(ArrayList<Students> arraylist){
    for(var i:arraylist){
        System.out.println(getFullname()+""+getAge());
        for(var x:ptSv){
            System.out.println(x);
        }
    }
 }
    }

   