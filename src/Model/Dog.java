package Model;

import java.util.Random;

public class Dog {
    public float mood;

    Random rand = new Random();

    private void psican(Person p){
        this.mood = (float) ((1.0 / p.getReliability()) * (rand.nextFloat() - 0.5) * 10 + this.mood);
        if (p.hasCookie()) {
            p.giveCookie();
            this.mood += (1.0 / p.getReliability()) * (rand.nextInt(2));
        }

        System.out.println("Mi nuevo animo es: "+ mood);
    }
}
