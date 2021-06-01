package tiempo_Dos;

public class opTime {
	opTime(){		
		
	}	
	//Segundos a Minutos, Horas, Dias, Meses y Años	
	void convMinOfSec(long sec) {			//Minutos
		long min;
		min=sec/60;
		if(min>0) 
			System.out.println("Minutos: "+min);
		}		
	void convHourOfSec(long sec){			//Horas
		long hour;
		hour=sec/(60*60);
		if(hour>0) 
			System.out.println("Horas: "+hour);
		}	
	void convDayOfSec(long sec) {			//Días
		long day;
		day=sec/(60*60*24);
		if(day>0)
			System.out.println("Días: "+day);
	}	
	void convMonthOfSec(long sec) {			//Meses
		long month;
		month=sec/(60*60*24*30);
		if(month>0)
			System.out.println("Meses: "+month);
	}	
	void convYearOfSec(long sec) {			//Años
		long year;
		year=sec/(60*60*24*30*12);
		if(year>0)
			System.out.println("Años: "+year);
	}	
	//Minutos a Segundos, Horas, Dias, Meses y Años	
	void convSecOfMin(long min) {
		long sec;
		sec=min*60;
		if(sec>0)
			System.out.println("Segundos: "+sec);
	}	
	void convHourOfMin(long min) {
		long hour;
		hour=min/60;
		if(hour>0)
			System.out.println("Horas: "+hour);
	}
	void convDayOfMin(long min) {
		long day;
		day=min/(60*24);
		if(day>0)
			System.out.println("Días: "+day);
	}
	void convMonthOfMin(long min) {
		long month;
		month=min/(60*24*30);
		if(month>0)
			System.out.println("Meses: "+month);
	}
	void convYearOfMin(long min) {
		long year;
		year=min/(60*24*30*12);
		System.out.println("Años: "+year);
	}
	//Horas a segundos, minutos, dias, meses, años
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
