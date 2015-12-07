package models;

import contracts.IResource;

public class Resource
    implements IResource {
  private int quantity;

  public Resource(int quantity) {
    this.setQuantity(qua);
  }

  @Override
  public int getQuantity() {
    return this.quantity;
  }

  private void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}
