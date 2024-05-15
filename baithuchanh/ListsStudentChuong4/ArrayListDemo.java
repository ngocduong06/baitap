package ListsStudentChuong4;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListDemo {
    Scanner sc = new Scanner(System.in);
    ArrayList<classStudent> arrStudent = new ArrayList<> ();
    classStudent st = new classStudent();
    public void Themsinhvien(){
     System.out.println("nhap vao so student can nhap:");
    int n = sc.nextInt();
    for(int i=0;i<=n;i++){
        st.NhapThongTin();
        arrStudent.add(st);
    }
}
   public void Them(){
    st.NhapThongTin();
    arrStudent.add(st);
   }
   public void SuaThongTin(){
    System.out.print("nhap vao vtri phan tu can sua:");
    int n = sc.nextInt();
    for(int i =0 ;i<=arrStudent.size();i++){
    if(i==n){
        arrStudent.set(0, st);
    }       
}
   }
   public void HienThi(){
    for(classStudent st : arrStudent){
        System.out.println(st);
    }
   }
}
