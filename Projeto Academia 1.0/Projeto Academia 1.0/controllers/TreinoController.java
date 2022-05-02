package controllers;

import java.util.ArrayList;

import models.Treino;

public class TreinoController {

    private static ArrayList<Treino> Treinos = new ArrayList<Treino>();

    public void cadastrar(Treino Treino) {
        Treinos.add(Treino);
    }

    public ArrayList<Treino> listar() {
        return Treinos;
    }

    

    public Treino buscarPorParteCorpo(String partecorpo) {
        return null;
    }
    
}