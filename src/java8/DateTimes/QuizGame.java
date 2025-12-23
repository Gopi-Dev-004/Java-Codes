package java8.DateTimes;

import java.time.LocalDateTime;
import java.util.Scanner;

class QuizQuestion{
    String questions;
    String [] choice;
    String  answer;

    public QuizQuestion(String questions, String[] choice, String answer) {
        this.questions = questions;
        this.choice = choice;
        this.answer = answer;
    }
    void display(){
        System.out.println(questions);
        for(int i = 0; i < choice.length ; i++){
            System.out.println((char) ('a' + i) + ") "+choice[i]);
        }
    }
    boolean checkAns(String ans){
        return ans.equalsIgnoreCase(answer);
    }
}


public class QuizGame {
    static Scanner sc = new Scanner(System.in);

    static QuizQuestion[] questionBank =  {
            new QuizQuestion("1. What is Java?", new String[]{"Language", "OS", "Database", "Compiler"}, "a"),
            new QuizQuestion("2. Which keyword is used for inheritance?", new String[]{"this", "super", "extends", "final"}, "c"),
            new QuizQuestion("3. Which collection does not allow duplicates?", new String[]{"List", "Set", "Queue", "Map"}, "b"),
            // new QuizQuestion("4. Which method starts a thread?", new String[]{"start()", "run()", "execute()", "init()"}, "a"),
            //new QuizQuestion("5. Which package contains Scanner?", new String[]{"java.io", "java.util", "java.sql", "javax.swing"}, "b"),
            //new QuizQuestion("6. Which data type is used for true/false?", new String[]{"int", "boolean", "char", "String"}, "b"),
            //new QuizQuestion("7. Which operator is used for comparison?", new String[]{"=", "==", "+=", "!="}, "b"),
            //new QuizQuestion("8. What is JVM?", new String[]{"Java Virtual Machine", "Java Variable Method", "Java View Module", "Java Visual Machine"}, "a"),
            //new QuizQuestion("9. Which keyword is used to prevent inheritance?", new String[]{"final", "static", "private", "protected"}, "a"),
            //new QuizQuestion("10. Which loop executes at least once?", new String[]{"for", "while", "do-while", "foreach"}, "c")
    };

    static void quizStart() {
        System.out.println("***** Welcome to Quiz Game *****\n");

        while (true) {
            System.out.println("1.View Questions");
            System.out.println("2.Enter Game");
            System.out.println("3.Exit \n");
            System.out.println("Enter the choice: ");
            System.out.println();

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.println("........Questions List.......\n");
                    for (QuizQuestion q : questionBank) {
                        q.display();
                    }
                    break;

                case 2:
                    int score = 0;

                    LocalDateTime quizStart = LocalDateTime.now();

                    for (QuizQuestion q : questionBank) {
                        q.display();

                        LocalDateTime start = LocalDateTime.now();
                        System.out.println("Your answer time is 10 sec only..");
                        String ans = sc.nextLine();
                        LocalDateTime end = LocalDateTime.now();

                        int startSec = start.toLocalTime().toSecondOfDay();
                        int endSec = end.toLocalTime().toSecondOfDay();
                        int sec= endSec - startSec;
                        System.out.println("you take " + sec + " sec");

                        if (sec <= 10) {
                            if (q.checkAns(ans)) {
                                score++;
                            }

                        } else {
                            System.out.println("Time over your score not valid");
                        }
                        System.out.println();
                    }

                    LocalDateTime quizEnd = LocalDateTime.now();
                    int quizStartSec = quizStart.toLocalTime().toSecondOfDay();
                    int quizEndSec = quizEnd.toLocalTime().toSecondOfDay();
                    long totalQuizSec = quizEndSec - quizStartSec;
                    System.out.println("..................................");
                    System.out.println("Total Score and Time Details:  ");
                    System.out.println("Your score is: " + score + "/" + questionBank.length);
                    System.out.println("Time taken : " + totalQuizSec + " seconds");
                    System.out.println("....................................");
                    break;
                case 3:
                    System.out.println("Exited");
                    return;
                default:
                    System.out.println("Invalid choice.....");

            }
        }
    }

    public static void main(String[] args){

        quizStart();

    }
}
