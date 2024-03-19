package hayvanatBahcesiApp;

import java.util.List;
import java.util.Random;

public class Avci {
	
	private int x;
	private int y;
	private int toplamAdim;
	
	public Avci() {
		super();
	}

	public Avci(int x, int y, int toplamAdim) {
		super();
		this.x = x;
		this.y = y;
		this.toplamAdim = toplamAdim;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getToplamAdim() {
		return toplamAdim;
	}

	public void setToplamAdim(int toplamAdim) {
		this.toplamAdim = toplamAdim;
	}
	
	public int saldir(List<Hayvan> hayvanlar, Hayvan mevcutHayvan) {
		int olen = 0;
		for (Hayvan hayvan : hayvanlar) {
					int mesafe = (int) Math.round(Math.sqrt(Math.pow((hayvan.getX() - mevcutHayvan.getX()), 2)
							+ Math.pow((hayvan.getY() - mevcutHayvan.getY()), 2)));
					if (mesafe <= 8) {
						System.out.println("Avci, " + hayvan.getClass().getSimpleName() + " avladı!");
						olen++;
					}		
		}
		return olen;
	}
	
	public void  hareketEt() {
		int toplamAdim = 1;
		Random random = new Random();
		int deltaX = random.nextInt(toplamAdim+1);
		int deltaY = (toplamAdim - deltaX);
		x=x+deltaX;
		y=y+deltaY;
        
        System.out.println("Avci hareket etti. Yeni konumu: x="+x+",y="+y);
	}
	

}
