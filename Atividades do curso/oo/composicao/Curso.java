package oo.composicao;

import java.util.ArrayList;

public class Curso {

	final String nome;
	final ArrayList<Aluno> alunos_lista = new ArrayList<>();
	
	Curso(String nome) {
		this.nome = nome;
	}
	
	void adicionarAluno(Aluno aluno) {
		this.alunos_lista.add(aluno);
		aluno.cursos_lista.add(this);
	}


}
