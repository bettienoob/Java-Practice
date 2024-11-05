import Generics.*;

public class Main {

    public static void main(String[] args) {
        Car honda = new Car("Honda", "Civic", 12321.0);

        Repository<Car> carRepo = new Repository<>(honda);

        System.out.println(carRepo);



        }
    }
