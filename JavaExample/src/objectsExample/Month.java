package objectsExample;

public enum Month {
	JANUARY, FEBRUARY, MARCH, APRIL;
	
	int getMonthNumber() {
		return Month.values().length;
	}
}
