// Task 05: Game Arena
class Task5{

    //Complete this method so that it gives the Expected Output
    public static void playGame( Integer[][] arena ){

        int totalPoints = 0;

        // Loop through the arena matrix
        for (int i = 0; i < arena.length; i++) {
            for (int j = 0; j < arena[i].length; j++) {
                // Check if the player is present (multiples of 50)
                if (arena[i][j] % 50 == 0 && arena[i][j] != 0) {
                    // Initialize points for this player
                    int playerPoints = 0;

                    // Check the four possible adjacent cells (up, down, left, right)
                    // Up
                    if (i > 0 && arena[i - 1][j] == 2) playerPoints++;
                    // Down
                    if (i < arena.length - 1 && arena[i + 1][j] == 2) playerPoints++;
                    // Left
                    if (j > 0 && arena[i][j - 1] == 2) playerPoints++;
                    // Right
                    if (j < arena[i].length - 1 && arena[i][j + 1] == 2) playerPoints++;

                    // Add the points from this player to the total
                    totalPoints += playerPoints;
                }
            }
        }

        // Print the total points and check if the team survives
        System.out.println("Points Gained: " + totalPoints + ".");
        if (totalPoints >= 10) {
            System.out.println("Your team has survived the game.");
        } else {
            System.out.println("Your team is out.");
        }
        //TO DO
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] arena = {
            {0,2,2,0},
            {50,1,2,0},
            {2,2,2,0},
            {1,100,2,0}
        };
        System.out.println("Given Arena: ");
        Arr.print2D(arena);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 6. Your team is out.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena );

        System.out.print("\n======================\n");

        Integer[][] arena1 = {
            {0,2,2,0,2},
            {1,50,2,1,100},
            {2,2,2,0,2},
            {0,200,2,0,0}
        };
        System.out.println("\nGiven Arena: ");
        Arr.print2D(arena1);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 14. Your team has survived the game.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena1 );
    }
}