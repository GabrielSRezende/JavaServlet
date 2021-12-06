package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

    private static List<Empresa> lista = new ArrayList<>();
    private static Integer chaveSequencial = 1;

    static {
        Empresa empresa1 = new Empresa();
        empresa1.setId(chaveSequencial++);
        empresa1.setNome("Alura");
        Empresa empresa2 = new Empresa();
        empresa2.setId(chaveSequencial++);
        empresa2.setNome("Caelum");
        lista.add(empresa1);
        lista.add(empresa2);
    }

    public List<Empresa> getEmpresas(){

        return Banco.lista;
    }

    public void adiciona(Empresa empresa) {
        empresa.setId(Banco.chaveSequencial++);
        Banco.lista.add(empresa);
    }

    public Empresa busca(Integer id) {
        for (Empresa emp : lista){
            if(emp.getId() == id){
                return emp;
            }
        }
        return null;
    }

    public void remove(Integer id) {

        Iterator<Empresa> it = lista.iterator();

        while(it.hasNext()){
            Empresa emp = it.next();
            if(emp.getId() == id){
                it.remove();
            }
        }
    }

    public void altera(int id) {

    }
}
