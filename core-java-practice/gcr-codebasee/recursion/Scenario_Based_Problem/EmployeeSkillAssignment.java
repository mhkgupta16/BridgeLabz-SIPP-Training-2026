import java.util.*;

public class EmployeeSkillAssignment {

    static void findTeams(int[] skills,
                          int target,
                          int index,
                          ArrayList<Integer> current,
                          int sum) {

        if (sum == target) {
            System.out.println(current);
            return;
        }

        if (index == skills.length || sum > target) {
            return;
        }

        // Include current employee
        current.add(skills[index]);

        findTeams(skills,
                  target,
                  index + 1,
                  current,
                  sum + skills[index]);

        // Backtrack
        current.remove(current.size() - 1);

        // Exclude current employee
        findTeams(skills,
                  target,
                  index + 1,
                  current,
                  sum);
    }

    public static void main(String[] args) {

        int[] skills = {2, 3, 5, 7};
        int target = 10;

        findTeams(skills,
                  target,
                  0,
                  new ArrayList<>(),
                  0);
    }
}