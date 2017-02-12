public class Armor extends Item{
  //the defense the armor has in number form
  private int armorDefense;
  
  //method in order to find the armors defense integer
  public int getArmorDefense(){
    return armorDefense;
  }
  //sets that to the variable defense
  public void setArmorDefense(int defense){
    armorDefense = defense;
  }
 
  /**
   * Constructor to initialize the armorDefense
   * @param defense
   */
  public Armor(int defense){
    armorDefense = defense;
  }
  //defult constructor
  public Armor(){
  }
}