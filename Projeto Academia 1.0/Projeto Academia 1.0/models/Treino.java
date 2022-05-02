package models;

public class Treino {

    private String partecorpo;
    private double exercicio;
    
    
    public String getParteCorpo() {
        return partecorpo;
    }
    public void setParteCorpo(String partecorpo) {
        this.partecorpo = partecorpo;
    }
    public double getExercicio() {
        return exercicio;
    }
    public void setExercicio(double exercicio) {
        this.exercicio = exercicio;
    }

    @Override
    public String toString() {
        return 
            "Parte do Corpo: " + partecorpo + 
            " | Exercicio: " + exercicio;
    }
    public void getParteCorpo(String readString) {
    }
    public void getExercicio(double readDouble) {
    }
    public Object setExercicio() {
        return null;
    }
    public void setTreino(Treino treino) {
    }
    
}