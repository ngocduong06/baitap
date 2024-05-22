package bai3chuong4;
import java.util.Scanner;
import java.util.LinkedList;
public class mainSinhvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Sinhvien> linkedSv = new LinkedList<> ();
        String Fullname;
        Double diem;
        int dem=0;
      while(true){
        System.out.println("nhap ten sinh vien");
        Fullname=sc.nextLine();
        if(Fullname.isEmpty()){
            break;
        }
        System.out.println("nhap diem cua sinh vien ");
        diem=sc.nextDouble();
        sc.nextLine();
        linkedSv.add(new Sinhvien(Fullname , diem));
      }
      System.out.println("nhung sinh vien phai thi lai: ");
      for( Sinhvien i : linkedSv){
        if(i.getdiem()<=5){
        System.out.println(i.getFullname());
        dem++; 
        }  
      }
      System.out.println("so sinh vien phai thi lai la:"+dem);

      double Highscore = linkedSv.getFirst().getdiem();
      LinkedList<Sinhvien> linkedHighScore =new  LinkedList <> ();
      for(Sinhvien i:linkedSv){
        if(i.getdiem()>Highscore){
       Highscore=i.getdiem();
       linkedHighScore.clear();
       linkedHighScore.add(i);
        } else if (i.getdiem()==Highscore){
          Highscore=i.getdiem();
          linkedHighScore.add(i);
        }
      }
      System.out.println("nhung sinh vien co diem cao nhat la: ");
      for(Sinhvien i:linkedHighScore){
        System.out.println(i.getFullname());
      }
      String searchName;
      System.out.println("nhap vao ten sinh vien can tim");
      searchName=sc.nextLine();
  
        for(Sinhvien i:linkedSv){
       if(i.getFullname().equals(searchName)){
        System.out.println("sinh vien can tim ten la :"+i.getFullname()+" co so diem: "+i.getdiem());
       }else 
       System.out.println("sinh vien "+i.getFullname()+"  ton tai nhung khong phai la sinh vien can tim.");
      }
    }
}
