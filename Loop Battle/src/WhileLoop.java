//Created on August 19, 2016 at 10:04 AM
import java.util.Random;
 
public class WhileLoop {
 
    public static void main(String[] args) {
 
        Random numberGenerator = new Random();
 
        System.out.println("Welcome to the endless tower!");
 
        // Set up starting values
        int playerHealth = 100;
        int enemyHealth = 10;
        
        int playerAttack = 1;
        int enemyAttack = 1;
        
        int damage;
        int enemiesDefeated = 0;
        
        while (playerHealth > 0){
        	
        	if (enemyHealth > 0){
        		System.out.println("\nYour HP: " + playerHealth );
        		System.out.println("Enemy HP: " + enemyHealth);
        		
        		damage = playerAttack + numberGenerator.nextInt(3);
        		System.out.println("You attack the enemy and do " + damage + " damage.");
        		enemyHealth -= damage;
        		
        		damage = enemyAttack + numberGenerator.nextInt(3);
        		System.out.println("The enemy attacks and does " + damage + " damage");
        		playerHealth -= damage;
        		
        	}
        	else {
        		
        		enemiesDefeated ++;
        		
        		playerAttack++;
                System.out.println("You Leveled up. Your attack is now " + playerAttack + "\n\nA new challenger approaches!");
 
                enemyHealth = 10 + numberGenerator.nextInt(5); 
                enemyAttack += numberGenerator.nextInt(2); 
                System.out.println("The enemy has " + enemyHealth + " health and " + enemyAttack + " attack.");
        	}
        }
        System.out.println("You defeated " + enemiesDefeated + " enemie(s)");
        
         
    }
 
}
