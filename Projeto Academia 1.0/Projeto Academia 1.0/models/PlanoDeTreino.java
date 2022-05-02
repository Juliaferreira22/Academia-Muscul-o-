package models;

public class PlanoDeTreino {

    private Aluno aluno;
    private Treino treino;


    public Aluno getAluno() {
        return aluno;
    }
    public Treino getTreino() {
        return treino;
    }
    public void setTreino(Treino treino) {
        this.treino = treino;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    } 

    @Override
    public String toString() {
        return 
            "Aluno: " + aluno.getNome() +
            " | Treino: " + treino.getParteCorpo(); 
            

    

    
}
    public void add(PlanoDeTreino planoDeTreino) {
    }
    public void setExercicio(Exercicio exercicio) {
    }
    
    
}
