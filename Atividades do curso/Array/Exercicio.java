package Array;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double notasAluno[], total, total2;
		notasAluno = new double[3];
		System.out.println(Arrays.toString(notasAluno));
		notasAluno[0] = 7.9;
		notasAluno[1] = 8;
		notasAluno[2] = 9;
		
		System.out.println(Arrays.toString(notasAluno));
		
		total = 0;
		for(int i = 0; i < notasAluno.length; i++) {
			total += notasAluno[i];
		}
		System.out.println(total / notasAluno.length);
		
		double NotasAlunoB[] = {8.5, 6.4, 9.2};
		total2 = 0;
		for (int i = 0; i < NotasAlunoB.length; i++) {
			total2 += NotasAlunoB[i];
		}
		System.out.println(total2 / notasAluno.length);
		
		
	}

}
