package UI;

import java.util.Random;
import Model.Dog;
import Model.Person;

public class DriverProgram {
    public static void main(String[] args) {

    }

    public float genRandom(float h, float l) {
        Random rand = new Random();
        return rand.nextFloat() * h - l;
    }
}
