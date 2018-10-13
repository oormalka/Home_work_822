
public class Pizza {

	private int slices;
	private int toppings =0;
	private int diameter;
	
	public int getSlices() {
		return slices;
	}
	public void setSlices(int slices) {
		this.slices = slices;
	}
	public int getToppings() {
		return toppings;
	}
	public void setToppings(int toppings) {
		this.toppings = toppings;
	}
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
		
		
	}
	public Pizza(int slices, int toppings, int diameter) {
		super();
		this.slices = (slices>=1 && slices <=8)? slices:4;
		this.toppings = (toppings <=5 &&toppings >= 0)? toppings :0;
		this.diameter = (diameter<=50 && diameter>=10)? diameter:30;
		
		this.slices=slices;
		this.toppings= toppings;
		this.diameter=diameter;
		
		
	}
	public boolean isBasicPizza () {
		if (toppings==0) {
			
		
		return true;
	}else {
		return false; }
	}
	
	public void print () {
		System.out.println( " the diameter of the pizza is :  "    + diameter + '\n' +
				
				" the number of the slices is : " + slices + '\n' +
				
				"the toppings on the top is  : " + toppings );

	}
}
