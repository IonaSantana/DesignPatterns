/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package veiculoprototype;
import java.util.HashMap;
import models.Veiculo;
import models.Caminhao;
import models.Carro;
import models.Pneu;

/**
 *
 * @author ionasantana
 */
public class VeiculoPrototype {

    /**
     * @param args the command line arguments
     */
    public static HashMap <String, Pneu> roda = new HashMap<String, Pneu>();
    public static Pneu getPneu(String id)
    {
        Pneu p = roda.get(id); 
        return (Pneu) p.clone();
    }
    
    public static void carregaPneus()
    {
        Pneu carro = new Pneu("Firestone", 16);
        roda.put("carro", carro);
        
        Pneu caminhao = new Pneu("Michelin", 30);
        roda.put("caminhao", caminhao);
        
    }
    
    public static void main(String[] args) {
       carregaPneus();
       
       Carro relampomarquinhos = new Carro();   
       Pneu clone1 = getPneu("carro");  
       Pneu clone;
       for (int i = 0; i < 4; i++) {
           clone = clone1;
           relampomarquinhos.pneus.add(clone);
       }
       System.out.println(relampomarquinhos.toString());
       
       Caminhao Mate = new Caminhao();
       Pneu clone2 = getPneu("caminhao");
       for (int i = 0; i < 6; i++) {
           clone = clone2;
           Mate.pneus.add(clone);
       }
       System.out.println(Mate.toString());
       
    }
    
}
