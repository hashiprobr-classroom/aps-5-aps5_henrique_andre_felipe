package br.edu.insper.desagil.pi.freela;

public class DataHorario extends Momento{
    private int hora;
    private int minuto;
    private Data data;

    public DataHorario(Data d){
        this.hora=0;
        this.minuto=0;
        this.data=d;
    }

    public int getHora() {
        return hora;
    }
    public int getMinuto() {
        return minuto;
    }

    public Data getData() {
        return data;
    }
    public void setData(Data d){
        this.data=d;
    }
    public void atualiza(int hora, int minuto) {
        this.hora = ajusta(hora, 0, 23);
        this.minuto = ajusta(minuto, 0, 59);
    }

    @Override
    public int minutos() {
        return data.minutos() + hora * 60 + minuto;
    }



}
