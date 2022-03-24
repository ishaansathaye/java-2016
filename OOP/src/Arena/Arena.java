//Created on August 19, 2016 at 10:04 AM
package Arena;
import Arena.Character.Character;
import Arena.Character.Rogue;
import java.util.Random;

 
public class Arena {
    
    
    public static Random generator = new Random();
     
    public static void main(String[] args) {
         
        Character player1 = new Rogue();
        Character player2 = new Character(10,2,100);
         
         
         
         
        
        if (player2.name.equals(player1.name)){
            player2.name += " 2";
        }
         
        System.out.println(player1.name + " vs. " + player2.name);
         
        
        int turns = 0;
        while(player1.isAlive() && player2.isAlive()){
            turns++;
             
            System.out.println("Turn " + turns + "\n" + player1.name + ": " + player1.health + " Health | " + player2.name + ": " + player2.health + " Health\n");
            int damage;
            
            damage = player1.attack(player2);
            System.out.println(player1.name + " hits " + player2.name + " for " + damage + " damage.");
             
            
            damage = player2.attack(player1);
            System.out.println(player2.name + " hits " + player1.name + " for " + damage + " damage.\n");
        }
         
        
        if( player1.isAlive()){
            System.out.println(player1.name + " wins!");
        }
        else if (player2.isAlive()){
            System.out.println(player2.name + " wins!");
        }
        else{
            System.out.println("It's a draw!");
        }
         
    }
 
}