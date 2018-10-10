package movie;

import java.util.Scanner;

public class movie1 {
	static Scanner scan= new Scanner(System.in);
 static int min=70;
 static int max=90 ;
 
 
	public static void main(String[] args) {
		Cienma n [][] = new Cienma [4][3];
for (int i = 0; i < n.length; i++) {
	for (int j = 0; j < n[i].length; j++) {
		
		n[i] [j].setPrice(Math.random()*(max-min)+ min);
		n[i][j].isthechairbusy(false);
		
	}
} 
	
System.out.println("please enter number of seats that you like to buy");	
int order =scan.nextInt ();
int count=0;
for (int o = 0; o <=order; o++) {
	System.out.println("please enter a row and a col");
	int row=scan.nextInt();
	int col= scan.nextInt();
	
	n [row][col].isthechairbusy()=n[row][col].isthechairbusy(true),count++:System.out.println("sorry its busy seat choose new one");
}
}

}
	


