/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc171;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author ice
 */
public class Aula08Exemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        getSampleData();
        
        JanelaTurmas janela = new JanelaTurmas(getSampleData());
        
        janela.setSize(800,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
       
    }

    private static List<Turma> getSampleData() {
        Aluno a1= new Aluno("20136513","Huguinho");
        Aluno a2= new Aluno("201366464","Zecinho");
        Aluno a3= new Aluno("2089453","Luizinho");
        
        Turma t1= new Turma("DCC171");
        Turma t2= new Turma("DCC021");
        
        t1.getAluno().add(a1);
        t1.getAluno().add(a3);
        t2.getAluno().add(a1);
        t2.getAluno().add(a2);
        t2.getAluno().add(a3);
        
        List<Turma> turmas = new ArrayList<>();
        turmas.add(t1);
        turmas.add(t2);
        return turmas;
    }
    
}
