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
public class Veiculo {

    
     String marca;
     String modelo;
     char cor = 'Y' | 'S' | 'B';
     int velocidade;  
     boolean motorLigado;
   
    public void exibirStatus(){
        System.out.println("Velocidade Atual: " + velocidade);
        System.out.println(motorLigado?"Motor Ligado":"Motor Desligado");
        System.out.println("Velocidade: " + velocidade);
    }
    
    //acelerar 
    public void acelerar(int velocidadeDesejada){ 
        while(velocidade < velocidadeDesejada){
            velocidade+=5;
            System.out.println(velocidade + " Km/h");
        }
      }
    
    //frear
    public void frear(int velocidadeDesejada){
        while(velocidade > velocidadeDesejada){
            velocidade-=5;
            System.out.println(velocidade + "Km/h");
        }
      }
}
    
 

