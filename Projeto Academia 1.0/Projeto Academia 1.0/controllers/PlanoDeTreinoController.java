package controllers;

import java.util.ArrayList;

import models.PlanoDeTreino;

public class PlanoDeTreinoController {

    private static ArrayList<PlanoDeTreino> planoDeTreinos = new ArrayList<PlanoDeTreino>();

    public void cadastrar(PlanoDeTreino planoDeTreino) {
        planoDeTreinos.add(planoDeTreino);
    }

    public ArrayList<PlanoDeTreino> listar() {
        return planoDeTreinos;
    }
    
}
    

