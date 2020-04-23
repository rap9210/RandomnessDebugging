import java.util.Random;

public class RandomnessDebugging {
    public static void main(String[] args)
    {
        output("Generate 10 random integers between 0 and 6");
        Random rnd = new Random();
        /*
        Line 7: Initiate java.util.Random by assigning the function to rnd.
        Just like with Scanner.
        Line 14+: For loop to iterate a random number from 0 to 6 10 times.
        bound is 7 because it's non inclusive.
         */
        for (int i = 1; i <= 10; i++)
        {
            int randomInt = rnd.nextInt(7);
            output("Generated number: " + randomInt);
        }
        /*
        Print end of run.
         */
        output("Done.");
    }

    private static void output(String aMessage)
    {
        System.out.println(aMessage);
    }
}
