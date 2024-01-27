import java.util.Scanner;
public class slide55 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n=20,i;
        for(i=0;i<=n;i++){
            if(i%5==0){
                System.out.println("day la cac so chia het cho 5:"+i);
            } 
        }
        sc.close();
    }
}
