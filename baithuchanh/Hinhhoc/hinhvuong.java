package Hinhhoc;
import java.util.Scanner;
public class hinhvuong extends hinhchunhat {
    float canh;
    public hinhvuong(){
        ten="hinhvuong";
    }
    public void nhapcanh(){
       System.out.println("nhap vao canh cua hinh vuong:");
       canh=sc.nextFloat();
    }
    public void dientich(){
        dientich=canh*canh;
    }
}
