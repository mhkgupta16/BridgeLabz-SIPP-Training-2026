public class OnlineQuizApplication {

    public static void main(String[] args) {

        String[] answers = {"A", "B", "C", "D"};

        for (int i = 0; i <= 5; i++) {

            try {

                if (answers[i].equals("A")) {

                    System.out.println(
                            "Question " + i + " correct"
                    );
                }

            } catch (ArrayIndexOutOfBoundsException e) {

                System.out.println(
                        "Question " + i +
                                ": Invalid answer index"
                );

            } catch (NullPointerException e) {

                System.out.println(
                        "Question " + i +
                                ": Answer not available"
                );
            }
        }

        System.out.println("Quiz checking completed.");
    }
}