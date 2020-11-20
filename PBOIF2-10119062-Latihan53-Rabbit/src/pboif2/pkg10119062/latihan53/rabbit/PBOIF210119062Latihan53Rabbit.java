/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119062.latihan53.rabbit;

/**
 *
 * @author 
 * NAMA     : Naufal Rafi Pratama
 * KELAS    : PBOIF2
 * NIM      : 10119062
 * Deskripsi Progam : program ini berisi program untuk menampilkan
 * rabbit
 */
public class PBOIF210119062Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rabbit objRabbit = new Rabbit("Peter", false, "grass", 4, "grey");
        
        System.out.println("Hello, His name is "+objRabbit.getName());
        System.out.println(objRabbit.getName()+" is Vegetarian? "+objRabbit.isVegetarian());
        System.out.println(objRabbit.getName()+" eats "+objRabbit.getEats());
        System.out.println(objRabbit.getName()+" has "+objRabbit.getNoOfLegs()+" legs");
        System.out.println(objRabbit.getName()+" color is "+objRabbit.getColor());
    }
    
}
