import java.util.Scanner;
public class bai12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m,max=0;
        System.out.println("nhap so hang cua ma tran:");
        m=sc.nextInt();
        System.out.println("nhap so cot cua ma tran:");
        n=sc.nextInt();
        int[][]a=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("nhap vao vi tri thu ["+i+"]["+j+"]");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("ma tran vua nhap la:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
        System.out.print(a[i][j] +"\t");
            }
            System.out.println("\n");
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
          if(max<a[i][j]){
            max=a[i][j];
          }
            }
        }
        System.out.println("so lon nhat trong ma tran la:"+max);
    }
}
