package controllers;

import java.util.ArrayList;

import models.PlanoDeTreino;

public class PlanoDeTreinoController {

    private static ArrayList<PlanoDeTreino> planodetreinos = new ArrayList<PlanoDeTreino>();

    public void cadastrar(PlanoDeTreino planodeTreino) {
        planodetreinos.add(planodeTreino);
    }

    public ArrayList<PlanoDeTreino> listar() {
        return planodetreinos;
    }
    
}
