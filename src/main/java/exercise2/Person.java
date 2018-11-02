package exercise2;

class Person {
	public int age;
	private static int computePopulationSize ;
	private static float computeAveragePopulationAge;
	private static int computeTotalPopulationAge;

	public Person(int age) {this.age=age;computePopulationSize++;computeTotalPopulationAge += this.age;}

	public static int computePopulationSize () {return computePopulationSize;}

	private static float computeAveragePopulationAge (){
		computeAveragePopulationAge =computeTotalPopulationAge/computePopulationSize;
		return computeAveragePopulationAge;}

	static void resetPopulation() {};
}
