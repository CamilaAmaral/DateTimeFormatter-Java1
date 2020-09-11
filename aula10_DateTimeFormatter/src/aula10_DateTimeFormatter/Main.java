package aula10_DateTimeFormatter;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {

		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDateTime dataAniversario = LocalDateTime.of(1989, Month.DECEMBER, 18, 14,30,15);
		DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
		Duration duracao = Duration.between(dataAniversario, localDateTime);
		
		System.out.println("Data nasc: " + dataAniversario.format(formatadorBarra));
		System.out.println("Diferença entre datas em segundos: " + duracao.getSeconds());
		System.out.println("Ano de nascimento foi bissexto? " + dataAniversario.toLocalDate().isLeapYear());

	}

}
