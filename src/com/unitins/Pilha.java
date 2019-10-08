package com.unitins;

public class Pilha{
    public int posicaoPilha;
    public Object[] pilha;
    public boolean pilhaVazia() {
        if (this.posicaoPilha == -1) {
            return true;
      }
        return false;
    }
    public int tamanho(){
        if (this.pilhaVazia()){
            return 0;
        }
        return this.posicaoPilha +1;
    }
    public Object exibeUltimoValor(){
        if (this.pilhaVazia()){
            return  null;
        }
        return this.pilha[this.posicaoPilha];
    }
    public Object desempilha() {
        if (pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha--];
    }
    public void empilhar(Object valor) {
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
        }
    }
        public Pilha() {
            this.posicaoPilha = -1;
            this.pilha = new Object[10000];
        }

      }
