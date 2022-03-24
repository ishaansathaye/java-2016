package Arena.Character;
 
import Arena.Arena;
 
public class Rogue extends Character {
     
    
     
    public int dexterity = 20;
     
     
    public Rogue(){
        super();
        this.strength = 8;
        this.defense = 4;
         
    }
     
    public int attack(Character target){
         
        boolean criticalHit = Arena.generator.nextInt(100) < dexterity;
         
        int damageDealt = this.strength + Arena.generator.nextInt(this.strength) - this.strength / 2;
        if(criticalHit){
            damageDealt *= 2;
            System.out.println("*** Critical Hit ***");
        }
        return target.takeDamage(damageDealt);
    }
     
}