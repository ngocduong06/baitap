package Hinhhoc;
import java.util.Scanner;
public class hinhtron extends hinhhoc {
    float r;
    public hinhtron(){
        ten="hinhtron";
    }
    public void nhapbankinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ban kinh :");
        r=sc.nextFloat();
    }
    public void tinhchuvi(){
        chuvi=r*2*PI;
    }
    public void tinhdientich(){
        dientich=r*r*PI;
    }
}
