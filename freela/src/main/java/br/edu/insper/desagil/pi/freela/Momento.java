package br.edu.insper.desagil.pi.freela;

public class Momento {
    public Momento(){}

    public int ajusta(int agora, int min, int max){
        if (min>agora){
            return min; }
        else if (agora>max){return max;
        }
        else {return agora;}}


    public int minutos(){
            return 0;
        }

}
