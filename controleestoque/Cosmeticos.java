/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleestoque;

/**
 *
 * @author Eduardo
 */
public class Cosmeticos extends Produto implements NewInterface{

    public Cosmeticos(int codigo){
        setCodigo(codigo);
    }
    
    public double percentualLucro() {
        return getValorRevenda() * 0.5; 
    }

    public double desconto(){
        return getValorRevenda() * 0.05;
    }
}
