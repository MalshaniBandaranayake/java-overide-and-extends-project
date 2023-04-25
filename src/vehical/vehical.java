/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehical;

/**
 *
 * @author MALSHANI
 */
public class vehical {
    String color;
    String need_fuel;
    
    void travel(){
        System.out.println("i can travel");
    }
    void stop (){
        System.out.println("i can stop");
    }
    void drive (){
        System.out.println ("i can deive");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        vehical v = new vehical();
        aroplane a = new aroplane ();
        bus b = new bus ();
        ship s = new ship ();
        
        vehical v2 = new bus ();
        
        v.travel();
        a.travel();
        b.travel();
        s.travel();
        
        v2.travel();
    }
    
}
