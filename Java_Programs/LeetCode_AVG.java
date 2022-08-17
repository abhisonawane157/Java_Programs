
// 1491. Average Salary Excluding the Minimum and Maximum Salary : https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
public class LeetCode_AVG {
    static double average(int[] salary) {
        double maxNum = max(salary);
        double minNum = min(salary);
        double sum = 0.00;
        int count = 0;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] != maxNum && salary[i] != minNum) {
                count++;
                sum = sum + salary[i];
            }
        }
        System.out.println(minNum + "-" + maxNum);
        System.out.println(sum + "-" + count);
        return sum / count;
    }

    static double max(int[] salary) {
        int maxNum = Integer.MIN_VALUE;
        for (int a : salary)
            maxNum = Math.max(maxNum, a);
        return maxNum;
    }

    static double min(int[] salary) {
        int minNum = Integer.MAX_VALUE;
        for (int a : salary)
            minNum = Math.min(minNum, a);
        return minNum;
    }

    public static void main(String[] args) {
        int[] salary = { 8000, 9000, 2000, 3000, 6000, 1000 };
        // int[] salary = { 3000, 1000, 2000 };
        double ans = average(salary);
        System.out.println(ans);
    }
}

// Output
// Input: salary = [4000,3000,1000,2000]
// Output: 2500.00000
// Explanation: Minimum salary and maximum salary are 1000 and 4000
// respectively.
// Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500

// Input: salary = [1000,2000,3000]
// Output: 2000.00000
// Explanation: Minimum salary and maximum salary are 1000 and 3000
// respectively.
// Average salary excluding minimum and maximum salary is (2000) / 1 = 2000

// Explanation : You are given an array of unique integers salary where
// salary[i] is the salary of the ith employee.
// Return the average salary of employees excluding the minimum and maximum
// salary. Answers within 10-5 of the actual answer will be accepted.