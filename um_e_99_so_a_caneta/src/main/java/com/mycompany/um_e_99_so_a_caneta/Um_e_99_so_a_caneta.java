/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.um_e_99_so_a_caneta;

import com.mycompany.um_e_99_so_a_caneta.decorators.Adesivo;
import com.mycompany.um_e_99_so_a_caneta.decorators.Cor;
import com.mycompany.um_e_99_so_a_caneta.decorators.Foto;
import models.Brinde;
import models.Caneca;
import models.Caneta;
import models.Garrafa;

/**
 *
 * @author puc
 */


public class Um_e_99_so_a_caneta {

    public static Integer cont;
    public static void main(String[] args) {
       cont = 0;
       confecciona("Caneca maneira ", new Adesivo(new Adesivo(new Caneca())));
       confecciona("Caneca foto e adesivo", new Adesivo(new Foto(new Caneca())));
       
       confecciona("Caneta azul, azul caneta", new Cor(new Caneta()));
       
       confecciona("Garrafa azul com adesivo maneiro", new Adesivo(new Cor((new Garrafa()))));
       confecciona("Garrafa azul com adesivo maneiro e uma fotinha", new Foto(new Adesivo(new Cor((new Garrafa())))));
       
       
       confecciona("Caneta com foto???", new Foto(new Caneta()));
       
       
    }
    
    public static void confecciona(String nome, Brinde presente) {
        cont++;
        System.out.println("Brinde " + cont + ":");
        System.out.println("Fazendo " + nome);
        System.out.println(presente.customizar());      
        System.out.println("PREÇO: " + presente.getPreco());
        System.out.println("---------------");
    }
}
