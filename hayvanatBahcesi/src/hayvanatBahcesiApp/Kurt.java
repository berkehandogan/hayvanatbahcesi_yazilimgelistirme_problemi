package hayvanatBahcesiApp;

import java.util.List;
import java.util.Random;

public class Kurt extends Hayvan {

	public Kurt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Kurt(int x, int y, String cinsiyet, int toplamAdim, int ciftlesmeDurum) {
		super(x, y, cinsiyet, toplamAdim, ciftlesmeDurum);
		// TODO Auto-generated constructor stub
	}

	@Override
	void hareketEt() {
		int toplamAdim = 3;
		Random random = new Random();
		//int randomNumber = random.nextBoolean() ? 1 : -1; 
		// - ya da + durumuna gore set edilen deger*randomNumber yapicaz, ileri ya da geri yonde hareket edicek
		int deltaX = random.nextInt(toplamAdim + 1);
		int deltaY = (toplamAdim - deltaX);
		//Math.max(-getX(), Math.min(deltaX, 50 - getX())); // mattris disina cikmasın kontrol y icin de olmalı	
		setX(getX() + deltaX);
		setY(getY() + deltaY);

		System.out.println("Kurt hareket etti. Yeni konumu: x=" + getX() + ",y=" + getY());
	}

	/*
	 * public void ciftles(List<Hayvan> hayvanlar, Hayvan mevcuthayvan) {
	 * 
	 * int yeniDoganSayi = 0; for (Hayvan h : hayvanlar) { if (h instanceof Kurt &&
	 * h.getCiftlesmeDurum() == 0 && mevcuthayvan.getCiftlesmeDurum() == 0) { // int
	 * mesafe = Math.abs(h.getX() - mevcuthayvan.getX()) + Math.abs(h.getY() - //
	 * mevcuthayvan.getY()); int mesafe = (int) Math.round(Math.sqrt(
	 * Math.pow((h.getX() - mevcuthayvan.getX()), 2) + Math.pow((h.getY() -
	 * mevcuthayvan.getY()), 2))); if ((h.getCinsiyet() !=
	 * mevcuthayvan.getCinsiyet())) { if (mesafe <= 30) {
	 * System.out.println(this.getClass().getSimpleName() + " dogdu"); //
	 * ----------------- mevcuthayvan.setCiftlesmeDurum(1); h.setCiftlesmeDurum(1);
	 * yeniDoganSayi++; } } } } mevcuthayvan.setYeniDoganSayi(yeniDoganSayi); }
	 */

	/*@Override
	public void saldir(List<Hayvan> hayvanlar, Hayvan mevcutHayvan) 
	{
		for (Hayvan hayvan : hayvanlar) 
		{
			if (hayvan instanceof Koyun || hayvan instanceof Tavuk || hayvanlar instanceof Horoz) 
			{
				int mesafe = (int) Math.round(Math.sqrt(Math.pow((hayvan.getX() - mevcutHayvan.getX()), 2)
						+ Math.pow((hayvan.getY() - mevcutHayvan.getY()), 2)));
				if (mesafe <= 4) 
				{
					System.out.println("Kurt, " + hayvan.getClass().getName() + " avladı!");
				}
			}
		}
	}*/
}
