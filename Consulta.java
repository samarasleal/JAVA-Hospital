/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulamanha;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author samara
 */
public class Consulta {
    private Paciente paciente;
    private int protocolo;
    private Date data;
    private Medico medico;

    public Consulta(Paciente paciente, Date data, Medico medico){
        Random aleatorio = new Random();
        this.protocolo = aleatorio.nextInt();
        this.paciente = paciente;
        this.data = data;
        this.medico = medico;
    }
    
    public Medico getMedico(){
        return this.medico;
    }    
    public Paciente getPaciente(){
        return this.paciente;
    }
}
