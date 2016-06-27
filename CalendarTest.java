import java.time.*;

public class CalendarTest{
	public static void main(String[] args){
		LocalDate today = LocalDate.now();
		int month = today.getMonthValue();
		int dayOfMonth = today.getDayOfMonth();
		LocalDate startDayOfMonth = today.minusDays(dayOfMonth - 1);
		DayOfWeek weekDay = startDayOfMonth.getDayOfWeek();
		int numDayOfWeek = weekDay.getValue();
		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		for(int i = 1; i < numDayOfWeek; i++){
			System.out.print("    ");
		}
		LocalDate d = startDayOfMonth;
		while(d.getMonthValue() == month){
			System.out.printf("%4d",d.getDayOfMonth());
			if(d.equals(today)){
				System.out.print("*");
			}
			else{
				System.out.print("");
			}
			d = d.plusDays(1);
			if(d.getDayOfWeek().getValue() == 1){
				System.out.println();
			}
		}
	}
}