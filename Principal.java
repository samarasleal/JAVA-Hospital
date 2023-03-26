/**
 * Criar duas classes
 * Classe Numeros
 * 1 - Inserir os números
 * 2 - Imprimir
 * 
 * Classe Motorista
 * Atributos: nome, cnh, cpf
 * 1- Imprimir o nome do motorista
 * 
 * Para Casa - Classe Motorista: Criar o set para CNH e CPF
 * Criar o imprimir para CNH
 */
package aulamanha;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;


public class Principal {
    public static void main(String[] args) throws ParseException {
        Hospital h = new Hospital("Quem ama cuida");
        
        System.out.println("Cadastro dos 3 médicos do hospital: ");
        Scanner entrada = new Scanner(System.in);
        String nomeMedico;
        int CRM;
        int temp;
        for (int i=0; i<3;i++){
            temp = i+1;
            System.out.println("Informe o nome do médico "+temp);
            nomeMedico = entrada.next();
            System.out.println("Informe o CRM do médico "+temp);
            CRM = entrada.nextInt();
            h.adicionarMedicos(new Medico(nomeMedico, CRM));
        }
        
        System.out.println("Marcação de Consultas: ");
        System.out.println("Informe o nome do paciente: ");
        String nomePaciente = entrada.next();
        System.out.println("Informe a idade do paciente: ");
        int idadePaciente = entrada.nextInt();
        System.out.println("Informe o CPf do paciente: ");
        int cpfPaciente = entrada.nextInt();
        Paciente p = new Paciente(nomePaciente, idadePaciente, cpfPaciente);
        
        System.out.println("Informe a data da consulta no formato dd/MM/yyyy ");
        String dataDesejada = entrada.next();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        Date dataFormatada = formato.parse(dataDesejada); 
        
        System.out.println("Médicos disponíveis: ");
        h.imprimirListaMedicos();
        System.out.println("Informe o nome do médico que deseja marcar consulta - Entre os médicos disponíveis: ");
        String nomeMedicoConsulta = entrada.next();
        boolean retorno = false;
        for(int i=0; i < h.retornaListaMedico().size(); i++){
            if (nomeMedicoConsulta.equals(h.retornaListaMedico().get(i).getNome())){
                Consulta c = new Consulta(p, dataFormatada, h.retornaListaMedico().get(i));
                p.marcarConsulta(c);
                h.retornaListaMedico().get(i).adicionarConsulta(c);
                System.out.println("Consulta marcada");
                retorno = true;
                System.out.println("\n Dados da consulta: ");
                System.out.println("Médico: "+ c.getMedico().getNome());
                System.out.println("Paciente: "+ c.getPaciente().getNome());
                System.out.println("Data: "+dataFormatada);
            }
        }
        if (retorno==false)
            System.out.println("Médico não encontrado. Consulta não foi marcada.");
    
    }
}
