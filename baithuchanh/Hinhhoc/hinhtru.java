package Hinhhoc;
import java.util.Scanner;
public class hinhtru extends hinhtron {
    float chieucao;
    public hinhtru(){
        ten="hinhtru";
    }
    public void nhapchieucao(){
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap vao chieu cao cua hinh tru");
    chieucao=sc.nextFloat();
    }
    public void tinhthetich(){
        super.nhapbankinh();
        thetich=2*PI*r*chieucao;
    }
}
