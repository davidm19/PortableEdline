package classes;

import java.util.ArrayList;

public class History
{
  double ckAvg;
  double analysisAvg;
  double engageAvg;
  
  double ckPercentage = 0.40;
  double analysisPercentage = 0.30;
  double engagePercentage = 0.15;
  
  public History(double ckAvg, double analysisAvg, double engageAvg) {
    this.ckAvg = ckAvg;
    this.analysisAvg = analysisAvg;
    this.engageAvg = engageAvg;
  }
  
  public void gradeHistory() {
    double testNumber = ckPercentage * ckAvg;
    double essayNumber = analysisPercentage * analysisAvg;
    double grammarNumber = engagePercentage * engageAvg;

    double percentageSum = ckPercentage + analysisPercentage + engagePercentage;

    double totalNumber = testNumber + essayNumber + grammarNumber;

    double finalGrade = totalNumber / percentageSum;
    
    finalGrade = Math.round(finalGrade * 100.0) / 100.0;

    String letterGrade = "";

    if(finalGrade > 100) {
      letterGrade = "Off the chart. You fucked up somewhere";
    } else if (finalGrade >= 97 && finalGrade <= 100) {
      letterGrade = "A+";
      System.out.println("Your History grade is a fantastic " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 92.5 && finalGrade < 97) {
      letterGrade = "A";
      System.out.println("Your History grade is a great " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 90 && finalGrade < 92.5) {
      letterGrade = "A-";
      System.out.println("Your History grade is a good " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 89.5 && finalGrade < 90) {
      letterGrade = "A-";
      System.out.println("Your History grade is an okay " + finalGrade + " (" + letterGrade + ").");
    }else if (finalGrade >= 87 && finalGrade < 89.5) {
      letterGrade = "B+";
      System.out.println("Your History grade is an okay " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 83 && finalGrade < 87) {
      letterGrade = "B";
      System.out.println("Your History grade is a meh " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 80 && finalGrade < 83) {
      letterGrade = "B-";
      System.out.println("Your History grade is a pretty bad " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 77 && finalGrade < 80) {
      letterGrade = "C+";
      System.out.println("Your History grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 73 && finalGrade < 77) {
      letterGrade = "C";
      System.out.println("Your History grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 69.5 && finalGrade < 73) {
      letterGrade = "C-";
      System.out.println("Your History grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 67 && finalGrade < 69.5) {
      letterGrade = "D+";
      System.out.println("Your History grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 63 && finalGrade < 67) {
      letterGrade = "D";
      System.out.println("Your History grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else if (finalGrade >= 60 && finalGrade < 63) {
      letterGrade = "D-";
      System.out.println("Your History grade is a terrible " + finalGrade + " (" + letterGrade + ").");
    } else {
      System.out.println("You fucked up");
    }
  }

  public double getCkAvg(ArrayList<Double> quizGradeList, ArrayList<Double> testGradeList)
  {
    double quizPoints = 0;
    double testPoints = 0;
    double scoreSum = 0;
    
    scoreSum += quizGradeList.get(0) * .2;
    scoreSum += quizGradeList.get(1) * .24;
    scoreSum += quizGradeList.get(2) * .2;
    scoreSum += quizGradeList.get(3) * .1;
  //PUT IN 0.(WHATEVER POINTS THE QUIZZES ARE OUT OF)
    
    for(int i = 0; i < testGradeList.size(); i++) {
      testPoints += 100;
      scoreSum += testGradeList.get(i);
    }
    
    quizPoints += (20 + 24 + 20 + 10);
  //ADD MAX POINTS FOR THESE THINGS
    
    
    double numbahs = quizPoints + testPoints;
    
    double avg = scoreSum / numbahs;
    
    avg *= 100.0;
    
    avg = Math.round(avg * 100.0) / 100.0;
    return avg;
  }

  public double getAnalysisAvg(ArrayList<Double> essayList, ArrayList<Double> miscAssignmentList)
  {
    double count = 0;
    double scoreSum = 0;
    
    for(int i = 0; i < essayList.size(); i++) {
      count += 100;
    }
    
    for(int i = 0; i < essayList.size(); i++) {
      scoreSum += essayList.get(i);
    }
    
    scoreSum += miscAssignmentList.get(0) * 0.3;
    scoreSum += miscAssignmentList.get(1) * 0.25;
    scoreSum += miscAssignmentList.get(2) * 0.75;
    scoreSum += miscAssignmentList.get(3) * 0.3;
    //PUT IN 0.(WHATEVER POINTS THE ASSIGNMENTS ARE OUT OF)
    
    count += (30 + 25 + 75 + 30);
    //ADD MAX POINTS FOR THESE THINGS
    
    double essayAvg = scoreSum / count;
    
    essayAvg *= 100.0;
    
    essayAvg = Math.round(essayAvg * 100.0) / 100.0;
    
    return essayAvg;
  }

  public double getEngageAvg(ArrayList<Double> engagementGrades)
  {

    double count = 0;
    double scoreSum = 0;
    
    scoreSum += engagementGrades.get(0) * 0.1;
    scoreSum += engagementGrades.get(0) * 0.25;
    scoreSum += engagementGrades.get(0) * 0.2;
    
    count += (10 + 25 + 20);
    
    double cEngageAvg = scoreSum / count;
    
    cEngageAvg *= 100.0;
    
    return cEngageAvg;
  }
}
