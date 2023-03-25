import java.util.ArrayList;
import java.util.Collections;

public class lec6Arraylist {
    public static void main(String agrs[]){
        //Operations in ArrayList
        //1.Declaration of ArrayList
        ArrayList<Integer> list = new ArrayList<>();
    
        //1.Add element
        list.add(14);
        list.add(56);
        list.add(43);
        System.out.println(list);

        //2.Get element
        int element0 = list.get(0);
        int element1 = list.get(2);
        System.out.println(element0);
        System.out.println(element1);

        //3.Add element at specific index
        list.add(2,48); // 2 is the index and 48 is the element to be added
        System.out.println(list);
        
        
        //4.Set element at specific index  (replace)
        list.set(0, 76);  // 0 is the index and 76 is the new element to be replaced
        System.out.println(list);
        
        //5.Delete element 
        list.remove(0);
        System.out.println(list);

        //6.Get size of ArrayList
        int size = list.size();
        System.out.println(size);

        //7.Iteration (LOOPS)
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        int i=0;
        while(i<list.size()){
            System.out.println(list.get(i));
            i++;
        }

        //8.Sorting (only in ascending order)
        Collections.sort(list);
        System.out.println(list);
    }
}
