package br.com.everis.arrays;

public class UtilizandoArrays5 {
    public static void main(String[] args) {
        int[][] dias = new int[2][2];
        dias[0][0] = 30;
        dias[0][1] = 31;
        dias[1][0] = 29;
        dias[1][1] = 28;

        for(int i = 0; i < dias.length; i++){
            System.out.println(dias[i]);
            for(int k= 0; k<dias[i].length; k++){
                System.out.println(dias[i] [k]);
            }
        }
    }
}

