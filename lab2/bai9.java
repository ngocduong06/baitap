import java.util.Scanner;
public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        int t=0,h=0,s=0;
        System.out.println("nhap chuoi bat ki:");
        chuoi=sc.nextLine();

        for(int i=0;i<=chuoi.length()-1;i++){             
            if(chuoi.charAt(i)>=48&&chuoi.charAt(i)<=57){
                ++s;
            }
            else if(chuoi.charAt(i)>=65&&chuoi.charAt(i)<=90){
                ++h;
            }
            else if(chuoi.charAt(i)>=97&&chuoi.charAt(i)<=122){
                ++t;
            }
            else{
                System.out.println("ky tu"+chuoi.charAt(i)+"khong xac dinh.");
            }
        }
        System.out.println("ky tu Number co trong chuoi la:"+s);
        System.out.println("ky tu Normal co trong chuoi la:"+t);
        System.out.println("ky tu Cap co trong chuoi la:"+h);
    }
}