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
public class Hnd extends Produto implements NewInterface {
    
    public Hnd(int codigo){
        setCodigo(codigo);
    }
    
    public double percentualLucro() {
        return getValorRevenda() * 0.6; 
    }
    public double desconto(){
        return getValorRevenda() * 0.04;
    }
}
