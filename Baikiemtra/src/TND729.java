import java.util.LinkedList;
class TND729 implements Face{
    LinkedList<Face> linkFace = new LinkedList<>();
    TND729 tnd = new TND729();
    String Fullname;
    int age;
    String Thongtinkhac;
    public  String getFullname(){
        return Fullname;
     }
    public  void NhapThongTin(){
   System.out.println("nhap thong tin: ");
    Fullname = sc.next();
   System.out.println("nhap tuoi: ");
   int age=sc.nextInt();
    }
    public  void ThemThongTin(){
       System.out.println("them thong tin can them: ");
     Thongtinkhac=sc.next();   }
    public  void Suathongtin(LinkedList<Face> linked){
     System.out.println("nhap vao ten can sua:");
     String name = sc.next();
     for(int i=0;i<=linked.size();i++){
        if(linked.get(i).getFullname().equals(name)){
        tnd.NhapThongTin();
        linked.add(tnd);
        }
     }
    }
    public  void XoaThongtin(LinkedList<Face> linked){
     System.out.println("nhap vao ten can xoa: ");
     String name=sc.next();
     for(int i=0;i<=linked.size();i++){
      if(linked.get(i).getFullname().equals(name)){
        linked.remove(name);
      }
     }
    }
    public static void Hienthi(LinkedList<Face> linked){
        for(var i:linked){
            System.out.println(i);
         }
    }
}
