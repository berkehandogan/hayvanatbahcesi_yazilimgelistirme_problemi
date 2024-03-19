package hayvanatBahcesiApp;

import java.util.Random;

public class Main {

	public static Avci avci;

	public static void main(String[] args) {

		Hayvan h = new Hayvan();
        h.hayvanEkle(5, "Dişi", 3, Kurt.class, 0);
        h.hayvanEkle(5, "Erkek", 3, Kurt.class, 0);
        
        h.hayvanEkle(15, "Dişi", 2, Koyun.class, 0);
        h.hayvanEkle(15, "Erkek", 2, Koyun.class, 0);
        
        h.hayvanEkle(5, "Dişi", 2, Inek.class, 0);
        h.hayvanEkle(5, "Erkek", 2, Inek.class, 0);
        
        h.hayvanEkle(10, "Dişi", 1, Tavuk.class, 0);
        h.hayvanEkle(10, "Erkek", 1, Horoz.class, 0);
        
        h.hayvanEkle(4, "Dişi", 4, Aslan.class, 0);
        h.hayvanEkle(4, "Erkek", 4, Aslan.class, 0);
        
        // bu sekilde devam ettir.
        avci = new Avci(0, 0, 1);
       
        h.hareketEttir();
    
		/*
		 * for (int i = 0; i <= 15; i++) {
		 * 
		 * hayvanlar.add(new Koyun(0, 0, "Erkek", 2)); hayvanlar.add(new Koyun(0, 0,
		 * "Disi", 2)); } for (int i = 0; i <= 5; i++) { hayvanlar.add(new Kurt(0, 0,
		 * "Erkek", 3)); hayvanlar.add(new Kurt(0, 0, "Disi", 3)); } for (int i = 0; i
		 * <= 5; i++) { hayvanlar.add(new Inek(0, 0, "Erkek", 2)); hayvanlar.add(new
		 * Inek(0, 0, "Disi", 2)); } for (int i = 0; i <= 10; i++) { hayvanlar.add(new
		 * Tavuk(0, 0, "Disi", 1)); } for (int i = 0; i <= 10; i++) { hayvanlar.add(new
		 * Horoz(0, 0, "Erkek", 1)); }
		 */

	}
}