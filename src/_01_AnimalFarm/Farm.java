package _01_AnimalFarm;

public class Farm {
public static void main(String[] args) {
	Animals[] animals = {new Pig(), new Cow(), new Sheep(), new Lamb(), new Rooster(), new Chicken()};
	animals.equals(animals); 
	for (int i = 0; i < animals.length; i++) {
		makeNoise(Pig());
		makeNoise(Cow());
		makeNoise(Sheep());
		makeNoise(Lamb());
		makeNoise(Rooster());
		makeNoise(Chicken());
	}
}
}
