package ConsPoly;

public class Book {
    private String name = "unknown";

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void checkOutBoo(){
        System.out.println("The book: %s has been checked out successfully");
    }

    @Override
    public String toString(){
        return String.format("Name: %s", name);
    }
}
