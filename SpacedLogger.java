package codingAssignmentWeek5;

public class SpacedLogger implements Logger{

  @Override
  public void log(String log) {
    StringBuilder result = new StringBuilder();
    for(int i = 0; i < log.length(); i++) {
      if(i > 0 && i < log.length() ) {
        result.append(" ");
      }
      result.append(log.charAt(i) );
    }
    System.out.println(result);
    
  }

  @Override
  public void error(String error) {
    StringBuilder result = new StringBuilder("Error: ");
    for(int i = 0; i < error.length(); i++) {
      if(i > 0 && i < error.length() ) {
        result.append(" ");
      }
      result.append(error.charAt(i) );
    }
    System.out.println(result);
    
  }
  
  

}
