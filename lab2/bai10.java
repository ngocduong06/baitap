import java.util.Scanner;
public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi="";
        int dem=0,vitri=0;
        char n;
        do{
            System.out.println("nhap vao chuoi:");
            chuoi=sc.nextLine();
        }while(chuoi.length()>80);
      System.out.println("nhap vao ki tu can tim:");
      n=sc.next().charAt(0);
      dem=0;
      vitri=chuoi.indexOf(n);
      while(vitri>=0){
        dem++;
        vitri=chuoi.indexOf(n,vitri+1);
      }
         System.out.println("ky tu da nhap la:"+n);
         System.out.println("so lan xuat hien"+dem);
         }
      }
