package views;

import controllers.AlunoController;
import models.Aluno;
import utils.Console;

public class CadastrarAluno {

    public void rendenizar(){
            Aluno aluno = new Aluno();
            AlunoController alunoController = new AlunoController();

            System.out.println("-- Cadastrar Aluno --\n");
            aluno.setNome(Console.readString("Digite o nome do Aluno:"));
            aluno.setCpf(Console.readString("Digite o CPF do Aluno:"));
            aluno.setDataNascimento(Console.readString("Digite a data de nascimento do Aluno:"));
            aluno.setEndereco(Console.readString("Digite o endereço do Aluno:"));
            aluno.setTelefone(Console.readString("Digite o telefone do Aluno:"));
            aluno.setTelefoneEmergencial(Console.readString("Digite o telefone emergencial do Aluno:"));
            
            alunoController.cadastrar(aluno);

            System.out.println("-- Aluno cadastrado!!");
    }
}
