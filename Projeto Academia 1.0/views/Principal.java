package views;
import java.util.ArrayList;
import models.Aluno;
import models.PlanoDeTreino;
import models.Treino;
import utils.Console;

public class Principal {
    int op;

    public static void main(String[] args) {
        int op = 0;
        ArrayList<Aluno> Alunos = new ArrayList<Aluno>();
        ArrayList<Treino> Treinos = new ArrayList<Treino>();
        ArrayList<PlanoDeTreino> planoDeTreinos = new ArrayList<PlanoDeTreino>();

        do{

        System.out.println("-- ACADEMIA LIFE --\n");
        System.out.println("|--------------------------------|\n");
        System.out.println("|-- 1- Cadastrar Aluno ----------|\n");
        System.out.println("|-- 2- Listar Aluno -------------|\n");
        System.out.println("|-- 3- Cadastrar Treino ---------|\n");
        System.out.println("|-- 4- Listar Treino ------------|\n");
        System.out.println("|-- 5- Cadastrar Plano de Treino |\n");
        System.out.println("|-- 6- Listar Plano de Treino ---|\n");
        System.out.println("|-- 7- Registrar PlanoDeTreinos ---------|\n");
        System.out.println("|-- 8- Listar PlanoDeTreinos ------------|\n");
        System.out.println("|-- 9- Listar PlanoDeTreinos Por Aluno --|\n");
        System.out.println("|-- 0- SAIR ---------------------|\n");
        System.out.println("|--------------------------------|\n");

        op = Console.readInt("Digite uma opção: \n");
        


        switch (op) {
            case 1:

            CadastrarAluno cadastrarAluno = new CadastrarAluno();
            cadastrarAluno.rendenizar();


                break;
            case 2:

            ListarAlunos listarAluno = new ListarAlunos();
            listarAluno.rendenizar();
                              
                break;
            case 3:

                CadastrarTreino CadastrarTreino = new CadastrarTreino();
                CadastrarTreino.renderizar();
                break;
            case 4:

                ListarTreinos listarTreinos = new ListarTreinos();
                listarTreinos.renderizar();
                break;
            case 5:

                CadastrarPlanoDeTreino cadastrarPlanoDeTreino = new CadastrarPlanoDeTreino();
                cadastrarPlanoDeTreino.renderizar();
                break;
            case 6:

                ListarPlanoDeTreino listarPlanoDeTreinos = new ListarPlanoDeTreino();
                listarPlanoDeTreinos.renderizar();
            case 0:

                System.out.println("\n -- SAINDO -- \n");
                break;
            default:
            
                System.out.println("\n --OPÇÃO INVÁLIDA -- \n");
                break;
                
        }

    } while (op != 0);
    
        
    }
}
