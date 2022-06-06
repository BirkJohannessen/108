package eks21;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class opg1a {

	public static void main(String[] args) {
		List<String> hunder = List.of("Fido", "Buster", "Colin");
		
		Consumer<String> printPlain = a -> {
			System.out.println(a);
		};
		
		Consumer<String> printMedStjerner = a -> {
			System.out.println("*"+a+"*");
		};
		
		Consumer<String> printBaklengs = a -> {
			System.out.println(new StringBuilder(a).reverse());
		};
		
		hunder.forEach(printPlain);
		hunder.forEach(printMedStjerner);
		hunder.forEach(printBaklengs);
	}

}
