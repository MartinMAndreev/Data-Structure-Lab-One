public class Food extends Item{
  //the number for the nutrition and the quantity of the food
  private int foodNutrition;
  private int foodQuantity;

  //methods for getting and setting the nutrition and quantity of food
  public int getFoodNutrition(){
    return foodNutrition;
  }
  
  public void setFoodNutrition(int quantity){
    foodQuantity = quantity;
  }
  
  public int getFoodQuantity(){
    return foodQuantity;
  }
  //re directs it to newFoodQuantity
  public void setFoodQuantity(int newFoodQuantity){
    foodQuantity = newFoodQuantity;
  }
   /**
   * Constructor to initialize the foodQuantity
   * @param newFoodQuantity
   */
  public Food(int newFoodQuantity){
    foodQuantity = newFoodQuantity;
  }
  //defult constructor
  public Food(){
  }
}
               