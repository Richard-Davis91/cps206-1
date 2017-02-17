package edu.jalc.inclass.cocacola.recipe.store;
//import edu.jalc.inclass.cocacola.employee.Employee;
import edu.jalc.inclass.cocacola.recipe.store.SecretRecipeStore;
//import edu.jalc.inclass.cocacola.security.PinNumber;

public class SecretRecipeStoreTest {


  public static void main(String... args){
    SecretRecipeStore secretRecipeStoreA = SecretRecipeStore.getInstance();
    SecretRecipeStore secretRecipeStoreB = SecretRecipeStore.getInstance();
    assert(secretRecipeStoreA != secretRecipeStoreB);
  }
}
