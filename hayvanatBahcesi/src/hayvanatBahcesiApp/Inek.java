package hayvanatBahcesiApp;

import java.util.List;
import java.util.Random;

public class Inek extends Hayvan {

	public Inek() {
		super();	
	}

	public Inek(int x, int y, String cinsiyet, int toplamAdim, int ciftlesmeDurum) {
		super(x, y, cinsiyet, toplamAdim, ciftlesmeDurum);
		// TODO Auto-generated constructor stub
	}

	@Override
	void hareketEt() {
		int toplamAdim = 2;
		Random random = new Random();
		int deltaX = random.nextInt(toplamAdim+1);
		int deltaY = (toplamAdim - deltaX);
		setX(getX() + deltaX);
        setY(getY() + deltaY);
        
        System.out.println("Inek hareket etti. Yeni konumu: x="+getX()+",y="+getY());
	}


}
