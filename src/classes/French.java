package classes;

import java.util.ArrayList;

public class French
{
  double testAvg;
  double oralAvg;
  double quizAvg;
  double composition;
  double cEngage;
  
  double testPercentage = 0.30;
  double oralPercentage = 0.20;
  double quizPercentage = 0.10;
  double compositionPercentage = 0.20;
  double cEngagePercentage = 0.10;
  
  public French(double testAvg, double oralAvg, double quizAvg, double composition, double cEngage) {
    this.testAvg = testAvg;
    this.oralAvg = oralAvg;
    this.quizAvg = quizAvg;
    this.composition = composition;
    this.cEngage = cEngage;
  }
  
  public void gradeFrench() {
    double testNumber = testPercentage * testAvg;
    double essayNumber = oralPercentage * oralAvg;
    double grammarNumber = quizPercentage * quizAvg;
    double compoNumber = compositionPercentage * composition;
    double cEngageNumber = cEngagePercentage * cEngage;

    double percentageSum = testPercentage + oralPercentage + quizPercentage + compositionPercentage + cEngagePercentage;

    double totalNumber = testNumber + essayNumber + grammarNumber + compoNumber + cEngageNumber;

    double finalGrade = totalNumber / percentageSum;
    
    finalGrade = Math.round(finalGrade * 100.0) / 100.0;

    String letterGrade = "";

    if(finalGrade > 100) {
      letterGrade = "Off the chart. You fucked up somewhere";
    } else if (finalGrade >= 97 && finalGrade <= 100) {
      letterGrade = "A+";
      System.out.println("Your French grade is a fantastic " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 92.5 && finalGrade < 97) {
      letterGrade = "A";
      System.out.println("Your French grade is a great " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 90 && finalGrade < 92.5) {
      letterGrade = "A-";
      System.out.println("Your French grade is a good " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 89.5 && finalGrade < 90) {
      letterGrade = "A-";
      System.out.println("Your French grade is an okay " + finalGrade + " (" + letterGrade + ").");
    }else if (finalGrade >= 87 && finalGrade < 89.5) {
      letterGrade = "B+";
      System.out.println("Your French grade is an okay " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 83 && finalGrade < 87) {
      letterGrade = "B";
      System.out.println("Your French grade is a meh " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 80 && finalGrade < 83) {
      letterGrade = "B-";
      System.out.println("Your French grade is a pretty bad " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 77 && finalGrade < 80) {
      letterGrade = "C+";
      System.out.println("Your French grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 73 && finalGrade < 77) {
      letterGrade = "C";
      System.out.println("Your French grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 69.5 && finalGrade < 73) {
      letterGrade = "C-";
      System.out.println("Your French grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 67 && finalGrade < 69.5) {
      letterGrade = "D+";
      System.out.println("Your French grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 63 && finalGrade < 67) {
      letterGrade = "D";
      System.out.println("Your French grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 60 && finalGrade < 63) {
      letterGrade = "D-";
      System.out.println("Your French grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else {
      System.out.println("You fucked up");
    }
  }

  public double getTestAvg(ArrayList<Double> testGradeList)
  {

    double scoreSum = 0;
    

    scoreSum += testGradeList.get(0) * 0.6;
    scoreSum += testGradeList.get(1) * 0.8;
    //PUT IN 0.(WHATEVER POINTS THE TESTS ARE OUT OF)
    
    double testAvg = scoreSum / (60 + 80); //ADD TOTAL TEST POINTS
    
    testAvg *= 100.0;
    
    testAvg = Math.round(testAvg * 100.0) / 100.0;
    
    return testAvg;
  }

  public double getOralAvg(ArrayList<Double> gradeList)
  {
    double count = 0;
    double scoreSum = 0;
    
    for(int i = 0; i < gradeList.size(); i++) {
      count += 100;
    }
    
    for(int i = 0; i < gradeList.size(); i++) {
      scoreSum += gradeList.get(i);
    }
    
    double oralAvg = scoreSum / count;
    
    oralAvg *= 100.0;
    
    return oralAvg;
  }

  public double getQuizAvg(ArrayList<Double> testGradeList)
  {

    double scoreSum = 0;
    

    scoreSum += testGradeList.get(0) * 0.3;
    scoreSum += testGradeList.get(1) * 0.3;
    scoreSum += testGradeList.get(2) * 0.28;
    scoreSum += testGradeList.get(3) * 0.3;
    //PUT IN 0.(WHATEVER POINTS THE TESTS ARE OUT OF)
    
    double testAvg = scoreSum / (30 + 30 + 28 + 30); //ADD TOTAL TEST POINTS
    
    testAvg *= 100.0;
    
    testAvg = Math.round(testAvg * 100.0) / 100.0;
    
    return testAvg;
  }
  
  public double getCompositionAvg(ArrayList<Double> compositionGradeList)
  {

    double count = 0;
    double scoreSum = 0;
    

    for(int i = 0; i < compositionGradeList.size(); i++) {
      count += 1;
    }
    
    for(int i = 0; i < compositionGradeList.size(); i++) {
      scoreSum += compositionGradeList.get(i);
    }
    
    double compAvg = scoreSum / count;
    
    return compAvg;
  }
  
  public double getcEngageAvg(ArrayList<Double> compositionGradeList)
  {

    double count = 0;
    double scoreSum = 0;
    

    for(int i = 0; i < compositionGradeList.size(); i++) {
      count += 55;
    }
    
    for(int i = 0; i < compositionGradeList.size(); i++) {
      scoreSum += (compositionGradeList.get(i) * .55);
    }
    
    double cEngageAvg = scoreSum / count;
    
    cEngageAvg *= 100.0;
    
    return cEngageAvg;
  }


}
