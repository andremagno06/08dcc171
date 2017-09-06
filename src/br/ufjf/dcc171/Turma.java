/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc171;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ice
 */
public class Turma {
    String codigo;
    List<Aluno> alunos;

    
    public Turma() {
         this(null);
    }

    
    
    public Turma(String codigo) {
        this.codigo = codigo;
        this.alunos = new ArrayList<>();
    }


    
    public String getCodigo() {
        return codigo;
    }

    public List<Aluno> getAluno() {
        return alunos;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setAluno(List<Aluno> aluno) {
        this.alunos = aluno;
    }
    
    public String toString() {
     return this.codigo+" ("+this.alunos.size()+" aluno";
    
    
    }
    
    
}
