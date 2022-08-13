import java.util.*;

public class Maze_Recursion {

    static int count(int r, int c) {
        if (r == 3 || c == 3) {
            return 1;
        }
        int left = count(r + 1, c);
        int right = count(r, c + 1);
        return left + right;
    }

    static void mazePath(String p, int r, int c) {
        if (r == 3 && c == 3) {
            System.out.print(p);
            System.out.print(" ");
            return;
        }
        if (r < 3) {
            mazePath(p + 'D', r + 1, c);
        }
        if (c < 3) {
            mazePath(p + 'R', r, c + 1);
        }
    }

    static ArrayList<String> mazePathRet(String p, int r, int c) {
        if (r == 3 && c == 3) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r < 3) {
            list.addAll(mazePathRet(p + 'D', r + 1, c));
        }
        if (c < 3) {
            list.addAll(mazePathRet(p + 'R', r, c + 1));
        }
        return list;
    }

    static ArrayList<String> mazePathDiagonal(String p, int r, int c) {
        if (r == 3 && c == 3) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r < 3 && c < 3) {
            mazePathDiagonal(p + 'D', r + 1, c + 1);
        }
        if (r < 3) {
            list.addAll(mazePathRet(p + 'V', r + 1, c));
        }
        if (c < 3) {
            list.addAll(mazePathRet(p + 'H', r, c + 1));
        }
        return list;
    }

    static void mazePathWRestriction(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.print(p);
            System.out.print(" ");
            return;
        }
        if (!maze[r][c])
            return;
        if (r < maze.length - 1) {
            mazePathWRestriction(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            mazePathWRestriction(p + 'R', maze, r, c + 1);
        }
    }

    static void mazeAllPath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.print(p);
            System.out.print(" ");
            return;
        }
        if (!maze[r][c])
            return;

        maze[r][c] = false;
        if (r < maze.length - 1) {
            mazeAllPath(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            mazeAllPath(p + 'R', maze, r, c + 1);
        }
        if (r > 0) {
            mazeAllPath(p + 'U', maze, r - 1, c);
        }
        if (c > 0) {
            mazeAllPath(p + 'L', maze, r, c - 1);
        }
        maze[r][c] = true;
    }

    static void mazeAllPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c])
            return;

        maze[r][c] = false;
        path[r][c] = step;
        if (r < maze.length - 1) {
            mazeAllPathPrint(p + 'D', maze, r + 1, c, path, step + 1);
        }
        if (c < maze[0].length - 1) {
            mazeAllPathPrint(p + 'R', maze, r, c + 1, path, step + 1);
        }
        if (r > 0) {
            mazeAllPathPrint(p + 'U', maze, r - 1, c, path, step + 1);
        }
        if (c > 0) {
            mazeAllPathPrint(p + 'L', maze, r, c - 1, path, step + 1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }

    public static void main(String[] args) {
        // {A,_,_}
        // {_,_,_}
        // {_,_,B}
        System.out.println("Count of Paths: " + count(1, 1));
        System.out.println();
        System.out.println("Paths(Right | Down): ");
        mazePath("", 1, 1);
        System.out.println();
        System.out.println();
        System.out.println("Paths Returned: ");
        ArrayList<String> ans = mazePathRet("", 1, 1);
        System.out.println(ans);
        System.out.println();
        System.out.println("Paths(Diagonal | Vertical | Horizontal): ");
        ArrayList<String> ans1 = mazePathDiagonal("", 1, 1);
        System.out.println(ans1);
        System.out.println();
        boolean[][] maze = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        System.out.println("Paths(Down | Right): ");
        mazePathWRestriction("", maze, 0, 0);
        System.out.println();
        System.out.println();
        System.out.println("Paths(ALL): ");
        mazeAllPath("", maze, 0, 0);
        System.out.println();
        int[][] path = new int[maze.length][maze[0].length];
        System.out.println();
        System.out.println("Paths Print(ALL): ");
        mazeAllPathPrint("", maze, 0, 0, path, 0);
        System.out.println();
    }
}
