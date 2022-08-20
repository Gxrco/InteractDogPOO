package Model;

public class Person {

    private int reliability;
    private boolean cookie;

    public int getReliability() {
        return reliability;
    }

    public void setReliability(int reliability) {
        this.reliability = reliability;
    }

    public boolean hasCookie () {
        return cookie;
    }

    public void giveCookie() {
        cookie = false;
    }

}
