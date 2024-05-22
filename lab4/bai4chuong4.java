import java.util.Scanner;
import Lists.Students;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Iterator;
public class bai4chuong4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> hashsetStrings= new HashSet<> ();
        //Add
        System.out.println("nhap so loai trai cay ban muon nhap");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            System.out.println("nhap ten loai trai cay thu "+ i );
          String  addd=sc.next();
            hashsetStrings.add(addd);
        }
        //Found
        System.out.println("nhap vao loai trai cay ban muon tim");
        String search=sc.next();
        if(hashsetStrings.contains(search)){
            for(String i:hashsetStrings){
         if(i.equals(search)){
            System.out.println("loai hoa qua "+search+" co ton tai");
         } 
        }
        // Delete
     }else System.out.println("loai hoa qua "+search+" khong ton tai ");
     System.out.println("nhap vao ten loai trai cay can xoa");
     String Delete = sc.next();
        if(hashsetStrings.contains(Delete)){
            hashsetStrings.remove(Delete);
        } else System.out.println("trong mang khong chua phan tu "+Delete); 
    System.out.println(" mang hashset con lai la: "+hashsetStrings);
  // Add List
    LinkedList<String> linkedString = new LinkedList<>();
    linkedString.add("Apple");
    linkedString.add("Mango");
    linkedString.add("Melon");
    linkedString.add("Lemon");
    for(String i: linkedString){
        hashsetStrings.add(i);
    }
 Iterator<String> iteratorHash = hashsetStrings.iterator();
   System.out.println("sau khi them ptu cua linkedList thi Hashset co: ");
   while(iteratorHash.hasNext()){
    System.out.print (iteratorHash.next()+"\t");
   }
   for(String i:linkedString){
    hashsetStrings.remove(i);
   }
   System.out.println();
   System.out.println("phan tu con lai cua mang Hash la: "+hashsetStrings);
    }
    }



