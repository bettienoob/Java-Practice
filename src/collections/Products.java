package collections;

import java.util.Objects;

public class Products{
    private String name;
    private String category;

    public Products(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "\nProducts{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object other){
        if(other == null) return false;

        if(!(other instanceof Products)) return false;

        Products otherProduct = (Products) other;

        if(otherProduct.name.equals(this.name) && otherProduct.category.equals(this.category)) return true;

        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, category);
    }

//    @Override
//    public int compareTo(Products o){
//        int compareName = this.name.compareTo(o.name);
//
//        if(compareName != 0) return compareName;
//
//        return this.category.compareTo(o.category);
//    }
}
