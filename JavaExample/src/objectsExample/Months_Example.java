package objectsExample;

public class Months_Example {
	Month m ;
	
	public Months_Example(Month m) {
		this.m = m;
	}
	
	public void printAMonth() {
		switch (m){
		case JANUARY: System.out.println("First month of the year is cold. JAN");
		break;
		case FEBRUARY: System.out.println("2nd month of the year is very cold. FEB");
		break;
		default:
			System.out.println("This is a month of the year");
			break;
		}
	}

	public static void main(String[] args) {
		Months_Example me = new Months_Example(Month.JANUARY);
		me.printAMonth();
		Months_Example you = new Months_Example(Month.FEBRUARY);
		you.printAMonth();
		
		for (Month luna: Month.values()) {
			System.out.println(luna.name() + luna.getMonthNumber());
		}
	}
		
}
