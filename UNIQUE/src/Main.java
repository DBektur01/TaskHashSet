import java.util.*;
import java.util.jar.JarEntry;

public class Main {
    public static void main(String[] args) {
        //TODO HashSet
        //Java program to retrieve all the elements in a HashSet list:
        Set<Integer>set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        System.out.println(set1);

        //Java program to get the number of elements in a HashSet:
        Set<Integer>set2=new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        int size=set2.size();
        System.out.println("Size: "+size);

        //Java program to free the HashSet:
        Set<Integer>set3=new HashSet<>();
        set3.add(1);
        set3.add(2);
        set3.add(3);
        set3.add(4);

        set3.clear();
        System.out.println("the set has been cleared: "+set3);

        //Java program to check if HashSet is empty or not:
        Set<Integer>set4=new HashSet<>();
        set4.add(3);
        if (set4.isEmpty()){
            System.out.println("Set is empty");
        }else {
            System.out.println("Set is not empty");
        }
        //Java program to convert a HashSet a into a TreeSet
        HashSet<Integer> set5 = new HashSet<>();
        set5.add(1);
        set5.add(2);
        set5.add(3);
        set5.add(4);

        TreeSet<Integer> treeSet = new TreeSet<>(set5);

        System.out.println(treeSet);
        //Java program for copying the values of a LikedList  to HashSet:
        LinkedList<Integer>linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        Set<Integer>hashSet=new HashSet<>(linkedList);
            System.out.print(hashSet);




    }
}
