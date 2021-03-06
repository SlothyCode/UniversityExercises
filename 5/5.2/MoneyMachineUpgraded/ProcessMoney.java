/**
 * Deal with processing money entered by a customer
 * to purchase tickets.
 */
import java.util.*;

public class ProcessMoney
{
  // Instance variables to hold the state of
  //   the ticket machine
  private int theTicketPrice = 0;         // Ticket price
  private int theCredit = 0;              // Money from customer
  private int theMoneyInTheMachine = 0;   // All the money
  
  //permMap
  private int p200 = 0;
  private int p100 = 0;
  private int p50 = 0;
  private int p20 = 0;
  private int p10 = 0;
  
  //tempMap
  private int t200 = 0;
  private int t100 = 0;
  private int t50 = 0;
  private int t20 = 0;
  private int t10 = 0;
  
  // You need other instance variables to hold
  //   the number of coins of each denomination
  // Remember there is a global list of coins in the machine
  //  (50x200p 47x100p, 67*50p ... )
  // and a 'temporary' list of coins entered to buy the 
  // current ticket
  //  (1x200p 2x50p [if the ticket was for 300p])
  //  When a ticket is bought the 'temporary' list 
  //  is added to the global list
  // If the ticket is not bought the coins are returned 
  //  and hence not added to the global list
  // A better way is to use a map<Integer,Integer>
  
  /**
   * Set the price for the current ticket
   * @param amount Cost of ticket in pence 
   */
  public void setTicketPrice( int amount )
  {
    theTicketPrice = amount;
  }

  /**
   * Return the price in pence of the current ticket
   * @return  Cost of ticket in pence
   */
  public int getTicketPrice()
  {
    return theTicketPrice;
  }

  /**
   * Add a coin with value 'coin' in pence 
   *  to the ticket machine to 'partial' pay for the ticket.
   * @param coin The coin to add to the ticket machine
   */
  public void add( int coin )
  {
    theCredit = theCredit + coin;
    if(coin==200){t200=t200+1;}
    else if(coin==100){t100=t100+1;}
    else if(coin==50){t50=t50+1;}
    else if(coin==20){t20=t20+1;}
    else if(coin==10){t10=t10+1;}
  } 

  /**
   * Return true if sufficent money has been entered to buy
   * the ticket else return false
   * @return true if sufficient money else false
   */
  public boolean enough()
  {
    return (theCredit >= theTicketPrice);
  }

  /**
   * Return the value in pence paid so far into the machine
   *  for a ticket
   * @return  In pence the amount paid so far
   */
  public int getPaidSoFar()
  {
    return theCredit;
  }

  /**
   * Cancel the purchase of the ticket.
   * 'Coins' are returned to the customer.
   * The amount credited so far is set to zero.
   */
  public void cancel()
  {
    theCredit = 0;
    t200=0;
    t100=0;
    t50=0;
    t20=0;
    t10=0;
  }

  /**
   * The ticket has been bought, and money
   * entered by the user is added to the total
   * money in the machine
   */
  public void bought()
  {
    theMoneyInTheMachine = theMoneyInTheMachine + theCredit;
    theCredit = 0;
    p200 = p200 + t200;
    p100 = p100 + t100;    
    p50 = p50 + t50;
    p20 = p20 + t20;
    p10 = p10 + t10;
    t200=0;
    t100=0;
    t50=0;
    t20=0;
    t10=0;
}

  /**
   * Deliver in pence the total amount of money in the machine
   *  that has been used to purchase tickets.
   * @return The total money in the machine in pence.
   */
  public int moneyInMachine()
  {
    return theMoneyInTheMachine;
  }

  // This method is not required for 5.1
  // However for exercise 5.2 it is required
  /**
   * Deliver how many 'coins' are in the machine.
   * Thus if there were 63 10p coins
   *  getNumCoins( 10 ) would return 63.
   * @param  coin The coin selected
   * @return Total number of 'coin'p coins in the machine.
   */
  public int getNumCoins( int coin )
  {
    if(coin==200){return p200;}
    else if(coin==100){return p100;}
    else if(coin==50){return p50;}
    else if(coin==20){return p20;}
    else if(coin==10){return p10;}
    else {return 0;}
  }
}
