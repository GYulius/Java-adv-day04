package exceptions.custom;

public class UserService { // Class handling user services
    // Method to find a user by userId, which can throw UserNotFoundException
    public void findUser(String userId) throws UserNotFoundException {
        // Checking if userId is null, empty, or not equal to "expectedUser"
        if (userId == null || userId.isEmpty() || !userId.equals("expectedUser")) {
            // Throwing UserNotFoundException with a custom message
            throw new UserNotFoundException("User with id " + userId + " not found");
        }
        // If the user is found, printing the userId
        System.out.println("User found: " + userId);
    }

    public static void main(String[] args) {
        UserService userService = new UserService(); // Creating an instance of UserService
        try {
            // Attempting to find the user with id "expectedUser"
            userService.findUser("expectedUser");
        } catch (UserNotFoundException e) {
            // Catching and printing the UserNotFoundException message
            System.out.println(e.getMessage());
        }
    }
}