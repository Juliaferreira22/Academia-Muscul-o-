package views;

import controllers.AlunoController;
import controllers.ExercicioController;
import controllers.PlanoDeTreinoController;
import controllers.TreinoController;
import models.Aluno;
import models.Exercicio;
import models.PlanoDeTreino;
import models.Treino;
import utils.Console;

public class CadastrarPlanoDeTreino {

    public void rendenizar(){
        PlanoDeTreino planoDeTreino = new PlanoDeTreino();
        AlunoController alunoController = new AlunoController();
        TreinoController treinoController = new TreinoController();
        ExercicioController exercicioController = new ExercicioController(); 
        PlanoDeTreinoController planoDeTreinoController = new PlanoDeTreinoController();

        System.out.println("\n -- CADASTRO DE PlANO DE TREINO -- \n");
        
        String cpfAluno = Console.readString("Digite o CPF do aluno:");
        Aluno aluno = alunoController.buscarPorCpf(cpfAluno);
        if (aluno != null){
            planoDeTreino.setAluno(aluno);
        }
        else {
            System.out.println("Aluno não encontrado!");
        }
        

    
        String partecorpo  = Console.readString("Digite a parte do corpo: ");
        Treino treino = treinoController.buscarPorParteCorpo(partecorpo);
        if (treino != null) {
        planoDeTreino.setTreino(treino);
        }

        else {
            System.out.println("Parte do Corpo não encontrado!");
        }

    
        

                String exercicio  = Console.readString("Digite nome  do exercício: ");
                Exercicio exercicio = exercicioController.buscarPornomeExercicio(exercicio);
                if (exercicio != null) {
                    planoDeTreino.setExercicio(exercicio);
                   planoDeTreinoController.cadastrar(planoDeTreino);
                }

                else {
                    System.out.println("Exercício não encontrado!");
                }

                System.out.println("TREINO CADASTRADO COM SUCESSO!!!");
                

        
                
        

    }
   
    
}

    


