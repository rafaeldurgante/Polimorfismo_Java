package com.livrojava.orientacao_obj;
public class Orientacao_obj {

    public static void main(String[] args) {
        System.out.println("---Testando Polimorfismo--!");
        
        Grupo grupo = new Grupo();
        Grupo subgrupo = new SubGrupo();
        Grupo produto = new Produto();
        
        grupo.imprimeDesc();
        subgrupo.imprimeDesc();
        produto.imprimeDesc();
        
    }
}
