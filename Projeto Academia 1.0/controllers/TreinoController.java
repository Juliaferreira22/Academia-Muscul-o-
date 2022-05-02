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

    public Treino buscarPorExercicio(String exercicio){
        for (Treino treinoCadastrado : Treinos) {
            if(treinoCadastrado.setExercicio().equals(exercicio)){
                return treinoCadastrado;
            }
        }
        return null;
    }
    
}