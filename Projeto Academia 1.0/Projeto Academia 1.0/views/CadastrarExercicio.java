package views;
import controllers.ExercicioController;
import models.Exercicio;
import utils.Console;

public class CadastrarExercicio {

    public void renderizar(){
        Exercicio Exercicio = new Exercicio();
        ExercicioController exercicioController = new ExercicioController();
        System.out.println("\n -- CADASTRO DE EXERCICIOS -- \n");
        Exercicio.setNomeExercicio(Console.readString("Digite o nome do exercício: "));
        exercicioController.cadastrar(Exercicio);
        System.out.println("\nExercício cadastrado !!!");
    }
    
}
