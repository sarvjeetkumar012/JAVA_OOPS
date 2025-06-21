// Step 1: Define your own (user-defined) exception
class InvalidAgeException extends Exception {
    // Constructor that passes the error message to the superclass
    InvalidAgeException(String message) {
        super(message);
    }
}

// Step 2: Main class to use the exception
public class VotingEligibility {

    // Method that checks age and throws exception if age < 18
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You are not eligible to vote.");
        } else {
            System.out.println("You are eligible to vote!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16); // Try changing this to 20 to see eligible output
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    }
