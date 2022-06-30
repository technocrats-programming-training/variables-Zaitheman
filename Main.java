public class Main {
    public static void main(String[] args) {
        // DO NOT CHANGE 
        String firstName = args[0];
        String lastName = args[1];
        int age = 0;
        try {
            age = Integer.parseInt(args[2]);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        

        // Print out the following string: "Hello, I am <firstName> <lastName>, and I am <age> years old"

      firstName = "Geraldo";
      lastName = "Nortono";
      age = 14;
      
      String funkyTown = "Hello, I am " + firstName + " " + lastName + ", and I am " + age + " years old";
        System.out.println(funkyTown);
      
        // Print out whether age is even
      
      boolean evenOdd = age % 2 == 0;
      System.out.println(evenOdd);
      
        // Print out whether firstName equals lastName
      
      boolean sameName = (firstName == lastName);
      System.out.println(sameName);
      
        // Print out whether age is greater than 0
      
      boolean notZero = (age > 0);
      System.out.println(notZero);
      
    }
}
