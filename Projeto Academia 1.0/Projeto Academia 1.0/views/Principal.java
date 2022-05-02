package views;
 import utils.Console;

public class Principal {
public static void main(String[] args) {

        int op = 0;

    

        do{

        System.out.println("-- VENDAS --\n");
        System.out.println("|--------------------------------|\n");
        System.out.println("|-- 1- Cadastrar Aluno ----------|\n");
        System.out.println("|-- 2- Listar Aluno -------------|\n");
        System.out.println("|-- 3- Cadastrar Treino ---------|\n");
        System.out.println("|-- 4- Listar Treino ------------|\n");
        System.out.println("|-- 5- Cadastrar Plano de Treino--------|\n");
        System.out.println("|-- 6- Listar Plano de Treno -----------|\n");
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
                cadastrarPlanoDeTreino.rendenizar();
                break;

            case 6:

                ListarPlanoDeTreino listarPlanoDeTreino = new ListarPlanoDeTreino();
                listarPlanoDeTreino.renderizar();

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
