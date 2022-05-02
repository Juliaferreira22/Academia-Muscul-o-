package controllers;
import java.util.ArrayList;
import models.Exercicio;

public class ExercicioController {
    
    private static ArrayList<Exercicio> exercicios = new ArrayList<Exercicio>();

    public void cadastrar(Exercicio exercicio){

        exercicios.add(exercicio);

    }
    public ArrayList<Exercicio> listar(){
        return exercicios;
}

public Exercicio buscarPornomeExercicio(Exercicio exercicio){
    for (Exercicio exercicioCadastrado : exercicios) {
        
        if(exercicioCadastrado.getNomeExercicio().equals(nomeExercicio)){
            return exercicioCadastrado;
        }

    }
    return null;

}

}





