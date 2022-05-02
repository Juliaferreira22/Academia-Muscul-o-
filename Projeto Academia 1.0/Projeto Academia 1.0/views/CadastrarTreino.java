package views;

import controllers.TreinoController;
import models.Treino;
import utils.Console;

public class CadastrarTreino {

    public void renderizar(){
        Treino treino = new Treino();
        TreinoController treinoController = new TreinoController();
        System.out.println("\n -- CADASTRO DE Treino -- \n");
        treino.getParteCorpo(Console.readString("Digite a parte do corpo: "));
        treino.setExercicio(Console.readDouble("Digite o nome do exercício: "));
        treinoController.cadastrar(treino);
        System.out.println("\nTreino cadastrado !!!");
    }
    
}