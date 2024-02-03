import java.util.Scanner;
public class slide81 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n,m,i,j,max=0;
        System.out.println("nhap so hang:");
        m=sc.nextInt();
        System.out.println("nhap so cot:");
        n=sc.nextInt();
        int [][]a=new int[m][n];
         for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print("Nhap phan tu thu  [" + i + ", " + j + "]: ");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("ma tran vua nhap la:");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(+a[i][j] +"\t");
            }
            System.out.println("\n");
        }
     
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(max<a[i][j])
                    max=a[i][j];
            }
        }
        System.out.println("gia tri lon nhat trong ma tran la:"+max);
          sc.close();
        }
    }
