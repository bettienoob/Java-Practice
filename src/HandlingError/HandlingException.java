package HandlingError;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandlingException {

    public static void validateAge(int num){
        if(num < 0) {
            throw new Error("Noooo");
        }
    }

    public static void main(String[] args){
        validateAge(-1);
    }
}
