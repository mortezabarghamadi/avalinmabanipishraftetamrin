package Khodro;

public class Mashin extends Khodro {

    public boolean ayadarbazast ;
    public String mark;
    public Mashin(String mark){
        this.mark=mark;
    }


    void bazkardan() {
        System.out.println("dar baz ast");
        ayadarbazast = true;
    }

    public void bastandar() {
        System.out.println("dar baste ast");
        ayadarbazast = false;
    }

    public void harekat() {
        if (!ayadarbazast && ayaroshanast) {
            System.out.println("mashin  dar hal harkat ast");
        } else {
            System.out.println("mashin park shode");
        }
    }

}
