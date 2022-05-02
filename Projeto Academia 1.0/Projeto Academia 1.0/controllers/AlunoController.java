package controllers;

import java.util.ArrayList;

import models.Aluno;

public class AlunoController {
    private static ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public void cadastrar(Aluno aluno){

        alunos.add(aluno);

    }
    public ArrayList<Aluno> listar(){
        return alunos;

    }

    public Aluno buscarPorCpf(String cpf){
        for (Aluno alunoCadastrado : alunos) {
            if(alunoCadastrado.getCpf().equals(cpf)){
                return alunoCadastrado;
            }

        }
        return null;
    }
    
}
