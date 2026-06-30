import java.util.*;

public class SmartClassroomAttendanceTracker {

    HashMap<String, ArrayList<String>> attendance =
            new HashMap<>();

    void markAttendance(String subject, String student) {

        attendance.putIfAbsent(subject, new ArrayList<>());

        ArrayList<String> students = attendance.get(subject);

        if (!students.contains(student)) {
            students.add(student);
            System.out.println(student + " marked present in " + subject);
        } else {
            System.out.println(student + " is already marked present in " + subject);
        }
    }

    void displayAttendance() {

        System.out.println("\nAttendance Report:");

        for (String subject : attendance.keySet()) {

            ArrayList<String> students = attendance.get(subject);

            System.out.println("\nSubject: " + subject);
            System.out.println("Students: " + students);
            System.out.println("Total Present: " + students.size());
        }
    }

    public static void main(String[] args) {

        SmartClassroomAttendanceTracker tracker =
                new SmartClassroomAttendanceTracker();

        tracker.markAttendance("Computer Networks", "Mahak");
        tracker.markAttendance("Computer Networks", "Anu");
        tracker.markAttendance("Computer Networks", "Mahak");

        tracker.markAttendance("Operating Systems", "Riya");
        tracker.markAttendance("Operating Systems", "Mahak");

        tracker.displayAttendance();
    }
}
