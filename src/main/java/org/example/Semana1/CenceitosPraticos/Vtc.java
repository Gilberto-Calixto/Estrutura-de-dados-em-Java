package org.example.Semana1.CenceitosPraticos;

import java.util.Arrays;

public class Vtc {

    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

    public void adiciona(Aluno aluno) {

        //#2
        this.alunos[this.totalDeAlunos] = aluno;
        this.totalDeAlunos++;

        //#1Primeira implementação
        /*for (int i = 0; i <= this.alunos.length;i++){
            if (alunos[i] == null){
                alunos[i] = aluno;
                break;
            }
        }*/

    }
    public void adiciona(int posicao, Aluno aluno) {

// implementação
    }
    public Aluno pega(int posicao) {
// implementação
        return alunos[posicao];
    }
    public void remove(int posicao) { }

    public boolean contem(Aluno aluno) {
// implementação
        return true;
    }
    public int tamanho() {
// implementação
        return alunos.length;
    }
    public String toString() {
        return Arrays.toString(alunos);
    }
}
