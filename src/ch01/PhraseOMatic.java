package ch01;

public class PhraseOMatic{
    public static void main(String[] args) {
        String[] wordListOne = {"agnostic", "opinionated", "voice activated", "haptically driven", 
        "extensible", "ractive", "agent based", "functional", "AI enabled", "strongly typed"};

        String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous", "event driven", "pub-sub", 
        "IoT", "cloud native", "service oriented", "containerized", "serverless", "microservice", "distributed ledget"};

        String[] wordListThree = {"framwork", "library", "DSL", "REST API", "repository", 
        "pipeline", "service mesh", "acchitecture", "perspective", "design", "orientation"};

        int oneLength = wordListOne.length;
        int towLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(towLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need is a " + phrase);

    }
}