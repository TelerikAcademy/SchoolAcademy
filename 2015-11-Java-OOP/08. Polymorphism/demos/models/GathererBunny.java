package models;

import contracts.IBunny;
import contracts.IGatherer;
import contracts.IResource;

public class GathererBunny
  extends BaseBunny implements IBunny, IGatherer{
  private int weight;

  public GathererBunny(int x, int y, int weight) {
    super(x, y);
    this.setWeight(weight);
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  @Override
  public void eat(IResource resource) {
    this.setWeight(this.getWeight() + resource.getQuantity());
  }

  @Override
  public int getSize() {
    return this.getWeight();
  }

  @Override
  public IResource gather(int hours) {
    return new Resource(hours * 2);
  }
}