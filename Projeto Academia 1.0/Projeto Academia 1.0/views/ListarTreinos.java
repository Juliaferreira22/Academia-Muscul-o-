package views;

import controllers.TreinoController;
import models.Treino;

public class ListarTreinos {

    public void renderizar(){
        TreinoController treinoController = new TreinoController(); 
        System.out.println("\n -- LISTAGEM DE TreinoS -- \n");
        for (Treino treinoCadastrado : treinoController.listar()) {
            System.out.println(treinoCadastrado);
        }
    }
    
}