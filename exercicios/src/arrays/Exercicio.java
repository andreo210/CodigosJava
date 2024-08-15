package arrays;

import java.util.Arrays;


public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double [] notasAlunosA = new double [4];
	notasAlunosA[0] = 7.9;
	notasAlunosA[1] =8;
	notasAlunosA[2] = 6.7;
	notasAlunosA[3] = 9.7;
	
	System.out.println(Arrays.toString(notasAlunosA));
	
	double total = 0;
	
	for (int i = 0; i < notasAlunosA.length; i++) {
		 total += notasAlunosA[i];	
	}	
	System.out.println(total / notasAlunosA.length);
	
	
	double[] notasAlunoB = {6.9, 8.9, 5.5, 10};	
	double totalAlunoB = 0;
	for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
	}
	
	System.out.println(totalAlunoB / notasAlunoB.length);
	}

}
