package selftest;
/**
 * @project: oschina
 * @filename: deposit.java
 * @version: 0.10
 * @author: JM Han
 * @date: 1:29 PM 2/16/2016
 * @comment: Calculate the deposit state
 * @result:
 */

class Year{
	int y;
	Year(int y){
		this.y = y;
	}
	void update(){
		y = y + 1;

	}
}

class Month{
	int m;
	boolean newyear;
	Month(int m){
		this.m = m;
	}
	boolean update(){
		m = m + 1;
		if(m > 12) {
			m = 1;
			newyear = true;
		}
		return newyear;
	}
}

class Date{
	Year y;
	Month m;
	Date(Year y, Month m){
		this.y = y;
		this.m = m;
	}
	void update(){
		if(m.update())
			y.update();
	}

	void now(){
		System.out.print(y.y + "/" + m.m + ": ");
	}
}

class Money{
	Year y = new Year(2016);
	Month m = new Month(1);
	Date d = new Date(y, m);

	int free;
	int monthly;
	int yearly;
	Money(int y, int q, int f){
		yearly = y;
		monthly = q;
		free = f;
	}

	void increase(){
		d.update();
		int nquarter = monthly + 15000;
		if(nquarter >= 50000){
			int nyearly = yearly + 50000;
			yearly = nyearly;
			nquarter -= 50000;
		}
		d.now();
		System.out.println("yearly: "+ yearly + " monthly: " + monthly + " free: " + free);
		monthly = nquarter;
	}

	void prt(){
		System.out.println("yearly: " + yearly + " quater: " +
				monthly + " free: " + free);
	}
}

public class deposit {
	public static void main(String[] args) {
		Money m = new Money(50000, 20000, 0);
		m.prt();
		int i = 1;
		while (i++ < 15){
			m.increase();
		}
		m.prt();
	}
}
