package br.edu.insper.desagil.pi.freela;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Tarefa> tarefas;
    public Lista(){
        this.tarefas=new ArrayList<>();
    }
    public List<Tarefa> getTarefas(){
        return tarefas;
    }

    public void adiciona(Tarefa t){
        for (int i = 0; i< tarefas.size();i++){
            Tarefa tarefa_verificada=tarefas.get(i);
            if (t.getId()==tarefa_verificada.getId()){
                break;
            }
            tarefas.add(t);

        }

    }

}
