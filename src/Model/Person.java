package Model;

public class Person {

    private float reliability;

    public int getCookie() {
        return cookie;
    }

    private int cookie;

    public void setCookie(int cookie) {
        this.cookie = cookie;
    }

    public float getReliability() {
        return reliability;
    }

    public void setReliability(float reliability) {
        this.reliability = reliability;
    }
    public boolean hasCookie () {
        if (getCookie() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void giveCookie() {
        setCookie(cookie -= 1);
    }

}
