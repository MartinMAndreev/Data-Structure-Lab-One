public class Weapon extends Item{
  //the damage the weapon does in number form
  private int weaponDamage;
  
  //method in order to find the weapons damage integer
  public int getWeaponDamage(){
    return weaponDamage;
  }
  //sets that to the variable damage
  public void setWeaponDamage(int damage){
    weaponDamage = damage;
  }
 
  /**
   * Constructor to initialize the weaponDamage
   * @param damage
   */
  public Weapon(int damage){
    weaponDamage = damage;
  }
  //defult constructor
  public Weapon(){
  }
}