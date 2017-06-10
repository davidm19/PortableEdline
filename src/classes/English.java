package classes;

import java.util.ArrayList;

public class English
{
  double testAvg;
  double essayAvg;
  double grammarAvg;
  
  double testPercentage = 0.35;
  double essayPercentage = 0.35;
  double grammarPercentage = 0.15;
  
  public English(double testAvg, double essayAvg, double grammarAvg) {
    this.testAvg = testAvg;
    this.essayAvg = essayAvg;
    this.grammarAvg = grammarAvg;
  }
  
  public void gradeEnglish() {
    double testNumber = testPercentage * testAvg;
    double essayNumber = essayPercentage * essayAvg;
    double grammarNumber = grammarPercentage * grammarAvg;

    double percentageSum = testPercentage + essayPercentage + grammarPercentage;

    double totalNumber = testNumber + essayNumber + grammarNumber;

    double finalGrade = totalNumber / percentageSum;
    
    finalGrade = Math.round(finalGrade * 100.0) / 100.0;

    String letterGrade = "";

    if(finalGrade > 100) {
      letterGrade = "Off the chart. You fucked up somewhere";
    } else if (finalGrade >= 97 && finalGrade <= 100) {
      letterGrade = "A+";
      System.out.println("Your English grade is a fantastic " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 92.5 && finalGrade < 97) {
      letterGrade = "A";
      System.out.println("Your English grade is a great " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 90 && finalGrade < 92.5) {
      letterGrade = "A-";
      System.out.println("Your English grade is a good " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 89.5 && finalGrade < 90) {
      letterGrade = "A-";
      System.out.println("Your English grade is an okay " + finalGrade + " (" + letterGrade + ").");
    }else if (finalGrade >= 87 && finalGrade < 89.5) {
      letterGrade = "B+";
      System.out.println("Your English grade is an okay " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 83 && finalGrade < 87) {
      letterGrade = "B";
      System.out.println("Your English grade is a meh " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 80 && finalGrade < 83) {
      letterGrade = "B-";
      System.out.println("Your English grade is a pretty bad " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 77 && finalGrade < 80) {
      letterGrade = "C+";
      System.out.println("Your English grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 73 && finalGrade < 77) {
      letterGrade = "C";
      System.out.println("Your English grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 69.5 && finalGrade < 73) {
      letterGrade = "C-";
      System.out.println("Your English grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 67 && finalGrade < 69.5) {
      letterGrade = "D+";
      System.out.println("Your English grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 63 && finalGrade < 67) {
      letterGrade = "D";
      System.out.println("Your English grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 60 && finalGrade < 63) {
      letterGrade = "D-";
      System.out.println("Your English grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else {
      System.out.println("You fucked up");
    }
  }

  public double getTestAvg(ArrayList<Double> quizGradeList, ArrayList<Double> testGradeList)
  {
    double quizPoints = 0;
    double testPoints = 0;
    double scoreSum = 0;
    
    for(int i = 0; i < quizGradeList.size(); i++) {
      quizPoints += 10;
      scoreSum += (quizGradeList.get(i) / 10);
    }
    
    for(int i = 0; i < testGradeList.size(); i++) {
      testPoints += 50;
      scoreSum += (testGradeList.get(i) / 2);
    }
    
    scoreSum += 25;
    
    
    double numbahs = quizPoints + testPoints + 25;
    
    double testAvg = scoreSum / numbahs;
    
    testAvg *= 100.0;
    
    testAvg = Math.round(testAvg * 100.0) / 100.0;
    
    return testAvg;
  }

  public double getEssayAvg(ArrayList<Double> gradeList)
  {
    double count = 0;
    double scoreSum = 0;
    
    for(int i = 0; i < gradeList.size(); i++) {
      count += 100;
    }
    
    for(int i = 0; i < gradeList.size(); i++) {
      scoreSum += gradeList.get(i);
    }
    
    double essayAvg = scoreSum / count;
    
    essayAvg *= 100.0;
    
    return essayAvg;
  }

  public double getGrammarAvg(ArrayList<Double> grammarTestGrades, ArrayList<Double> essayGrammarGrades)
  {
    double quizPoints = 0;
    double testPoints = 0;
    double scoreSum = 0;
    
    for(int i = 0; i < grammarTestGrades.size(); i++) {
      quizPoints += 100;
      scoreSum += grammarTestGrades.get(i);
    }
    
    for(int i = 0; i < essayGrammarGrades.size(); i++) {
      testPoints += 100;
      scoreSum += essayGrammarGrades.get(i);
    }
    
    
    
    double numbahs = quizPoints + testPoints;
    
    double grammarAvg = scoreSum / numbahs;
    
    grammarAvg *= 100.0;
    
    grammarAvg = Math.round(testAvg * 100.0) / 100.0;
    
    System.out.println("grammar avg: " + grammarAvg);
    
    return grammarAvg;
  }

//  @Override
//  public double getLabAvg(ArrayList<Double> gradeList)
//  {
//    return 0;
//    double numberOfTests = 0;
//    double scoreSum = 0;
//    
//    for(int i = 0; i < gradeList.size(); i++) {
//      numberOfTests++;
//    }
//    
//    for(int i = 0; i < gradeList.size(); i++) {
//      scoreSum += gradeList.get(i);
//    }
//    
//    double testAvg = scoreSum / numberOfTests;
//    
//    System.out.println("Your test average is " + testAvg);
//    return testAvg;
//   }

}
