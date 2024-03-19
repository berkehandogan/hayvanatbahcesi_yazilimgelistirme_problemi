package hayvanatBahcesiApp;

import java.util.List;
import java.util.Random;

public class Aslan extends Hayvan{

	public Aslan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aslan(int x, int y, String cinsiyet, int toplamAdim, int ciftlesmeDurum) {
		super(x, y, cinsiyet, toplamAdim, ciftlesmeDurum);
		// TODO Auto-generated constructor stub
	}

	@Override
	void hareketEt() {
		int toplamAdim = 4;
		Random random = new Random();
		int deltaX = random.nextInt(toplamAdim+1);
		int deltaY = (toplamAdim - deltaX);
		setX(getX() + deltaX);
        setY(getY() + deltaY);
        
        System.out.println("Aslan hareket etti. Yeni konumu: x="+getX()+",y="+getY());
	}

	/*@Override
	public void saldir(List<Hayvan>hayvanlar,Hayvan hayvan) {
		
		int mesafe = Math.abs(getX() - hayvan.getX())+ Math.abs(getY()-hayvan.getY());
		
		if (hayvan instanceof Koyun || hayvan instanceof Inek) {
            if (mesafe <= 5) {
                System.out.println("Aslan, hayvanı avladı!");
                hayvanlar.remove(hayvan);
            } else {
                System.out.println("Hayvan çok uzakta, avlanamaz.");
            }
        } else {
            System.out.println("Aslan, bu hayvanı avlayamaz.");
        }
	}*/
}
