package objectsExample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MinimalTimeClient implements TimeClient {
	
	private LocalDateTime dateAndTime;
	
	public MinimalTimeClient() {
		dateAndTime = LocalDateTime.now();
	}

	@Override
	public void setTime(int hour, int min, int sec) {
		LocalTime timeToSet = LocalTime.of(hour, min, sec);
		LocalDate currentDate = LocalDate.from(dateAndTime);
		dateAndTime = LocalDateTime.of(currentDate, timeToSet);
	}

	@Override
	public void setDate(int day, int month, int year) {
		LocalTime currentTime = LocalTime.from(dateAndTime);
		LocalDate dateToSet = LocalDate.of(year, month, day);
		dateAndTime = LocalDateTime.of(dateToSet, currentTime);
	}

	@Override
	public LocalDateTime getLocalDateTime() {
		return dateAndTime;
	}

	public static void main(String[] args) {
		TimeClient myTime = new MinimalTimeClient();
		//myTime.setDate(12, 06, 2017);
		System.out.println(myTime.getLocalDateTime().toString());
	}

}
