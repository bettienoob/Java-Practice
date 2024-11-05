package MyMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


//LinkedHashMap//
class JavaMaps {
    public static void main(String[] args){
        Map<Integer, String> lruCache = new LRUCache();

        lruCache.put(1, "Titanic");
        lruCache.put(2, "The House Of Us");
        lruCache.put(3, "Spider Man");
        lruCache.put(4, "Petrang Kabayo");
        lruCache.put(5, "Petrang Pepe");

        System.out.println("--Insertion order since no entry has been access yet--\n");

        lruCache.put(6, "Hari ng Hotdog");
        lruCache.put(7, "Jose Rizal");

        lruCache.get(3);
        lruCache.get(5);

        for (Entry<Integer, String> entry : lruCache.entrySet()){
            System.out.println(entry);
        }


    }
}








// hashMap

//public class JavaMaps {
//    public static void main(String[] args){
//        Map<Movie, Float> moviesMap = new HashMap<>();
//
//        System.out.println("--Values can be object--");
//
//        Movie titanic = new Movie("Titanic", "Leonardo DeCaprio");
//        Movie spiderMan = new Movie("Spider Man", "Kahit sino");
//        Movie theHouseOfUs = new Movie("The House of Us", "Alden Richard");
//        Movie theHouseOfUs2 = new Movie("The House of Us", "Alden Richard");
//
//        moviesMap.put(titanic, 8.9f);
//        moviesMap.put(spiderMan, 9.0f);
//        moviesMap.put(theHouseOfUs, 7.9f);
//        moviesMap.put(theHouseOfUs2, 7.5f);
//
//        for(Map.Entry<Movie, Float> entry : moviesMap.entrySet()){
//            System.out.format("Title: %s, Actor: %.1f\n",
//                    entry.getKey(), entry.getValue());
//        }
//
//    }
//}