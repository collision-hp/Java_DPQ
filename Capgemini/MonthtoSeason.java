// 10.
// Shraddha Kapoor's professor suggested that she study hard and prepare well for the lesson on seasons. If her professor says month then, she has to tell the name of the season corresponding to that month. So write the program to get the solution to the above task?
// March to May - Spring Season
// June to August - Summer Season
// September to November - Autumn Season
// December to February - Winter Season
// Note: The entered month should be in the range of 1 to 12. If the user enters a month less than 1 or greater than 12 then the message "Invalid Month Entered" should get displayed.

// Sample Input 1:
// Enter month: 6

// Sample Output 1:
// Season: Summer

public class MonthtoSeason {
    public static void Season(int n){
        switch (n) {
            case 1,2,12->System.out.println("Winter Season");
            case 3,4,5->System.out.println("Spring Season");
            case 6,7,8->System.out.println("Summer Season");
            case 9,10,11->System.out.println("Autumn Season");
            default->System.out.println("Invalid Month");
        }
    }
    public static void main(String[] args) {
        Season(10);
    }
}
