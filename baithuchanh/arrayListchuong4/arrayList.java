package arrayListchuong4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class arrayList {
    public static void main(String []args){
    // slide 14 tao 1 arrayList 
    ArrayList <String> arrayListString = new ArrayList<> ();
    arrayListString.add("java");
    arrayListString.add("html");
    arrayListString.add("c++");
    arrayListString.add("c#");
    System.out.println("day la slide 14 chuong 4 \n"+"phan tu co trong arrString la:");
    for(int i =0;i<arrayListString.size();i++){  // dung vong for chay arrayList slide 17
        System.out.println(arrayListString.get(i));
    }
    ArrayList<Integer> arrayListInt = new ArrayList<> ();   // arrayList dung for cai tien slide 18
    arrayListInt.add(6);
    arrayListInt.add(2);
    arrayListInt.add(5);
    System.out.println("day la slide18 chuong4 \n"+"phan tu co trong arrInt la:");
    for( int number : arrayListInt){
        System.out.println(number);
    }
   // su dung Iterator slide19 
   ArrayList<Float> arrayListFloat = new ArrayList<> ();
   arrayListFloat.add(0.6f);
   arrayListFloat.add(0.8f);
   arrayListFloat.add(0.1f);
  Iterator<Float> iterator = arrayListFloat.iterator();
  System.out.println("day la slide19 chuong4 \n"+"phan tu co trong arrFloat la:");
  while (iterator.hasNext()) {
    System.out.println(iterator.next() );
  } 
 // su dung ListIterator slide20
  ArrayList<Character> arrayListChar = new ArrayList<> ();
  arrayListChar.add('a');
  arrayListChar.add('b');
  arrayListChar.add('c');
  arrayListChar.add('d');
  ListIterator<Character> listIterator = arrayListChar.listIterator();
  System.out.println("day la slide20 chuong 4 \n"+"phan tu co trong arrChar la:");
  while(listIterator.hasNext()){
  System.out.println(listIterator.next() );
  }
  //slide20 viet chuong trinh su dung 1 so pt cua arrayList
  arrayListString.isEmpty();
  arrayListString.add(0, "D");
  arrayListString.set(1, "da thay doi");
  arrayListString.remove(3);
  System.out.println("+day la slide 20 chuong 4 \n"+"sau khi dung 1 so phuong thuc de thay doi thi cac phan tu trong mang arrstring la:");
  for(int i=0;i<arrayListString.size();i++){
    System.out.println(arrayListString.get(i));
  }



  //slide22 
  ArrayList<String> arrString = new ArrayList<>(3);
  arrString.add("Red");
  arrString.add("Blue");
  arrString.add("Green");
  arrString.add("Orange");
  arrString.add("Pink");
  arrString.remove("Green");
  arrString.add("Yellow");
  System.out.println("day la slide20\n"+arrString.get(1) );
  System.out.println(arrString.contains("Orange"));
  System.out.println(arrString.size());
  System.out.println(arrString);


    }
}