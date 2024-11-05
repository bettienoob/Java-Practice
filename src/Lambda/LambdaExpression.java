package Lambda;

@FunctionalInterface
interface Printable {
    void print(String message);
}

public class LambdaExpression{

    public static void main(String[] args){
        Printable printMessage = System.out::print;
        printMessage.print("mama");
    }
}
