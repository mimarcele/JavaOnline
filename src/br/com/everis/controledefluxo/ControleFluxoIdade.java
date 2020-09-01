package br.com.everis.controledefluxo;

public class ControleFluxoIdade {
    public static void main(String[] args) {
        //idade < 15 - categoria infantil
        // idade >=15 && idade < 18 - categoria juvenil
        // idade >=18 - categoria adulta
        int idade = 20;
        String categoria;
        if (idade < 15) {
            categoria = "infantil";
        } else if (idade >=15 && idade <18) {
            categoria = "juvenil";
        } else {
            categoria = "adulta";
        }
        System.out.println("Você está na categoria " + categoria);
    }
}