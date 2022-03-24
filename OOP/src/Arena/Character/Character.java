package Arena.Character;
import Arena.Arena;
public class Character {
	
	public String name = "Geoff";
    
	public int strength = 10;
    public int health = 20;
    public int defense = 5;
    
    public static String[] nameList = {"Steve", "Bob", "Dave"};
    
  
    
    public Character(){
        
        this.name = nameList[Arena.generator.nextInt(nameList.length)];
    }
    public Character(int strength, int defense, int health){
        this();
        this.strength = strength;
        this.defense = defense;
        this.health = health;
         
        }
    
    public int takeDamage(int damage){
        
        int damageTaken = damage - this.defense;
         
        this.health -= damageTaken;
         
        return damageTaken;
    }
    public int attack(Character target){
        
        int damageDealt = this.strength + Arena.generator.nextInt(5);
        
        return target.takeDamage(damageDealt);
         
    }
    public boolean isAlive(){
        
    	return this.health > 0;
    }
    public int getHealth(){
    	 
        return this.health;
     
    }

}
