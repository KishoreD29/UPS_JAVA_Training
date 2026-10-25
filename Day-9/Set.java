
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.*;

public class Set {
    public static void main(String[] args) {
        
        // HashSet<Object> s= new HashSet<>();
        // s.add(1);
        // s.add(1);
        // s.add("kishore");
        // s.add("kishore");
        // s.add(2);
        // for (Object x:s){
        //     System.out.println(x);
        // }
        // Map<Integer,Integer> map =new HashMap<>();
        // map.put(1, 1);
        // map.put(2,5);
        // for (var e :map.entrySet()){
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        // }
        // for (int x:map.keySet()){

        //     System.out.println(map.getOrDefault(x,null));
        // }
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.poll());


    }

    
}
