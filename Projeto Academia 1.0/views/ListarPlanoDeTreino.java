package views;

import java.util.ArrayList;

import controllers.PlanoDeTreinoController;
import models.PlanoDeTreino;

public class ListarPlanoDeTreino {

    public void renderizar(){
        PlanoDeTreinoController PlanoDeTreinoController = new PlanoDeTreinoController();      
        System.out.println("\n -- LISTAGEM DE PlanoDeTreinoS -- \n");
        for (PlanoDeTreino planoDeTreinoCadastrada : PlanoDeTreinoController.listar()) {
            System.out.println(planoDeTreinoCadastrada);
        }
    }
    
}