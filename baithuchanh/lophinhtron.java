import java.util.Scanner;
public class lophinhtron {
     final float Pi =3.14f;
    float r,dt,cv;
   public  void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao ban kinh cua hinh tron:");
        r=sc.nextFloat();
    }
    public void tinh(){
        cv=2*Pi*r;
        dt=Pi*r*r;
    }
    public void hienthi(){
        System.out.print("chu vi hinh tron voi ban kinh"+r+"la:"+cv);
        System.out.print("\ndien tich hinh tron voi ban kinh"+r+"la:"+dt);
    }
}
