import java.util.*;

public class EventEntryVerificationSystem {

    HashSet<String> participants = new HashSet<>();

    void registerParticipant(String email) {

        if (participants.add(email)) {
            System.out.println(email + " registered successfully.");
        } else {
            System.out.println("Duplicate registration not allowed for: " + email);
        }
    }

    void displayParticipants() {

        System.out.println("\nRegistered Participants:");

        for (String email : participants) {
            System.out.println(email);
        }

        System.out.println("Total Attendees: " + participants.size());
    }

    public static void main(String[] args) {

        EventEntryVerificationSystem event =
                new EventEntryVerificationSystem();

        event.registerParticipant("mahak@gmail.com");
        event.registerParticipant("anu@gmail.com");
        event.registerParticipant("riya@gmail.com");
        event.registerParticipant("mahak@gmail.com");

        event.displayParticipants();
    }
}
