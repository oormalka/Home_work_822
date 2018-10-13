
public class Prigrams {

	public static void main(String[] args) {

		Pizza[] pizzaOrder = new Pizza[5];
		int SumOfToppings = 0;

		pizzaOrder[0] = new Pizza(8, 3, 40);
		pizzaOrder[1] = new Pizza(6, 0, 50);
		pizzaOrder[2] = new Pizza(8, 6, 30);
		pizzaOrder[3] = new Pizza(4, 3, 20);
		pizzaOrder[4] = new Pizza(8, 8, 40);

		for (int counter = 0; counter < pizzaOrder.length; counter++) {

			System.out.println("====pizza#" + (counter + 1) + "======");
			
				 System.out.println();
				 
			
			System.out.println("this pizza is : " + ((pizzaOrder[counter].isBasicPizza() == true) ? "Basic pizza" : "pizza with topping"));
			
			pizzaOrder[counter].print();
			
			System.out.println();
			
			SumOfToppings += pizzaOrder[counter].getToppings();
		}

		System.out.println("==============================");
		System.out.println("the total of all pizzas toppings is :" + SumOfToppings);

	}

}
