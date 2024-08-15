package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTEST {

	public static void main(String[] args) {
		List<String> langs	 = Arrays.asList("JS", "PHP","Java", "C++");
		List<Integer> nums	 = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		
		//do tipo object
		String ultimaLinguagem1 = (String) ListaUtil.getUltimo1(langs);
		System.out.println(ultimaLinguagem1);
		
		//do tipo generics
		String ultimaLinguagem2 = (String) ListaUtil.getUltimo2(langs);
		System.out.println(ultimaLinguagem2);
		
		
		//do tipo object
		Integer ultimaNumero1 = (Integer) ListaUtil.getUltimo1(nums);
		System.out.println(ultimaNumero1);
		
		//do tipo generics
		Integer ultimaNumero2 = ListaUtil.<Integer>getUltimo2(nums);
		System.out.println(ultimaNumero2);

	}

}
