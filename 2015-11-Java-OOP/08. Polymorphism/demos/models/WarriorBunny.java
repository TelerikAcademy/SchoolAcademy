package models;

import contracts.IBunny;
import contracts.IResource;
import contracts.IWarrior;

public class WarriorBunny
    extends BaseBunny implements IBunny, IWarrior {
  private int hp;

  public WarriorBunny(int x, int y, int hp) {
    super(x, y);
    this.setHp(hp);
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  @Override
  public void eat(IResource resource) {
    this.setHp(this.getHp() + 10 * resource.getQuantity());
  }

  @Override
  public int getSize() {
    return this.getHp();
  }
}