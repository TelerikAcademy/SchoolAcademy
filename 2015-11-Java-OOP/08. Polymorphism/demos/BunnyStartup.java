import contracts.*;
import models.*;

import java.util.ArrayList;
import java.util.List;

public class BunnyStartup {
  public static void main(String[] args) {
    List<IBunny> bunnies = new ArrayList<>();

    bunnies.add(new GathererBunny(1, 2, 10));
    bunnies.add(new GathererBunny(2, 3, 4));
    bunnies.add(new GathererBunny(3, 2, 3));

    bunnies.add(new WarriorBunny(3, 2, 100));
    bunnies.add(new WarriorBunny(3, 2, 50));
    bunnies.add(new WarriorBunny(3, 2, 70));

    for (IBunny bunny : bunnies) {
      bunny.eat(new Resource(10));
    }

    for (IBunny bunny : bunnies) {
      System.out.println(bunny.getSize());
    }

    List<IGatherer> gatherers = new ArrayList<>();

    Resource storage = new Resource(0);
    for (IGatherer gatherer : gatherers) {
      storage.add(gatherer.gather(8));
    }


  }
}

