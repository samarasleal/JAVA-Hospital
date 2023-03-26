/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulamanha;

import java.util.ArrayList;

/**
 *
 * @author samara
 */
public class Medico {
    private String nome;
    private int CRM;
    private ArrayList<Consulta> listaConsultas = new <Consulta>ArrayList();
    
    public Medico(String nome, int CRM){
        this.nome = nome;
        this.CRM = CRM;
    }
    
    public void adicionarConsulta(Consulta consulta){
        this.listaConsultas.add(consulta);
    } 
    
    public String getNome(){
        return this.nome;
    }
}
