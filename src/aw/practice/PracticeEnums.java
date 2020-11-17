package aw.practice;

public class PracticeEnums {
	
	enum weekDays{
		Sunday,
		Monday,
		Tuesday,
		Wednesday,
		Thursday,
		Friday,
		Saturday
	}
	
	
	
	public static void main(String[] args) {
		String day = "Sunday";
		System.out.println(PracticeEnums.weekDays.Sunday);
		if(PracticeEnums.weekDays.Sunday.toString().equals(day)) {
			System.out.println("It is Sunday");
		}
		
		Sunday tryDay = new Sunday();
		if(PracticeEnums.weekDays.Sunday.equals(tryDay)) {
			System.out.println("It is really Sunday");
		}
	}

}

class Sunday{
	int day;
	Sunday(){
		this.day=1;
	}
}