package Model;

import java.util.Random;

public class Dog{
    //Se utiliza un atributo para cada variable de su comportamiento
    private float mood;
    private float threshold;

    public float getMood() {
        return mood;
    }

    public void setMood(float mood) {
        this.mood = mood;
    }

    public float getThreshold() {
        return threshold;
    }

    public void setThreshold(float threshold) {
        this.threshold = threshold;
    }


    Random rand = new Random();

    // Algoritmo de la psicologia del perro
    public void psican(Person p){
        setMood((1.0f / p.getReliability()) * (rand.nextFloat() - 0.5f) * 10f + mood);
        if (p.hasCookie()) {
            p.giveCookie();
            setMood(mood += (1.0 / p.getReliability()) * (rand.nextInt(2))) ;
        }

        System.out.println("Mi nuevo animo es: "+ mood);
    }
}
