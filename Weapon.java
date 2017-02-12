public class Weapon extends Item{
  private int weaponDamage;
  
  public int getWeaponDamage(){
    return weaponDamage;
  }
  
  public void setWeaponDamage(int damage){
    weaponDamage = damage;
  }
  
  public Weapon(int damage){
    weaponDamage = damage;
  }
  
  public Weapon(){
  }
}