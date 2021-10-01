import javax.swing.JOptionPane;
 public class computerAverageGradesBugs {

//Begin the main method.
public static void main(String[] args) {

//Set the averageGrade_NoMaxMin and the feedbackMsg.
double averageGrade_NoMaxMin = fillGradesArray();
String feedbackMsg = "";
feedbackMsg = printGradeMsg(averageGrade_NoMaxMin);

 }
//Begin the submetod called, printGradeMs with a parameter of averageGrade_NoMaxMin.
public static String printGradeMsg(double averageGrade_NoMaxMin)
{

//Set the strGrade and the feedbackMsg.
String strGrade= "";
String feedbackMsg="";
//Validate the feedbackMsg based on the averageGrade_NoMaxMin.
if (averageGrade_NoMaxMin < 70)
 {
feedbackMsg = "You needs extra help from your Professor";
}
else if (averageGrade_NoMaxMin > 70 || averageGrade_NoMaxMin <80)
 {
feedbackMsg = "You are doing a good job.";
 }
else if (averageGrade_NoMaxMin > 80 || averageGrade_NoMaxMin <90)
}
else if (averageGrade_NoMaxMin > 90 && averageGrade_NoMaxMin < 100)
{
    feedbackMsg = "You are doing an excellent job, keep it up!!!";
     }

    //Return the feedbackMsg to the main method.
     return feedbackMsg;
    
     }
     //Begin the second submetod, fillGradesArray.
     public static double fillGradesArray()
    {
     //Set maxArrayLength, index, grade, strGrade, averageGrade_NoMaxMin, and
    initialize allGradesArray.
     final int maxArrayLength = 10;
     int[] allGradesArray = new int[maxArrayLength];
     int index = 0;
     int grade = -1;
     String strGrade="";
     double averageGrade_NoMaxMin = 0.00;
    
     //Use try and catch within a do loop and do loop within a for loop to prompt and
    validate the grade user inputs.
     for (index = 0; index <= (maxArrayLength); index++)
     {
     do
     {
     //Validate user inputs.
     try {
     grade = JOptionPane.showInputDialog("Please enter grade(0-100),
    #"+(index+1)+": ");

catch (NumberFormatException e)
 {
 grade = -1;
 JOptionPane.showMessageDialog(null, "ERROR! Enter a grade between 0 and
100");
 }

 }
 while(grade < 0 || grade > 100);
 strGrade = grade+", "+strGrade;

 allGradesArray[index] = grade;

 }
 //Set maxGrade, minGrade, readAllGrades, sumAllGrades, output, strOutput, and
feedbackMsg.
 int maxGrade = allGradesArray[0];
 int minGrade = allGradesArray[0];
 int readAllGrades;
 int sumAllGrades = 0;
 String feedbackMsg ="";
 int output = 0;
String strOutput ="";

//Begin a for loop to find the maximum and the minimum values.
 for (index = 1; index <= (maxArrayLength); index++)
 {
 grade=allGradesArray[index];
 if (allGradesArray[index] > maxGrade)
 {
 maxGrade = allGradesArray[index];

 }
 else if (allGradesArray[index] < minGrade)
 {
 minGrade = allGradesArray[index];
 }

 //Calculate the sum of all grades.
 sumAllGrades += grade;

 //Calculate the average grade of all grades with no maximum or minimum
values.
 averageGrade_NoMaxMin = (float) (sumAllGrades - maxGrade -
minGrade)/(maxArrayLength - 2);

 }
 feedbackMsg = printGradeMsg(averageGrade_NoMaxMin)
 //Print the report: strGrade, averageGrade_NoMaxMin, and the feedbackMsg.
 JOptionPane.showMessageDialog(null,"\nThe grades you entered are: "
  + strGrade
 + "\nThe student's average grade without the maximum and the minimum grade
is: "
 + String.format("%.2f", averageGrade_NoMaxMin)+ "\nThe feedback is:
"+feedbackMsg);

 //Return the averageGrade_NoMaxMin to the main method.
 return averageGrade_NoMaxMin

 }
 }