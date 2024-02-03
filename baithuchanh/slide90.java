import java.util.Scanner;
public class slide90 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String chuoi="";
        System.out.println("nhap vao 1 chuoi bat ki:");
        chuoi=sc.nextLine();
       for(int i=0;i<=chuoi.length()-1;i++){
        char hienthi=chuoi.charAt(i);
        System.out.println("ki tu thu "+i+" la "+hienthi);
        System.out.println("\n");
       }
    }
}
