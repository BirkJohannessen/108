package eks20v;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainE {
	
	
	
	
public static void main(String[] args) {
	//init
	List<Student> studenter = Arrays.asList(
			new Student("Birk", 10002, "Johannessen"),
			new Student("Atle", 10001, "Patle"),
			new Student("tull", 10004, "Arnesen"),
			new Student("tall", 10003, "Aarstad")
			);
	
	//fra denne løsningen
	List<Integer> studentnumre = new ArrayList<>();
	for (Student s : studenter) {
		if (s.getEtternavn().startsWith("A")) {
				studentnumre.add(s.getStudentNr());
		}
	}
	//Til denne løsningen:

	//Start
	List<Integer> studentNummere = studenter.stream()
			.filter(a->a.getEtternavn().startsWith("A"))
			.map(a->a.getStudentNr())
			.collect(Collectors.toList());
		studentNummere.forEach(System.out::println);

	//Slutt
	}
}