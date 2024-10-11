package codingAssignmentWeek5;

public class App {

  public static void main(String[] args) {
    
    Logger asteriskLogger = new AsteriskLogger();
    asteriskLogger.log("Unanimous");
    System.out.println();
    asteriskLogger.error("Unanimous");
    
System.out.println("\n\n\n");
    
    Logger spacedLogger = new SpacedLogger();
    spacedLogger.log("Alaska");
    System.out.println();
    spacedLogger.error("Alaska");

  }

}
