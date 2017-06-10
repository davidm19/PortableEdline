package classes;

import java.util.ArrayList;

public class Science
{
  double testAvg;
  double labAvg;
  double questMode;
  
  double testPercentage = 0.40;
  double labPercentage = 0.50;
  double questPercentage = 0.1;
  
  public Science(double labAvg, double testAvg, double questMode) {
    this.labAvg = labAvg;
    this.testAvg = testAvg;
    this.questMode = questMode;
  }
  
  public void gradeScience() {
    double testNumber = testPercentage * testAvg;
    double labNumber = labPercentage * labAvg;
    double questNumber = questPercentage * questMode;

    double percentageSum = testPercentage + labPercentage + questPercentage;

    double totalNumber = testNumber + labNumber + questNumber;

    double finalGrade = totalNumber / percentageSum;
    
    finalGrade = Math.round(finalGrade * 100.0) / 100.0;

    String letterGrade = "";

    if(finalGrade > 100) {
      letterGrade = "Off the chart. You fucked up somewhere";
    } else if (finalGrade >= 97 && finalGrade <= 100) {
      letterGrade = "A+";
      System.out.println("Your Science grade is a fantastic " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 92.5 && finalGrade < 97) {
      letterGrade = "A";
      System.out.println("Your Science grade is a great " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 90 && finalGrade < 92.5) {
      letterGrade = "A-";
      System.out.println("Your Science grade is a good " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 89.5 && finalGrade < 90) {
      letterGrade = "A-";
      System.out.println("Your Science grade is an okay " + finalGrade + " (" + letterGrade + ").");
    }else if (finalGrade >= 87 && finalGrade < 89.5) {
      letterGrade = "B+";
      System.out.println("Your Science grade is an okay " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 83 && finalGrade < 87) {
      letterGrade = "B";
      System.out.println("Your Science grade is a meh " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 80 && finalGrade < 83) {
      letterGrade = "B-";
      System.out.println("Your Science grade is a pretty bad " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 77 && finalGrade < 80) {
      letterGrade = "C+";
      System.out.println("Your Science grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 73 && finalGrade < 77) {
      letterGrade = "C";
      System.out.println("Your Science grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 69.5 && finalGrade < 73) {
      letterGrade = "C-";
      System.out.println("Your Science grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 67 && finalGrade < 69.5) {
      letterGrade = "D+";
      System.out.println("Your Science grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 63 && finalGrade < 67) {
      letterGrade = "D";
      System.out.println("Your Science grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 60 && finalGrade < 63) {
      letterGrade = "D-";
      System.out.println("Your Science grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else {
      System.out.println("You fucked up");
    }
  }

  public double getTestAvg(ArrayList<Double> testGradeList)
  {
    double testPoints = 0;
    double scoreSum = 0;
    
    for(int i = 0; i < testGradeList.size(); i++) {
      testPoints += 50;
      scoreSum += (testGradeList.get(i) / 2);
    }
    
    double testAvg = scoreSum / testPoints;
    
    testAvg *= 100.0;
    
    testAvg = Math.round(testAvg * 100.0) / 100.0;
    
    return testAvg;
  }

  public double getLabAvg(ArrayList<Double> gradeList)
  {
    double count = 0;
    double scoreSum = 0;
    
    for(int i = 0; i < gradeList.size(); i++) {
      count += 100;
    }
    
    for(int i = 0; i < gradeList.size(); i++) {
      scoreSum += gradeList.get(i);
    }
    
    double labAvg = scoreSum / count;
    
    labAvg *= 100.0;
    
    return labAvg;
  }


}
