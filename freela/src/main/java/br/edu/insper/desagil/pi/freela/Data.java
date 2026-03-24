package br.edu.insper.desagil.pi.freela;

import java.util.HashMap;
import java.util.Map;

public class Data extends Momento{
    private int ano;
    private int mes;
    private int dia;
    private Map<Integer,Integer> limite;

    public Data(){
        this.ano=1970;
        this.mes=1;
        this.dia=1;
        Map<Integer, Integer> limite = new HashMap<>();
        limite.put(1, 31);
        limite.put(2, 28);
        limite.put(3, 31);
        limite.put(4, 30);
        limite.put(5, 31);
        limite.put(6, 30);
        limite.put(7, 31);
        limite.put(8, 31);
        limite.put(9, 30);
        limite.put(10, 31);
        limite.put(11, 30);
        limite.put(12, 31);
        this.limite = limite;
    }

    public int getAno() {
        return ano;
    }
    public int getMes() {
        return mes;
    }
    public int getDia(){
        return dia;
    }

    public void atualiza(int ano,int mes,int dia){
        int novoAno = ajusta(ano,1970,2070);
        int novoMes = ajusta(mes,1,12);
        int diamax=limite.get(novoMes);
        int novoDia = ajusta(dia,1,diamax);
        this.ano=novoAno;
        this.mes=novoMes;
        this.dia=novoDia;

    }

    @Override
    public int minutos(){
        int anos=ano-1970;
        int dias=dia-1;
        dias+=anos*365;
        int horas = 0;

        for (int i=1;i<mes;i++){
            dias+=limite.get(i);
        }
        horas+=dias*24;
        int minutos=horas*60;
        return minutos;
        }
    }

