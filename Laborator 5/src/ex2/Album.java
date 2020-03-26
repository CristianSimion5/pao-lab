package ex2;

public class Album implements Comparable<Album>{
    private String nume;
    private int anPub;
    private double rating;

    public Album(String nume, int anPub, double rating) {
        this.nume = nume;
        this.anPub = anPub;
        this.rating = rating;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setAnPub(int anPub) {
        this.anPub = anPub;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getNume() {
        return nume;
    }

    public double getRating() {
        return rating;
    }

    public int getAnPub() {
        return anPub;
    }

    @Override
    public int compareTo(Album album) {
        if (this.rating == album.rating) {
            return this.nume.compareTo(album.nume);
        }
        if (this.rating < album.rating)
            return -1;
        return 1;
    }
}
