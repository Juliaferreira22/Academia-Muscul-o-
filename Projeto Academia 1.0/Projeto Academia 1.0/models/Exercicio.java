package models;

public class Exercicio {

    private String nomeExercicio;

    

    public String getNomeExercicio() {
        return nomeExercicio;
    }

    public void setNomeExercicio(String nomeExercicio) {
        this.nomeExercicio = nomeExercicio;
    }

    @Override
    public String toString() {
        return "Nome: " + nomeExercicio; 
    
}

}
