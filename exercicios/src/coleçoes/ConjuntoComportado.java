package coleçoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		SortedSet<String> listaAprovados = new TreeSet<>();//CONJUNTO por ordem
		listaAprovados.add("ana");
		listaAprovados.add("carlos");
		listaAprovados.add("lucas");
		listaAprovados.add("jose");
		listaAprovados.add("taina");
		
		for (String candidatos : listaAprovados) {
			System.out.println(candidatos);
		}
		
		Set<Integer> nums = new HashSet<>();//CONJUNTO bagunçado
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(144);
		nums.add(5);
		for (Integer n : nums) {
			System.out.println(n);
		}
	}

}
