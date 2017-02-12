public class Food extends Item{
  private int foodNutrition;
  private int foodQuantity;

  
  public int getFoodNutrition(){
    return foodNutrition;
  }
  
  public void setFoodNutrition(int quantity){
    foodQuantity = quantity;
  }
  
  public int getFoodQuantity(){
    return foodQuantity;
  }
  
  public void setFoodQuantity(int newFoodQuantity){
    foodQuantity = newFoodQuantity;
  }
  
  public Food(int newFoodQuantity){
    foodQuantity = newFoodQuantity;
  }
  
  public Food(){
  }
}
               