package UI;

import java.util.*;
import Model.Dog;
import Model.Person;

public class DriverProgram {
    Dog dog;
    Person person;

    public static void main(String[] args) {
        Dog dog = new Dog();
        Person person = new Person();

        Scanner r = new Scanner(System.in);

        String opc = "0";
        dog = newDog();
        person = newPerson();
        person.setCookie((int)genRandom(2,0));

        System.out.println("Bienvenido a la veterinaria");
        System.out.println("-".repeat(40));

        while (!opc.equals("5")){
            System.out.println("Opciones: \n1. Nueva persona \n2. Nuevo perro \n3. Sacar galleta \n4. Interactuar \n5. Salir \nSeleccione una opcion:");
            opc = r.nextLine();
            switch (opc) {
                case "1":
                    person = newPerson();
                    break;
                case "2":
                    dog = newDog();
                    break;
                case "3":
                    boolean val = person.hasCookie();
                    if (val) {
                        System.out.println("Ha sacado su galleta");
                    } else {
                        System.out.println("Ya no tiene galletas disponibles");
                    }
                    break;
                case "4":
                    dog.psican(person);
                    opc = verifyMood(dog, opc);
                    break;
                case "5":
                    System.out.println(" ");
                    System.out.println("Gracias por usar el programa");
                    break;
            }
            System.out.println("-".repeat(40));
            System.out.println(" ");
        }
    }

    public static Person newPerson () {
        Person person = new Person();
        person.setReliability(genRandom(10.0f, 0f));
        return person;
    }

    public static Dog newDog () {
        Dog dog = new Dog();
        dog.setMood(genRandom(10f, 5f));
        dog.setThreshold(genRandom(-20f,0f));
        return dog;
    }

    public static String verifyMood(Dog d, String opc) {
        if (d.getMood()<d.getThreshold()) {
            System.out.println("Has sido mordido por el perro \nHa renunciado a su labor.");
            return "5";
        } else if (d.getMood() < 0 && d.getMood() > d.getThreshold()) {
            System.out.println("El perro ha ladrado");
        } else if (d.getMood() > 0) {
            System.out.println("El perro se encuentra tranquilo, esta moviendo su cola feliz");
        }
        return "0";
    }
    public static float genRandom(float h, float l) {
        Random rand = new Random();
        return rand.nextFloat() * h - l;
    }


}
