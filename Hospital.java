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
public class Hospital {
    private String nome;
    private ArrayList<Medico> listaMedicos = new <Medico>ArrayList();
    
    public Hospital(String nome){
        this.nome = nome;
    }   
    public void adicionarMedicos(Medico medico){
        this.listaMedicos.add(medico);
    }   
    public void imprimirListaMedicos(){
        for(int i=0; i < this.listaMedicos.size();i++){
            System.out.println("Médico "+this.listaMedicos.get(i).getNome());
        }
    }    
    public ArrayList<Medico> retornaListaMedico(){ 
         return this.listaMedicos;
    }
}
