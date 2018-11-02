package exercise2;

class Person {
	public int age;
	private static int computePopulationSize =0;
	private static float computeAveragePopulationAge=0;
	private static int computeTotalPopulationAge=0;

	public Person(int age) {this.age=age;computePopulationSize++;computeTotalPopulationAge += age;}

	public static int computePopulationSize () {return computePopulationSize;}

	public static float computeAveragePopulationAge (){
		computeAveragePopulationAge =computeTotalPopulationAge/computePopulationSize;
		return computeAveragePopulationAge;}

	public static void resetPopulation() {computePopulationSize=0;computeAveragePopulationAge=0;computeTotalPopulationAge=0;};
}
