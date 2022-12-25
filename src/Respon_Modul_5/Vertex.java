package Respon_Modul_5;

public class Vertex {
    String country;
    Vertex next;
    Edge route;
    Edge last;
    boolean visited = false;

    Vertex(String country) {
        this.country = country;
    }

    public String getCountry(){
        return this.country;
    }
}
