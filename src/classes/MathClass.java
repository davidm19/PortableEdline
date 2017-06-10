package classes;

import java.util.ArrayList;

public class MathClass
{
  double testAvg;
  double quizAvg;
  double hwAvg;
  
  double testPercentage = 0.35;
  double quizPercentage = 0.4;
  double hwPercentage = 0.05;
  
  public MathClass(double testAvg, double quizAvg, double hwAvg) {
    this.testAvg = testAvg;
    this.quizAvg = quizAvg;
    this.hwAvg = hwAvg;
  }
  
  public void gradeMath() {
    double testNumber = testPercentage * testAvg; //this one's okay
    double quizNumber = quizPercentage * quizAvg; //
    double hwNumber = hwPercentage * hwAvg;

    double percentageSum = testPercentage + quizPercentage + hwPercentage;

    double totalNumber = testNumber + quizNumber + hwNumber;


    double finalGrade = totalNumber / percentageSum;
    
    finalGrade = Math.round(finalGrade * 100.0) / 100.0;

    String letterGrade = "";

    if(finalGrade > 100) {
      letterGrade = "Off the chart. You fucked up somewhere";
    } else if (finalGrade >= 97 && finalGrade <= 100) {
      letterGrade = "A+";
      System.out.println("Your Math grade is a fantastic " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 92.5 && finalGrade < 97) {
      letterGrade = "A";
      System.out.println("Your Math grade is a great " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 90 && finalGrade < 92.5) {
      letterGrade = "A-";
      System.out.println("Your Math grade is a good " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 89.5 && finalGrade < 90) {
      letterGrade = "A-";
      System.out.println("Your Math grade is an okay " + finalGrade + " (" + letterGrade + ").");
    }else if (finalGrade >= 87 && finalGrade < 89.5) {
      letterGrade = "B+";
      System.out.println("Your Math grade is an okay " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 83 && finalGrade < 87) {
      letterGrade = "B";
      System.out.println("Your Math grade is a meh " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 80 && finalGrade < 83) {
      letterGrade = "B-";
      System.out.println("Your Math grade is a pretty bad " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 77 && finalGrade < 80) {
      letterGrade = "C+";
      System.out.println("Your Math grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 73 && finalGrade < 77) {
      letterGrade = "C";
      System.out.println("Your Math grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 69.5 && finalGrade < 73) {
      letterGrade = "C-";
      System.out.println("Your Math grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 67 && finalGrade < 69.5) {
      letterGrade = "D+";
      System.out.println("Your Math grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 63 && finalGrade < 67) {
      letterGrade = "D";
      System.out.println("Your Math grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 60 && finalGrade < 63) {
      letterGrade = "D-";
      System.out.println("Your Math grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else {
      System.out.println("You fucked up");
    }
  }

  public double getTestAvg(ArrayList<Double> testGradeList)
  {
    double testPoints = 0;
    double scoreSum = 0;
    
    for(int i = 0; i < testGradeList.size(); i++) {
      testPoints += 100;
      scoreSum += testGradeList.get(i);
    }
    
    double testAvg = scoreSum / testPoints;
    
    testAvg *= 100.0;
    
    testAvg = Math.round(testAvg * 100.0) / 100.0;
    
    return testAvg;
  }

  public double getQuizAvg(ArrayList<Double> quizGradeList)
  {
    double quizPoints = 0;
    double scoreSum = 0;
    
    for(int i = 0; i < quizGradeList.size(); i++) {
      quizPoints += 1;
      scoreSum += quizGradeList.get(i);
    }
    
    double testAvg = scoreSum / quizPoints;

    quizAvg = quizAvg * 100.0;

    quizAvg = Math.round(testAvg * 100.0) / 100.0;
    
    return testAvg;
  }

}
