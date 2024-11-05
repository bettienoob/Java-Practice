package TreeMaps;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Comparator;

public class TreeMapsMain {
    public static void main(String[] args){
        SortedMap<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                // Swap the order by comparing b to a instead of a to b
                return b - a;
            }
        });

        treeMap.put(3, "Naruto: The Movie");
        treeMap.put(5, "Ang Pangarap Kong Holdap");
        treeMap.put(1, "Spider Man");
        treeMap.put(4, "Si Mama at Si Papa");
        treeMap.put(2, "Ang Panganay na Pogi");

        for (Entry<Integer, String> entry : treeMap.entrySet()){
            System.out.println(entry);
        }
    }
}
