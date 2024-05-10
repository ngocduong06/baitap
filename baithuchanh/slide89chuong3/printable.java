package slide89chuong3;

public interface printable {
    public void print();
}
class A8 implements printable{
 public void print(){
    System.out.println("hello");
 }
 public static void main(String[] args) {
    printable obj = new A8();
    obj.print();
 }
}
