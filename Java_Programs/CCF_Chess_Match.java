
// Chess Match : https://www.codechef.com/submit/BLITZ3_2
import java.util.*;

public class CCF_Chess_Match {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println((2 * (180 + a)) - (b + c) + "");
        }
        sc.close();
    }
}

// Output
// Input
// 3
// 10 0 2
// 11 2 1
// 12 192 192
// Output
// 378
// 379
// 0

// Example case 1: The total time given to both clocks after 1010 turns is 2
// \cdot (180 + 10) = 3802⋅(180+10)=380 seconds. The total time left at the end
// is 0 + 2 = 20+2=2 seconds. The duration of the game is 380 - 2 = 378380−2=378
// seconds.

// Example case 3: The total time given to both clocks after 1212 turns is 2
// \cdot (180 + 12) = 3842⋅(180+12)=384 seconds. The total time left at the end
// is 192 + 192 = 384192+192=384 seconds. The duration of the game is 384 - 384
// = 0384−384=0 seconds.

// Explanation : In a Chess match "a + b", each player has a clock which shows
// aa minutes at the start and whenever a player makes a move, bb seconds are
// added to this player's clock. Time on a player's clock decreases during that
// player's turns and remains unchanged during the other player's turns. If the
// time on some player's clock hits zero (but not only in this case), this
// player loses the game. There's a 3 + 2 blitz chess match. After N turns (i.e.
// {N+1}/{2} )moves made by white and {N}/{2} moves made by black), the game
// ends and the clocks of the two players stop; they show that the players
// (white and black) have A and B seconds left respectively. Note that after the
// N-th turn, b = 2 seconds are still added to the clock of the player that made
// the last move and then the game ends. Find the total duration of the game,
// i.e. the number of seconds that have elapsed from the start of the game until
// the end.