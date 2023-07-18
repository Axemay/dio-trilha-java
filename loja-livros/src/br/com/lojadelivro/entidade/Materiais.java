package br.com.lojadelivro.entidade;

public enum Materiais {
    M2(2), M5(5), M10(10);


    Materiais(double fator){this.fator = fator / 100;}
    public double getFator(){return fator;}
}
