package com.unitins;

public class Pillha {

    public static void main(String[] args) {
        Pilha p = new Pilha();
        Fila f = new Fila();
        long i = 5;
        while (i>0){
            f.adicionar(i);
            funcao(i);
            p.empilhar(funcao(i));
            i--;
            System.out.println( i + "!=" + funcao(i));
            System.out.println( p.exibeUltimoValor());
            f.mostrar();
        }
    }
    public static long funcao(long n){
        if(n<=1)
            return 1;
        else
            return n * funcao(n-1);
    }
}

