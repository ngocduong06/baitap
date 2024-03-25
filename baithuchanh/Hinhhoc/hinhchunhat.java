package Hinhhoc;
import java.util.Scanner;
public class hinhchunhat extends hinhhoc{
    Scanner sc = new Scanner(System.in);
    float dai,rong;
    public hinhchunhat(){
        ten="hinhchunhat";
    }
   public void nhapchieudai()
{
   System.out.print("nhap vao chieu dai:");
   dai=sc.nextFloat();
}
  public void nhapchieurong(){
    System.out.print("nhap vao chieu rong:");
    rong=sc.nextFloat();
  }
  public void tinhchuvi(){
    chuvi=(dai+rong)*2;
  }
  public void tinhdientich(){
    dientich=dai*rong;
  }
}
