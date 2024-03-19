package hayvanatBahcesiApp;

import java.util.List;
import java.util.Random;

public class Koyun extends Hayvan {
	

	public Koyun() {
		super();
	}

	public Koyun(int x, int y, String cinsiyet, int toplamAdim, int ciftlesmeDurum) {
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
        super.x+=toplamAdim;
        
        System.out.println("Koyun hareket etti. Yeni konumu: x="+getX()+",y="+getY());

	}

		
	}
	

