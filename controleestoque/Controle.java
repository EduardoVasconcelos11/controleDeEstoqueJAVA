/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleestoque;
import java.util.Scanner;
/**
 *
 * @author Eduardo
 */
public class Controle {

    public static void main(String[] args) {
        
        Scanner sc1 = new Scanner(System.in);
        Cosmeticos cosmetico[] = new Cosmeticos[10];
        Hnd suplemento[] = new Hnd[10];
        
        int c = 0;
        int s = 0;
        int opcao = 0;
        do{
          meuMenu();
          opcao = sc1.nextInt();
          System.out.println("");
            
          switch(opcao){
            case 1:
                cosmetico[c] = adicionarCosmetico(c);
                c++;
                break;
            case 2:    
                suplemento[s] = adicionarSuplemento(s);
                s++;
                break;
            case 3:
                venderProduto(cosmetico, suplemento);
                break;
            case 4:
                listarProdutos(cosmetico, suplemento);
                break;
            default:
            System.out.println("Opção inválida.");
          }
        } while(opcao != 0);
    }
    public static void meuMenu(){
        System.out.println("\tSistema de Venda Eduardo V.");
        System.out.println("\t-----------MENU------------");
        System.out.println("\t| 0. Fim                  |");
        System.out.println("\t| 1. Adicionar Cosmetico  |");
        System.out.println("\t| 2. Adicionar suplemento |");
        System.out.println("\t| 3. Vender Produto       |");
        System.out.println("\t| 4. Listar Produtos      |");
        System.out.println("\t---------------------------");
        System.out.println("");
        System.out.println("Opcao:");
    }

    public static Cosmeticos adicionarCosmetico(int c) {
        Scanner sc1 = new Scanner(System.in);
        Cosmeticos c1 = new Cosmeticos(c+1);
        System.out.println("Nome do Cosmetico: ");
        c1.setNome(sc1.next());
        System.out.println("Descrição do Cosmetico: ");
        c1.setDescricao(sc1.next());
        System.out.println("Valor revenda do Cosmetico: ");
        c1.setValorRevenda(sc1.nextDouble());
        c1.setValorCompra(c1.percentualLucro());
        return c1;    
}
    public static Hnd adicionarSuplemento(int s) {
        Scanner sc1 = new Scanner(System.in);
        Hnd s1 = new Hnd(s+1);
        System.out.println("Nome do Suplemento: ");
        s1.setNome(sc1.next());
        System.out.println("Descrição do Suplemento: ");
        s1.setDescricao(sc1.next());
        System.out.println("Valor revenda do Suplemento: ");
        s1.setValorRevenda(sc1.nextDouble());
        s1.setValorCompra(s1.percentualLucro());
        return s1;       
}
    public static void listarProdutos(Cosmeticos[] cosmetico, Hnd[] suplemento){
        try {
            System.out.println("----------------------Cosmeticos-----------------------");
            for(int i = 0; cosmetico.length > i; i++){
                if(cosmetico[i] == null){
                }else{
                    System.out.println("Codigo Produto: " + cosmetico[i].getCodigo());
                    System.out.println("Nome do Produto: " + cosmetico[i].getNome());
                    System.out.println("Descrição do Produto: " + cosmetico[i].getDescricao());
                    System.out.println("Valor do Produto: " + cosmetico[i].getValorRevenda());
                    System.out.println("____________________________");
                    System.out.println("Desconto Possivel: " + cosmetico[i].desconto());
                    System.out.println("");
                }
            }
        } catch (Exception e) {
        }
        try {
            System.out.println("----------------------Suplementos-----------------------");
            for(int i = 0; suplemento.length > i; i++){
                if(suplemento[i] == null){
                }else{
                    System.out.println("Codigo Produto: " + suplemento[i].getCodigo());
                    System.out.println("Nome do Produto: " + suplemento[i].getNome());
                    System.out.println("Descrição do Produto: " + suplemento[i].getDescricao());
                    System.out.println("Valor do Produto: " + suplemento[i].getValorRevenda());
                    System.out.println("____________________________");
                    System.out.println("Desconto Possivel: " + suplemento[i].desconto());
                    System.out.println("");
                }
            }
        } catch (Exception e) {
        }
    }

    public static void venderProduto(Cosmeticos[] cosmetico, Hnd[] suplemento) {
        Scanner sc1 = new Scanner(System.in);
        int op = 0;
        int cod = 0;
        System.out.println("O que você vendeu?");
        System.out.println("cosmetico 1 \nsuplemento 2");
        op = sc1.nextInt();
        
        if (op == 1){
            System.out.println("digite o codigo do Cosmetico");    
            cod = sc1.nextInt() - 1;
            cosmetico[cod] = null;
        }else{
            System.out.println("digite o codigo do Suplemento");    
            cod = sc1.nextInt() - 1;
            suplemento[cod] = null;
        }
    }
}