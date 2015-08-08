package zadaci_31_07_2015;

import extrapackage.Numbers;

/* Pretpostavimo da kupujemo rižu ili neki drugi proizvod u dva razlièita pakovanja. 
 * Želimo napisati program koji uporeðuje cijene ta dva pakovanja. 
 * Program pita korisnika da unese težinu i cijenu oba pakovanja te ispisuje koje pakovanje ima bolju cijenu.*/

/**
 * @author Marina Sljivic
 *
 */
class Pack{
	private double price;
	private double weight;
	
	//constructor
	Pack(double price, double weight){
		this.price = price;
		this.weight = weight;
	}
	
	//getters for the price and weight
	public double getPrice() {
		return price;
	}
	public double getWeight() {
		return weight;
	}
	
	/**
	 * @param otherWeight
	 * @return the proportional price of the otherWeight
	 */
	double priceProportionally(double otherWeight){
		//if the weight costs the price, than the otherWeight costs proportionally to the price
		return otherWeight*getPrice()/getWeight();
	}
}

/**
 * @author Marina Sljivic
 *
 */
public class BestBuy {

	public static void main(String[] args) {
		//take the users inputs for the packs with helper methods and make Pack objects
		System.out.println("Enter the price and the weight of the first pack: ");
		Pack firstPack = new Pack(Numbers.inputPositiveDouble(),Numbers.inputPositiveDouble());
		System.out.println("Enter the price and the weight of the second pack: ");
		Pack secondPack = new Pack(Numbers.inputPositiveDouble(),Numbers.inputPositiveDouble());
		
		//to compare the two packs
		//find how much would cost the first pack if we buy it in the weight of the second
		//(koliko bi kostalo prvo pakovanje kada bismo kupovali po tezini drugog)
		
		//secondPack.priceProportionally(firstPack.getWeight()) 
		//is how much would cost the secondPack in quantity of the first
		if(firstPack.getPrice() > secondPack.priceProportionally(firstPack.getWeight())){
			
			//if the price of the first is greater than the price of the second(in first's weight)
			System.out.println("The second pack has a better price.");
			
		}else if(firstPack.getPrice() == secondPack.priceProportionally(firstPack.getWeight())){
			//if their prices and quantity are the same, print:
			System.out.println("They cost the same.");
			
		}else{//else if the price of the first is lower than the price of the second(in first's weight)
			System.out.println("The first pack has a better price.");
		}
		
	}

}
