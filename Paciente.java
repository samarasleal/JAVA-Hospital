/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulamanha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author samara
 */
public class Paciente {
    private String nome;
    private int idade;
    private int cpf;
    ArrayList<Consulta> listaConsultas = new ArrayList<Consulta>();
    
    public Paciente(String nome, int idade, int cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
    
    public void marcarConsulta(Consulta consulta){
        this.listaConsultas.add(consulta);
    }
    
    public String getNome(){
        return this.nome;
    }
}
