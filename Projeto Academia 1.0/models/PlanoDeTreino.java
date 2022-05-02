package models;

public class PlanoDeTreino {

    private Aluno aluno;
    private Treino treino;
    private PlanoDeTreino planoDeTreino;
    public Aluno getAluno() {
        return aluno;
    }
    public PlanoDeTreino getPlanoDeTreino() {
        return planoDeTreino;
    }
    public void setPlanoDeTreino(PlanoDeTreino planoDeTreino) {
        this.planoDeTreino = planoDeTreino;
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
    public String toString(){
        return
        "Aluno: " + aluno.getNome() +
        "treino: " + aluno.getNome() +
        "Plano De Treino: " + aluno.getNome();
    }
    



}
