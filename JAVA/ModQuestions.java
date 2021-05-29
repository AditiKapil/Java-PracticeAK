//
public class ModQuestions
{
  public static void main(String args[])
  {
    new ModQuestions();
  }
  public ModQuestions()
  {
    int players = IBIO.inputInt("Enter the number of players: ");
    int left = players/7;
    int remain = players%7;
    System.out.println("There will be "+left+" teams with "+remain+" players left over");
  }
}