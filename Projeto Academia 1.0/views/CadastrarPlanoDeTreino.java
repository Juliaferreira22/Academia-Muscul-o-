package views;

import controllers.AlunoController;
import controllers.TreinoController;
import controllers.PlanoDeTreinoController;
import models.Aluno;
import models.Treino;
import models.PlanoDeTreino;
import utils.Console;

public class CadastrarPlanoDeTreino {
    public void renderizar() {
        PlanoDeTreino planoDeTreino = new PlanoDeTreino();
        AlunoController alunoController = new AlunoController();
        TreinoController treinoController = new TreinoController();
        PlanoDeTreinoController planoDeTreinoController = new PlanoDeTreinoController();

        System.out.println("\n -- CADASTRO DE VENDAS -- \n");

        // aluno
        String cpfaluno = Console.readString("Digite o CPF do aluno: ");
        Aluno aluno = alunoController.buscarPorCpf(cpfaluno);
        if (aluno != null) {
            planoDeTreino.setAluno(aluno);

                // Produto
                String partedocorpo = Console.readString("Digite a parte do corpo: ");
                String exercicio = Console.readString("Digite o exercicio: ");
                Treino treino = treinoController.buscarPorExercicio(exercicio);
                if (treino != null) {
                    planoDeTreino.setPlanoDeTreino(planoDeTreino);
                    planoDeTreinoController.cadastrar(planoDeTreino);
                    System.out.println("Plano de treino cadastrado com sucesso!");
                }
                 else {
                    System.out.println("Treino não encontrado!");
                }
            } 

            else {
                System.out.println("aluno não encontrado!");
            }

        } 


    }
    

