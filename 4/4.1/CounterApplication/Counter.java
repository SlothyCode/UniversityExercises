public class Counter
{
  // Declaration of a long instance variable to hold
  //  the value of the counter
  public long counterValue = 0;
  // You need to declare this instance variable here.
  //  What should it initial value be.

  /**
   * Return the current value of the counter
   * @return The value of the counter
   */
  public long getValue()
  {
    return counterValue;
  }

  /**
   * Reset the counter to zero
   */
  public void reset()
  {
    counterValue = 0;
  }

  /**
   * Add 1 to the counter
   */
  public void inc()
  {
    counterValue++;
  }

  /**
   * Subtract 1 from the counter
   */
  public void dec()
  {
    counterValue--;
  }

  /**
   * Add 5 to the counter
   */
  public void add5()
  {
    counterValue = counterValue + 5;
  }

  /**
   * Add 10 to the counter
   */
  public void add10()
  {
    counterValue = counterValue + 10;
  }

}

