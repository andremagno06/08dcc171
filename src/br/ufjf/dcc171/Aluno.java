
package br.ufjf.dcc171;

public class Aluno {
    String matricula;
    String nome;

    public Aluno() {
        this(null,null);
    }  
    
    public Aluno(String matricula) {
        this(matricula,null);
    }

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    
    
    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return  matricula + ": " + nome;
    }
    
  
    
    
}
