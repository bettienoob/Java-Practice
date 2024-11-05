package collections;

import java.util.*;

public class CollectionMain {

    public static void main(String[] args){

        Comparator<Products> productsComparator = new Comparator<Products>() {
            @Override
            public int compare(Products o1, Products o2) {
                int compareName = o1.getName().compareToIgnoreCase(o2.getName());

                if(compareName != 0){
                    return compareName;
                }

                return o1.getCategory().compareToIgnoreCase(o2.getCategory());
            }
        };

        Products phone = new Products("iPhone", "Mobiles");
        Products tv = new Products("Samsung", "Electronics");
        Products jeans = new Products("Levis", "Apparel");
        Products watch = new Products("Rolex", "Accessories");

        SortedSet<Products> treeSet = new TreeSet<>(productsComparator);
        treeSet.add(phone);
        treeSet.add(tv);
        treeSet.add(jeans);
        treeSet.add(watch);

        for (Products product : treeSet){
            System.out.println(product);
        }

    }

}