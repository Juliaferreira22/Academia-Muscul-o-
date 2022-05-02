package models;

public class Aluno {

    private String nome;
    private String cpf;
    private String datanascimento;
    private String endereco;
    private String telefone;
    private String telefoneemergencial;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getDataNascimento() {
        return datanascimento;
    }
    public void setDataNascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getTelefoneEmergencial() {
        return telefoneemergencial;
    }
    public void setTelefoneEmergencial(String telefoneemergencial) {
        this.telefoneemergencial = telefoneemergencial;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + 
        " | CPF: " + cpf + 
        " | Data de Nascimento: " + datanascimento + 
        " | Endereço: " + endereco + 
        " | Telefone: " + telefone + 
        " | Telefone Emergencial: " + telefoneemergencial;

    }
    
}
