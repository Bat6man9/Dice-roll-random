/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diceroll;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author yoyos
 */
public class Diceroll {

    /**
     * @param args the command line arguments
     */
      static List<Integer> diceRoll( ) {
           // simulates a dice roll
           Random ran = new Random();
        return Arrays.asList((ran.nextInt(6)+1), (ran.nextInt(6)) +1);
    }
    
    public static void main(String[] args) {
        
        System.out.println("Dice rolls: " + diceRoll());
    }
    
}
