package program_list;
//ShowCurrentTime
public class ShowCurrentTime {

	public ShowCurrentTime() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;

		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;

		System.out.println("Current time is " + currentHour + ":" + currentMinutes + ":" + currentSecond + "GMT");
	}

}
