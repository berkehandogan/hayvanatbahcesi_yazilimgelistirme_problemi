package hayvanatBahcesiApp;

import java.util.List;
import java.util.Random;

public class Tavuk extends Hayvan{
	
	

	public Tavuk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tavuk(int x, int y, String cinsiyet, int toplamAdim, int ciftlesmeDurum) {
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
        
        System.out.println("Tavuk hareket etti. Yeni konumu: x="+getX()+",y="+getY());
	}

}
