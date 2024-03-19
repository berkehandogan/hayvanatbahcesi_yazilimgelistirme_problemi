package hayvanatBahcesiApp;

import java.util.List;
import java.util.Random;

public class Horoz extends Hayvan{

	public Horoz() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Horoz(int x, int y, String cinsiyet, int toplamAdim, int ciftlesmeDurum) {
		super(x, y, cinsiyet, toplamAdim, ciftlesmeDurum);
		// TODO Auto-generated constructor stub
	}

	@Override
	void hareketEt() {
		int toplamAdim = 1;
		Random random = new Random();
		int deltaX = random.nextInt(toplamAdim+1);
		int deltaY = (toplamAdim - deltaX);
		setX(getX() + deltaX);
        setY(getY() + deltaY);
        
        System.out.println("Horoz hareket etti. Yeni konumu: x="+getX()+",y="+getY());
	}

	

}
