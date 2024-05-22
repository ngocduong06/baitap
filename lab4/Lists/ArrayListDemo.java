package Lists;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String Fullname;
    int Age;
    ArrayList<Students> arrSt = new ArrayList<> ();
    System.out.println("nhap vao so sinh vien muon them vao Arr");
    int n = sc.nextInt();
    for(int i=1;i<=n;i++){
     System.out.println("nhap vao ten hoc sinh thu:"+i);
     Fullname=sc.next();
     System.out.println("nhap vao tuoi cua hoc sinh thu : "+i );
     Age=sc.nextInt();
     sc.nextLine();
     arrSt.add(new Students(Fullname,Age));
    }
    System.out.println("so hoc sinh dang co trong mang: ");
    for(Students i:arrSt){
        System.out.print(" Fullname: "+i.getFullname()+"-Age: "+i.getAge());
        System.out.println();
    }
    }
}
