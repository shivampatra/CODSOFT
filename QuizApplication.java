import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int questionCount = 20; // Number of questions in the quiz
        int[] questionTimeLimits = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}; // Time limit for each question in seconds
        String[][] questions = {
            {"What is the capital of France?", "Paris", "London", "Berlin", "Madrid"},
            {"Who is the author of To Kill a Mockingbird?", "Harper Lee", "Mark Twain", "Ernest Hemingway", "F. Scott Fitzgerald"},
            {"What is the largest planet in our solar system?", "Jupiter", "Saturn", "Mars", "Earth"},
            {"Who discovered penicillin?", "Alexander Fleming", "Louis Pasteur", "Marie Curie", "Isaac Newton"},
            {"What is the tallest mammal in the world?", "Giraffe", "Elephant", "Hippopotamus", "Rhino"},
            {"What is the chemical symbol for gold?", "Au", "Ag", "Pt", "Fe"},
            {"Who is the current President of the United States?", "Joe Biden", "Barack Obama", "Donald Trump", "George W. Bush"},
            {"What is the largest ocean in the world?", "Pacific Ocean", "Atlantic Ocean", "Indian Ocean", "Arctic Ocean"},
            {"Which country is known as the Land of the Rising Sun?", "Japan", "China", "South Korea", "Thailand"},
            {"Who wrote the play 'Hamlet'?", "William Shakespeare", "George Bernard Shaw", "Anton Chekhov", "Tennessee Williams"},
            {"Who painted the Mona Lisa?", "Leonardo da Vinci", "Michelangelo", "Vincent van Gogh", "Pablo Picasso"},
            {"What is the chemical symbol for water?", "H2O", "CO2", "NaCl", "O2"},
            {"Who is the tallest basketball player in NBA history?", "Gheorghe Mureșan", "Yao Ming", "Shaquille O'Neal", "Manute Bol"},
            {"In which year did the Titanic sink?", "1912", "1907", "1921", "1915"},
            {"What is the largest desert in the world?", "Sahara Desert", "Arabian Desert", "Gobi Desert", "Kalahari Desert"},
            {"Who is the Greek god of the sea?", "Poseidon", "Zeus", "Hades", "Ares"},
            {"What is the primary ingredient in guacamole?", "Avocado", "Tomato", "Onion", "Pepper"},
            {"What is the main ingredient in sushi?", "Rice", "Fish", "Nori", "Soy Sauce"},
            {"What is the chemical symbol for iron?", "Fe", "Ir", "In", "Au"},
            {"Who wrote the novel '1984'?", "George Orwell", "Ray Bradbury", "Aldous Huxley", "F. Scott Fitzgerald"}
        };

        System.out.println("Welcome to the Quiz! Each question has its own time limit. Press Enter to start.");

        // Wait for the user to press Enter to start the quiz
        scanner.nextLine();

        for (int currentQuestion = 0; currentQuestion < questionCount; currentQuestion++) {
            System.out.println();
            System.out.println("Question " + (currentQuestion + 1) + ": " + questions[currentQuestion][0]);
            System.out.println("Options:");

            // Display options
            for (int i = 1; i < questions[currentQuestion].length; i++) {
                System.out.println(i + ". " + questions[currentQuestion][i]);
            }

            System.out.println("Time remaining for this question: " + questionTimeLimits[currentQuestion] + " seconds");
            System.out.print("Enter your answer (1-" + (questions[currentQuestion].length - 1) + "): ");

            // Record the starting time for the current question
            long startTime = System.currentTimeMillis();

            int userAnswerIndex = scanner.nextInt();

            // Calculate the time taken to answer the question
            long endTime = System.currentTimeMillis();
            long timeTaken = (endTime - startTime) / 1000;

            // Check if the time limit for the question has been exceeded
            if (timeTaken > questionTimeLimits[currentQuestion]) {
                System.out.println("Time's up! You have exceeded the time limit for this question.");
                continue; // Skip to the next question
            }

            // Display the correct answer
            System.out.println("Correct answer: " + questions[currentQuestion][1]);

            // Check if the answer is correct and calculate the score
            if (questions[currentQuestion][userAnswerIndex].equals(questions[currentQuestion][1])) {
                score++;
            }
        }

        System.out.println();
        System.out.println("Quiz Over.");

        // Display the final score
        System.out.println("Your final score is: " + score + "/" + questionCount);
    }
}
