package ExStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class Ex1StreamAPI {
	public static void main(String[] args) {
		List<String> numerosAleatorios = Arrays.asList("1","8","2","9","7","6","3","4","0","1");
	
		System.out.println("Imprima todos os elementos dessa lista de String: ");
//		numerosAleatorios.stream()
//			.forEach(System.out::println);
//		numerosAleatorios.stream().forEach(System.out::println);//REFERENCE METHOD, o mesmo que a linha de cima, de forma simplificada
//		System.out.println("Pegue os 5 �ltimos primeiros e coloque dentro de um Set: " );
//		numerosAleatorios.stream()
//			.limit(5)
//			.collect(Collectors.toSet())//nao aceita elementos repetidos, tem como p�r dentro de uma vari�vel caso nao queira imprimir e sim usar
//			.forEach(System.out::println);
		
//		System.out.println("Transforme esta lista de String em uma lista de n�meros inteiros:");
//		List<Integer> numerosAleatorios1 = numerosAleatorios.stream()
//				.map(Integer::parseInt).collect(Collectors.toList());
//		List<Integer> collectList = numerosAleatorios.stream()
//			.map(Integer::parseInt)
//			.collect(Collectors.toList());
//		List<Integer> collectList = numerosAleatorios.stream()
//				.map(Integer::parseInt)
//				.collect(Collectors.toList());
		
//		System.out.println("Pegue os n�meros pares e maiores que 2 e coloque em uma lista");
//		List <Integer> ListParesMaioresQue2 = numerosAleatorios.stream()
//		.map(Integer::parseInt)
//		.filter(i -> (i % 2 == 0 && i > 2))
//		.collect(Collectors.toList());	
//		System.out.println(ListParesMaioresQue2);

//		System.out.println("Mostre a m�dia dos n�meros: ");
//		numerosAleatorios.stream()
//			.mapToInt(Integer::parseInt)
//			.average()
//			.ifPresent(System.out::println);
//	
		System.out.println("Remova os valores �mpares: ");
				List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
				.map(Integer::parseInt)
				.collect(Collectors.toList());
				numerosAleatoriosInteger.removeIf(i -> (i % 2 !=0)); 
		System.out.println(numerosAleatoriosInteger);
		
//		 System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
	
//	     System.out.println("Retirando os n�meros repetidos da lista, quantos n�meros ficam? " + countNumerosUnicos);
	
//		 System.out.print("Mostre o menor valor da lista: ");
	
//		 System.out.print("Mostre o maior valor da lista: ");
        
//       System.out.println("Pegue apenas os n�meros �mpares e some: " + somaDosNumerosPares);
	
//       System.out.println("Mostre a lista na ordem n�merica: ");

//		 System.out.println("Agrupe os valores �mpares m�ltiplos de 3 ou de 5:");
	}
}
