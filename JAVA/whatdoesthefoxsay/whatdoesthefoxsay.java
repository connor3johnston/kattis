/*
Rating: ~ 2.1 / 10
Link: https://open.kattis.com/problems/whatdoesthefoxsay
*/

import java.util.*;

public class whatdoesthefoxsay {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int cases = Integer.parseInt(in.nextLine());

    for (int x = 0; x < cases; x++) {
      ArrayList<String> allSoundsHeard = new ArrayList<String>(Arrays.asList(in.nextLine().split(" ")));
      String nextAnimal = in.nextLine();

      while (!nextAnimal.equals("what does the fox say?")) {
        String[] animalSound = nextAnimal.split(" goes ");
        String sound = animalSound[1];

        while (allSoundsHeard.contains(sound)) {
          allSoundsHeard.remove(sound);
        }

        nextAnimal = in.nextLine();
      }

      System.out.println(String.join(" ", allSoundsHeard));
    }
  }
}
