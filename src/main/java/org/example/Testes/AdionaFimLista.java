package org.example.Testes;

import org.example.Semana1.CenceitosPraticos.Aluno;
import org.example.Semana1.CenceitosPraticos.Vettor;
import org.example.Semana1.CenceitosPraticos.Vtc;

public class AdionaFimLista {

    public static void main(String[] args){


        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        //r
        a1.setNome("Mairo");
        a2.setNome("Ariam");
        a3.setNome("Ana");

        Vtc lista = new Vtc();
        lista.adiciona(a1);
        lista.adiciona(0,a2);
        lista.adiciona(1,a3);


        System.out.println(lista);

    }
}
