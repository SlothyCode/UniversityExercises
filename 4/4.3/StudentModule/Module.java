import java.util.*;

class Module
{
  private ArrayList<Student> people = new ArrayList<>();

  /**
   * Add a student
   * @param student A students details
   */
  public void add( Student student )
  {
    people.add( student );
  }

  /**
   * Return the number of students who pass this module
   * @return Number of students who have passed
   */
  public int pass()
  {
    int passed = 0;
    for (int i = 0; i < people.size(); i++)
    {
        if (people.get(i).getMark()>=40)
        {
            passed++;   
        }
    }
    return passed;
  }

  /**
   * Return the number of students who fail this module
   * @return Number of students who have failed
   */
  public int fail()
  {
    return people.size()-pass();
  }

  /**
   * Return the name of the student with the highest mark
   *  There will only be 1 students who has the highest mark
   * @return Name of the student with the highest mark.
   */
  public String top()
  {
      String studentName = "";
      int studentMark = 0;
      for(int i = 0; i < people.size(); i++)
      {
          if (people.get(i).getMark() > studentMark)
          {
              studentName = people.get(i).getName();
              studentMark = people.get(i).getMark();
          }
      }
      return studentName;
  }

  /**
   * Return the average mark of students on the module
   * @return The average mark
   */
  public double average()
  {
    int totalMark = 0;
    int size = people.size();
    for(int i = 0; i < people.size(); i++)
    {
        totalMark = totalMark + people.get(i).getMark();
    }
    return (double) totalMark/size;
  }
}
