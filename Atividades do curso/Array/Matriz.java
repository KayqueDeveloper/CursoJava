package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int qntdAlunos, qntdNotas;
		double media, total;
		
		System.out.print("Quantos alunos: ");
		qntdAlunos = entrada.nextInt();
		
		System.out.print("Quantas notas: ");
		qntdNotas = entrada.nextInt();
		
		double NotasDaTurma[][] = new double [qntdAlunos][qntdNotas];
		
		total = 0;
		
		for(int a = 0; a < NotasDaTurma.length; a++) {
			for (int n = 0; n < NotasDaTurma[a].length; n++) {
				
				System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
				NotasDaTurma[a][n] = entrada.nextDouble();
				total += NotasDaTurma[a][n];
			}
		}
		
		media = total / (qntdAlunos * qntdNotas);
		System.out.println("A media da turma e: " + media);
		
		for (double[] notasdoluno : NotasDaTurma) {
			System.out.println(Arrays.toString(notasdoluno));
		}
		
		
		entrada.close();
		
		
		
	}

}
