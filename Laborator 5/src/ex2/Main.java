package ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Album> listaAlbume = new ArrayList<Album>();
        listaAlbume.add(new Album("Album b", 1999, 4.5));
        listaAlbume.add(new Album("Album a", 1989, 4.5));
        listaAlbume.add(new Album("Best hits", 2020, 5.0));
        listaAlbume.add(new Album("Mubla", 2005, 3.6));

        System.out.println("Sortare dupa rating si, in caz de egalitate, dupa nume");
        System.out.println("Inainte de sortare:");
        for (int i = 0; i < listaAlbume.size(); i++) {
            Album alb = (Album) listaAlbume.get(i);
            System.out.printf("%.2f %s %d\n", alb.getRating(), alb.getNume(), alb.getAnPub());
        }

        Collections.sort(listaAlbume);
        System.out.println("\nDupa sortare:");
        for (int i = 0; i < listaAlbume.size(); i++) {
            Album alb = (Album) listaAlbume.get(i);
            System.out.printf("%.2f %s %d\n", alb.getRating(), alb.getNume(), alb.getAnPub());
        }
    }
}
