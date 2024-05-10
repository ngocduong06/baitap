package linkedListchuon4;
import java.util.Scanner;
import java.util.LinkedList;
public class linkedList {
    
  public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("C#");
        linkedList.add("Python");
        linkedList.add("Java");

        System.out.println(" phuong thuc addAll() ");
        System.out.println("===========================");
        LinkedList<String> list = new LinkedList<>();
        list.addAll(list);
        System.out.print("list: ");
        showList(list);

        System.out.println("\n phuong thuc retainAll() ");
        System.out.println("===========================");
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Anh");
        list.retainAll(list2);
        System.out.println("List1: ");
        showList(list);
        System.out.println("\n  phuong thuc removeAll() ");
        System.out.println("===========================");
        list.removeAll(list2);
        System.out.println("List: ");
        showList(list);
    }

    private static void showList(LinkedList<String> linkedList) {
        for (String obj : linkedList){
            System.out.print("\t" + obj + ", ");
        }
        System.out.println();
    }
    
}
  
    

