package views;

import controllers.AlunoController;
import models.Aluno;

public class ListarAlunos {
    public void rendenizar(){
        AlunoController alunoController = new AlunoController();

        //Arraylist<Aluno> clientes = clienteController.listar();
        System.out.println("-- Listar Clientes --\n");

        // for(int i = 0; i < clientes.size(); i++){                        
            //     System.out.println(clientes.get(i));
            // }
    
        for(Aluno alunoCadastrado : alunoController.listar()){
            System.out.println(alunoCadastrado);
    }
    }

}
