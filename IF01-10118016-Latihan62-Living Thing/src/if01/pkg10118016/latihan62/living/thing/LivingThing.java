/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118016.latihan62.living.thing;

/**
 *
 * @author Rezky
 * NAMA      : Rezky Nur Fauzi
 * KELAS     : IF-1
 * NIM       : 10118016
 * Deskripsi Program   : Program ini berisi program Living Thing
 */

public abstract class LivingThing {
    
    public abstract void walk(String nama);
    
    public void breath(String nama) {
        System.out.println(nama + " Bernafas");
    }
    
    public void eat(String nama) {
        System.out.println(nama + " Makan");
    }
    
}
