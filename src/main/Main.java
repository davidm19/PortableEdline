package main;

import java.util.ArrayList;
import classes.CompSci;
import classes.English;
import classes.French;
import classes.History;
import classes.MathClass;
import classes.Science;

public class Main
{
  public static void main(String [] args)
  {
    
    /** ENGLISH SECTION */
    English newEnglish = new English(0, 0, 0);
    
    ArrayList<Double> englishQuizGrades = new ArrayList<Double>();
    englishQuizGrades.add(100.0);
    englishQuizGrades.add(100.0);
    //ADD YOUR ENGLISH READING QUIZZES HERE
    
    ArrayList<Double> englishTestGrades = new ArrayList<Double>();
    englishTestGrades.add(90.0);
    //ADD YOUR ENGLISH LITERATURE TESTS
    
    ArrayList<Double> englishEssayGrades = new ArrayList<Double>();
    englishEssayGrades.add(83.0);
    englishEssayGrades.add(90.0);
    //ADD YOUR ENGLISH TESTS HERE
    
    ArrayList<Double> englishGrammarGrades = new ArrayList<Double>();
    englishGrammarGrades.add(93.0);
    englishGrammarGrades.add(94.0);
    //ADD YOUR ENGLISH GRAMMAR GRADES/GRAMMAR TESTS HERE
    
    double englishTestAvg = newEnglish.getTestAvg(englishQuizGrades, englishTestGrades);
    double englishEssayAvg = newEnglish.getEssayAvg(englishEssayGrades);
    double englishGrammarAvg = newEnglish.getEssayAvg(englishGrammarGrades);
    
    English newEnglishTwo = new English(englishTestAvg, englishEssayAvg, englishGrammarAvg);
    newEnglishTwo.gradeEnglish();
    
    /** COMPSCI */
    CompSci compsci = new CompSci();
    compsci.gradeCompSci();
    
    /** SCIENCE */
    Science newScience = new Science(0, 0, 0);
    
    ArrayList<Double> scienceLabGrades = new ArrayList<Double>();
    scienceLabGrades.add(85.0);
    scienceLabGrades.add(85.0);
    scienceLabGrades.add(90.0);
    scienceLabGrades.add(90.0);
    //ADD SCIENCE LAB GRADES HERE
    
    ArrayList<Double> scienceTestGrades = new ArrayList<Double>();
    scienceTestGrades.add(90.0);
    scienceTestGrades.add(80.0);
    scienceTestGrades.add(80.0);
    scienceTestGrades.add(85.0);
    //ADD SCIENCE TEST GRADES HERE
    
    double scienceLabAvg = newScience.getLabAvg(scienceLabGrades);
    double scienceTestAvg = newScience.getTestAvg(scienceTestGrades);
    
    Science scienceTwo = new Science(scienceLabAvg, scienceTestAvg, 85);
    scienceTwo.gradeScience();
    
    /** FRANCAIS */
    French newFrench = new French(87.5, 90.0, 90.68, 93.83, 98.18);
    
    ArrayList<Double> frenchTestGrades = new ArrayList<Double>();
    frenchTestGrades.add(87.5);
    frenchTestGrades.add(87.5);
    //ADD FRENCH TEST GRADES HERE, ADJUST FRENCH FILE
    
    ArrayList<Double> frenchOralGrades = new ArrayList<Double>();
    frenchOralGrades.add(90.5);
    frenchOralGrades.add(89.0);
    frenchOralGrades.add(90.5);
    //ADD FRENCH ORAL GRADES HERE
    
    ArrayList<Double> frenchQuizGrades = new ArrayList<Double>();
    frenchQuizGrades.add(90.0);
    frenchQuizGrades.add(86.67);
    frenchQuizGrades.add(89.29);
    frenchQuizGrades.add(96.67);
    //ADD FRENCH QUIZ GRADES HERE, ADJUST FRENCH FILE
    
    ArrayList<Double> frenchCompositionGrades = new ArrayList<Double>();
    frenchCompositionGrades.add(94.5);
    frenchCompositionGrades.add(94.0);
    frenchCompositionGrades.add(93.0);
    //ADD FRENCH COMPOSITION GRADES HERE, ADJUST FRENCH FILE
    
    ArrayList<Double> frenchcEngageGrades = new ArrayList<Double>();
    frenchcEngageGrades.add(100.0);
    frenchcEngageGrades.add(96.36);
    //ADD FRENCH CLASS ENGAGEMENT GRADES
    
    double frenchTestAvg = newFrench.getTestAvg(frenchTestGrades);
    double frenchOralAvg = newFrench.getOralAvg(frenchOralGrades);
    double frenchQuizAvg = newFrench.getQuizAvg(frenchQuizGrades);
    double frenchCompoAvg = newFrench.getCompositionAvg(frenchCompositionGrades);
    double frenchcEngageAvg = newFrench.getcEngageAvg(frenchcEngageGrades);
    
    French newFrenchTwo = new French(frenchTestAvg, frenchOralAvg, frenchQuizAvg, frenchCompoAvg, frenchcEngageAvg);
    newFrenchTwo.gradeFrench();
    
    /** HISTORY */
    History newHistory = new History(0, 0, 0);
    
    ArrayList<Double> historyQuizGrades = new ArrayList<Double>();
    historyQuizGrades.add(82.0);
    historyQuizGrades.add(100.0);
    historyQuizGrades.add(100.0);
    historyQuizGrades.add(50.0);
    //ADD HISTORY POP QUIZ GRADES HERE
    
    ArrayList<Double> historyTestGrades = new ArrayList<Double>();
    historyTestGrades.add(94.8);
    historyTestGrades.add(85.6);
    //ADD HISTORY TEST GRADES HERE
    
    ArrayList<Double> historyEssayGrades = new ArrayList<Double>();
    historyEssayGrades.add(94.5);
    
    ArrayList<Double> historyMiscAssignmentGrades = new ArrayList<Double>();
    historyMiscAssignmentGrades.add(88.33);
    historyMiscAssignmentGrades.add(91.2);
    historyMiscAssignmentGrades.add(86.67);
    historyMiscAssignmentGrades.add(90.0);
    
    ArrayList<Double> historyEngagementGrades = new ArrayList<Double>();
    historyEngagementGrades.add(100.0);
    historyEngagementGrades.add(100.0);
    historyEngagementGrades.add(100.0);
    
    double historyCKAvg = newHistory.getCkAvg(historyQuizGrades, historyTestGrades);
    double historyAnalysisAvg = newHistory.getAnalysisAvg(historyEssayGrades, historyMiscAssignmentGrades);
    double historyEngagementAvg = newHistory.getEngageAvg(historyEngagementGrades);
    
    History newHistoryTwo = new History(historyCKAvg, historyAnalysisAvg, historyEngagementAvg);
    newHistoryTwo.gradeHistory();
    
    /** MATH */
    MathClass mathOne = new MathClass(95.73, 94.18, 92.0);
    //mathOne.gradeMath();
    
    ArrayList<Double> mathTestGrades = new ArrayList<Double>();
    mathTestGrades.add(100.0);
    mathTestGrades.add(89.8);
    mathTestGrades.add(99.4);
    mathTestGrades.add(93.7);
    //ADD MATH TEST GRADES HERE
    
    ArrayList<Double> mathQuizGrades = new ArrayList<Double>();
    mathQuizGrades.add(95.0);
    mathQuizGrades.add(87.14);
    mathQuizGrades.add(92.86);
    mathQuizGrades.add(98.39);
    mathQuizGrades.add(97.5);
    //ADD MATH QUIZ GRADES HERE
    
    //GET HOMEWORK FROM EDLINE
    
    double mathTestAvg = mathOne.getTestAvg(mathTestGrades);
    double mathQuizAvg = mathOne.getQuizAvg(mathQuizGrades);
    
    MathClass mathTwo = new MathClass(mathTestAvg, mathQuizAvg, 92.0);
    mathTwo.gradeMath();
  }
}
