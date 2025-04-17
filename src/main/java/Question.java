import java.util.Scanner;


public class Question {
  String question;
  int totalMarks;
  String answer;
  String studentAnswer = " ";


public Question(String question, int totalMarks, String answer){
this.question = question;
this.totalMarks = totalMarks;
this.answer = answer;
}


public void AskQuestion(Scanner scanner){
    System.out.println(question + "(" + totalMarks + " marks)");
    System.out.print(answer + ":");
    studentAnswer = scanner.nextLine();
}

public int CheckAnswer(){
if (studentAnswer.equals(answer)){
return totalMarks;
}
return 0;

}     



}