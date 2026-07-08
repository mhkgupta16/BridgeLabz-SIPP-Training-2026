public class EmployeeAttendanceRanking {

    static void topKEmployees(int id[], int attendance[], int k) {

        int n = id.length;

        // Sort attendance in descending order
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (attendance[j] < attendance[j + 1]) {

                    int temp = attendance[j];
                    attendance[j] = attendance[j + 1];
                    attendance[j + 1] = temp;

                    temp = id[j];
                    id[j] = id[j + 1];
                    id[j + 1] = temp;
                }
            }
        }

        System.out.println("Top " + k + " Employees:");

        for (int i = 0; i < k; i++) {

            System.out.println("Employee ID = " + id[i] +
                    " Attendance = " + attendance[i]);
        }
    }

    public static void main(String[] args) {

        int id[] = {101, 102, 103, 104, 105};
        int attendance[] = {90, 98, 85, 96, 80};

        topKEmployees(id, attendance, 3);
    }
}

