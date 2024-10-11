package codingAssignmentWeek5;

public class AsteriskLogger implements Logger{

  @Override
  public void log(String log) {
    System.out.println("***" + log + "***");
    
  }

  @Override
  public void error(String error) {
    StringBuilder asterisk = new StringBuilder();
    for(int i = 0; i < error.length() + 13; i++) {
      asterisk.append("*");
    }
    System.out.println(asterisk
                        + "\n***Error: " + error + "***"
                        + "\n" + asterisk);
    
  }
  
  

}
