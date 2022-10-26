
// The Smurfs : https://practice.geeksforgeeks.org/problems/the-smurfs4201/1
class GFG_The_Smurfs {
    static int minFind(int n, String a[]) {
        // code here
        int cntR = 0, cntG = 0, cntB = 0;
        for (String color : a) {
            if (color.equals("R"))
                cntR++;
            else if (color.equals("G"))
                cntG++;
            else
                cntB++;
        }
        if (cntR == n || cntG == n || cntB == n)
            return n;
        if ((cntR % 2 == cntG % 2) && (cntG % 2 == cntB % 2))
            return 2;
        return 1;
    }

    public static void main(String[] args) {
        String[] a = { "R", "G", "B", "R", "B" };
        int n = a.length;
        int ans = minFind(n, a);
        System.out.println(ans);
    }
}

// Output
// Input: n = 5
// a = {'R' , 'G', 'B', 'R', 'B'}
// Output: 1
// Explaination: First 'R' and 'G' makes 'B'.
// Then 'B' and 'R' makes 'G' and that 'G'
// with 'B' at index 2 makes 'R', Now the 'R'
// and the last 'B' makes 'G'.

// Input: n = 2
// a = {'R', 'R'}
// Output: 2
// Explaination: There are two 'R' s. So
// they cannot change to anything else.

// Explaination : A geek once visited a magical island where he found a special
// creature. He named it as Smurf. He noticed a very strange thing there. The
// smurfs resembled the primary colors of light. To make it more clear, the
// primary colors of light are Red(R), Green(G), and Blue(B). He talked to one
// of the smurfs. The smurfs came to know that he is a good programmer. The
// smurfs suggested a deal that they will ask him one question and if he is able
// to answer that question, they will allow the geek to take anything from the
// island.
// The question is as follows:
// The smurfs possess a very magical property. When two smurfs of different
// colors meet with other, they gets converted into a smurf of the third color.
// How many minimum number of smurfs will be remaining after this
// transformation? The question looked simple to geek. However, the smurfs put
// another constraint to make the geek think more. The two smurfs must be
// adjacent to each other to make the transformation take place. There are n
// smurfs the colors of which are given in an array a[].