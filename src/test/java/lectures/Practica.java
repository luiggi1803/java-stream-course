package lectures;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class Practica {

	public static void main(String[] args) throws InterruptedException {
//		LocalDate nacimiento = LocalDate.of(1992, 3, 18);
//		LocalDate actual=LocalDate.now();
//		
//		System.out.println(nacimiento.isAfter(actual));
//		System.out.println(nacimiento.isBefore(actual));
//		
//		LocalTime tiempo1=LocalTime.of(5, 30, 30);
//		LocalTime tiempo2=LocalTime.now();
//		
//		System.out.println(tiempo1.isAfter(tiempo2));
//		System.out.println(tiempo1.isBefore(tiempo2));
//		
//		LocalDateTime fechaTiempo1=LocalDateTime.of(1992,3,18,5, 30, 30);
//		LocalDateTime fechaTiempo2=LocalDateTime.now();
//		
//		System.out.println(fechaTiempo1.isAfter(fechaTiempo2));
//		System.out.println(fechaTiempo1.isBefore(fechaTiempo2));

//		Instant ini = Instant.now();
//		Thread.sleep(1000);
//		Instant fin = Instant.now();
//		
//		System.out.println(Duration.between(ini, fin).toMillis());

//		LocalDate nacimiento = LocalDate.of(1992, 3, 18);
//		LocalDate actual = LocalDate.now();
//
//		Period periodo = Period.between(nacimiento, actual);
//
//		System.out.println("Han pasado : " + periodo.getYears() + " a�os, " + periodo.getMonths() + " meses y "
//				+ periodo.getDays() + " dias");
		
		
		String fecha="18/03/1992";
		DateTimeFormatter formateador=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate nacimiento = LocalDate.parse(fecha,formateador);
		
		System.out.println(formateador.format(nacimiento));
		

	}

}
