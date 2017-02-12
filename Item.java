public class Item{
  //name and weight of the item 
  private String itemName;
  private int itemWeight;
  
  public String getItemName(){
    return itemName;
  }
  
  //the program knows to assign the recieved name of the item
  public void setItemName(String name){
    itemName = name;
  }
  
  //methods for weight
  public int getItemWeight(){
    return itemWeight;
  }
  
  //the program knows to assign the recieved weight of the item
  public void setItemWeight(int weight){
    itemWeight = weight;
  }
  
  //constructor class with name of item as a parameter
  /**
   * Constructor to initialize the itemName
   * @param name
   */
  public Item(String name){
    itemName = name;
  }
  
  //constructor class with weight of the item as a parameter
  /**
   * Constructor to initialize the itemWeight
   * @param weight
   */
  public Item(int weight){
    itemWeight = weight;
  }
  
  //defult constructor
  public Item(){
  }
}