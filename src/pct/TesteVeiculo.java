/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;
/**
 *
 * @author usaze
 */
public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        
        
        v1.velocidade = (int) (Math.random() * 100) ;
        v1.marca = "Audi";
        v1.modelo = "T.T";
        v1.cor = 'B';
        v1.motorLigado = true;
        
        //Exibir Status do Veiculo
        System.out.println("\n\t\t\t -- Veículo 1 --\n");
        System.out.println(v1.marca);
        System.out.println(v1.modelo);
        System.out.println(v1.cor);  
        System.out.println("Velocidade = 250Km/h \n");
        v1.exibirStatus();
        
        //acelerar
        v1.acelerar(120);
        
        //Exibir Status do Veiculo
        System.out.println("\n\t\t\t -- Veículo 1 a velocidade de 120 Km/h --\n");
        v1.exibirStatus();
        
              
        //frear
        v1.frear(0);
        System.out.println("\n\t\t\t -- Veículo 1 a velocidade de 0 Km/h --\n");
        v1.exibirStatus();
       
    }
}
