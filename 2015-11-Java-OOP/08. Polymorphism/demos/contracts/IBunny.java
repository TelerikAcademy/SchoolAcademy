package contracts;

public interface IBunny {
  double hop(int numberOfTimes);
  void eat(IResource resource);
  int getSize();
}
