package Single_Responsibility.bad;
/*
 * A single responsibility principle 'SRP' means that a class
 * should only have one job to do. It should focus
 * on doing one specific task properly
 *
 * The order class has two responsibilities: creating an order
 * and saving it to the database
 * this violates the SRP
 * */
public class Order {
  public void createOrder(){
      //create new order
    }
    public void saveOrder(){
        //save the new order
    }

}
