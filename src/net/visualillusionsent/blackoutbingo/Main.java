package net.visualillusionsent.blackoutbingo;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

import static java.lang.Math.abs;

/**
 * Super Mario Maker Blackout Bingo Random Card Generator
 * Concept created by SpaceKatUniverse
 * https://www.twitch.tv/spacekatuniverse
 *
 * @author Jason Jones (darkdiplomat)
 */
public class Main {
    private static final String VERSION = "1.0.1";
    private static final String goal = "{\"name\": \"%s\"},";
    private static final Random rng = new Random();

    public static void main(String[] args) {
        long seed = -1;
        // For those that want to specify a seed
        if(args.length > 0) {
            try {
                // check if the seed is numeric already
                seed = abs(Long.parseLong(args[0]));
                rng.setSeed(seed);
            }
            catch (NumberFormatException nfex){
                // Not numeric, convert to hash
                seed = abs(args[0].hashCode());
                rng.setSeed(seed);
            }
        }
        // No seed specified
        else {
            // generate a random seed
            seed = abs(rng.nextLong());
            // reapply our random seed
            rng.setSeed(seed);
        }
        // The end list of goals
        List<String> goals = new ArrayList<String>(25);
        // The possible tiles
        List<BingoTiles> generator = Arrays.asList(BingoTiles.values());
        // shuffle the tiles
        Collections.shuffle(generator, rng);
        // Prepare to console output
        PrintStream console = System.out;
        // Grab the first 25 and log what they were
        console.println("Super Mario Maker Blackout Bingo Card Generator v"+VERSION);
        console.println("Concept by SpaceKatUniverse");
        console.println("Program created by: DarkDiplomat");
        console.println("Picking 25 of a possible " + generator.size());
        console.println("[");
        for(int index = 0; index < 25; index++) {
            String out = String.format(goal, generator.get(index).toString()).replace("_", " ");
            if(index == 24) {
               out = out.replace(",", "");
            }
            goals.add(out);
            console.println(out);
        }
        console.println("]");
        // Prepare to output file
        PrintStream stream = null;
        try {
            // open a file to output to
            stream = new PrintStream("blackoutcard_"+seed+".txt");
            // Format the json for bingosync
            stream.println("[");
            for(String goal : goals) {
                stream.println(goal);
            }
            stream.print("]");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            // wrap up
            if(stream != null) {
                stream.close();
            }
        }
    }
}
