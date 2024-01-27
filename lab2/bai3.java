import java.util.Scanner;
public class bai3 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name;
    int namsinh;
    System.out.println("nhap ten :");
    name=sc.next();
    System.out.println("nhap nam sinh ");
    namsinh=sc.nextInt();
    if(2024-namsinh>=18){
    System.out.println("ban "+name+" da gia");
    }
    else if(2024-namsinh>=16){
        System.out.println("ban "+name+" o do tuoi truong thanh");
    }
    else {System.out.println("ban "+name+" o do tuoi vi thanh nien");}
    sc.close();
}
}