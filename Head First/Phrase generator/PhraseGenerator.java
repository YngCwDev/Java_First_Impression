public class PhraseGenerator {
 	public static void main (String[] args) {
		String[] wordListOne = {"agnostic", "opinionated","voice activated", "haptically driven", "extensible","reactive", "agent based", "functional", "AI enabled","strongly typed"};
		String[] wordListTwo = {"loosely coupled", "six sigma","asynchronous", "event driven", "pub-sub", "IoT", "cloud native", "service oriented", "containerized", "serverless", "microservices", "distributed ledger"};
 		String[] wordListThree = {"framework", "library","DSL", "REST API", "repository", "pipeline", "service mesh", "architecture", "perspective", "design", "orientation"};

		int lengthOne = wordListOne.length;
		int lengthTwo = wordListTwo.length;
		int lengthThree = wordListThree.length;


		java.util.Random numGenerator = new java.util.Random();
		int randOne = numGenerator.nextInt(lengthOne);
		int randTwo = numGenerator.nextInt(lengthTwo);
		int randThree = numGenerator.nextInt(lengthThree);

		String phrase = wordListOne[randOne] + " " + wordListTwo[randTwo] + " " + wordListThree[randThree];

		System.out.println(phrase);
 	}
}
