package views;

import controllers.PlanoDeTreinoController;
import models.PlanoDeTreino;

public class ListarPlanoDeTreino {

    public void renderizar(){
        PlanoDeTreinoController planoDeTreinoController = new PlanoDeTreinoController();      
        System.out.println("\n -- LISTAGEM DE PLANOS DE VENDA -- \n");
        for (PlanoDeTreino PlanoDeTreinoCadastrado : planoDeTreinoController.listar()) {
            System.out.println(PlanoDeTreinoCadastrado);
        }
    }
    
}
