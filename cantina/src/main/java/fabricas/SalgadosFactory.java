/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricas;

import modelos.Coxinha;
import modelos.Empada;
import modelos.Salgado;

/**
 *
 * @author ionasantana
 */
public class SalgadosFactory {
    private SalgadoIngredientesFactory ingredientes;
    private Salgado salgadinho;
    
    public enum Salgados_Tipo{
        EMPADA, COXINHA;
    }
    
    public enum Salgados_Regiao{
        GOIAS, CEARA;
    }
    
    public void assarSalgado(String tipo, String regiao){
        Salgados_Tipo tipo_s = Salgados_Tipo.valueOf(tipo);
       
        switch (tipo_s)
        {
            case EMPADA:   
                ingredientes = getIngredientesEmpada(regiao);
                          
            case COXINHA:     
                ingredientes = getIngredientesCoxinha(regiao);      
        }  
        salgadinho.setMassa(ingredientes.criarMassa());
        salgadinho.setMolho(ingredientes.criarMolho());
        salgadinho.setRecheio(ingredientes.criarRecheio());
    }
    
    public SalgadoIngredientesFactory getIngredientesCoxinha(String regiao){
        Salgados_Regiao regiao_s = Salgados_Regiao.valueOf(regiao);
         salgadinho = new Coxinha(); 
        switch (regiao_s)
        {
           case GOIAS: 
               return new GoiasCoxinhaIngredientesFactory();
           case CEARA:
               return new CearaCoxinhaIngredientesFactory();
              
           default: return null;    
        }
                                              
    }
    
    public SalgadoIngredientesFactory getIngredientesEmpada(String regiao){
        Salgados_Regiao regiao_s = Salgados_Regiao.valueOf(regiao);
         salgadinho = new Empada(); 
        switch (regiao_s)
        {
           case GOIAS: 
               return new GoiasEmpadaIngredientesFactory();
           case CEARA:
               return new CearaEmpadaIngredientesFactory();

           default: return null;    
        }
    }
   
    public Salgado getSalgadinho(){
        return salgadinho;
    }
    
    @Override public String toString(){
        return "Massa: " + salgadinho.getMassa() + "\nMolho: " + salgadinho.getMolho() + "\nRecheio: " + salgadinho.getRecheio();
    }
}
