package eks21;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.transform.stream.StreamSource;

public class opg2 {

	public static void main(String[] args) {
		//init
		List<Bok> boker = List.of(
				new Bok("Core Java Volume I", 2022, List.of("Cay Horstmann")),
				new Bok("Effective Java", 2017, List.of("Cay Horstmann")),
				new Bok("Head First Java", 2005, 
				List.of("Kathy Sierra", "Bert Bates")),
				new Bok("Java Concurrency in Practice", 2006, 
				List.of("Brian Goetz", "Tim Peierls", "Joshua Bloch"))
				);

		//opg B
		List<Bok> bokerTil2015 = boker.stream().filter(a -> a.getAar()<=2015).collect(Collectors.toList());
		bokerTil2015.forEach(System.out::println);
		System.out.println();
		
		
		//opg C
		List<Bok> bokerOmJava = boker.stream().filter(a->a.getTittel().contains("Java")).collect(Collectors.toList());
		bokerOmJava.forEach(System.out::println);
		System.out.println();
		
		
		//opg D+E
		Comparator<String> paaEtternavn = (a,b) -> (a.substring(a.lastIndexOf(" ")).compareTo(b.substring(b.lastIndexOf(" "))));
		
		List<String> forfattere = boker.stream()
				.map(a->a.getForfattere())
				.flatMap(Collection::stream)
				.distinct()
				.sorted(paaEtternavn)
				.collect(Collectors.toList());

		
		forfattere.forEach(System.out::println);
		
	}
}

