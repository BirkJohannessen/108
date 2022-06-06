package oblig2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

public class Oblig2 {


	public static void main(String args[]) {
		//oblig2 1a)
		//soirter listen
		List<String> listen = Arrays.asList("10", "1", "20", "110", "21", "12"); 
		Collections.sort(listen, (a,b) -> (Integer.valueOf(a).compareTo(Integer.valueOf(b))));

		listen.forEach(System.out::println);
		
		
		//oblig2 1b)
		//lag universielle funksjoner til beregn.
		
		BiFunction<Integer,Integer,Integer> summerFunksjon = (a,b) -> a+b;
		int sum = beregn(12,13, summerFunksjon);
		
		BiFunction<Integer,Integer,Integer> storstAv = (a,b) -> Math.max(a, b);
		int hoyest = beregn(15,17, storstAv);
		
		BiFunction<Integer,Integer,Integer> avstanden = (a,b) -> Math.abs(a-b);
		
		int avstand = beregn(19,50,avstanden);
		
		System.out.println(sum+" "+hoyest+" "+avstand);
		
		
		
		
		
	}
	
	public static int beregn(int a, int b, BiFunction<Integer,Integer,Integer> bi) {
		int res = (int) bi.apply(a, b);
		
		return res;
	}
}
