
/**
 * Displaying first name with first character from last name.
 * Also displaying average of multiple test scores with letter grade.
 * @author (Ron Giovanniello)
 * @version (2/26/2020)
 */
import java.util.Scanner;
public class TestScoresandLetterGrade
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        String first; //first name
        String last; // last name
        String grade; // letter grade
        char answer; // yes or no answer
        double test; // test score
        double totalScore;
        double finalScore;
        double score;
        int numberofTests;
        totalScore = 0;
        finalScore = 0;
        
                do
                {
                      System.out.println("Would you like to enter the test scores? ");
                      System.out.println("Yes = y, No = n");
                      answer = stdIn.nextLine().charAt(0);
               
                      if(answer=='y' || answer=='Y')
                      {
                            System.out.println("Enter first name: ");
                            first = stdIn.next();
                            System.out.println("Enter last name: ");
                            last = stdIn.next();
                            System.out.println("Enter number of tests: ");
                            numberofTests = stdIn.nextInt();
        
                           for(  int count=1; count<=numberofTests; count++)
                           {   
            
                             System.out.println("Enter test score: ");
                             test = stdIn.nextDouble();
                             System.out.println(test);
                             totalScore = totalScore + test;
                             finalScore = totalScore/numberofTests;
                           } // end for loop
                          
                           if( finalScore >= 90 )
                           {
                               grade = "A";
                            }
                            else if( finalScore >= 80)
                            {
                               grade = "B";
                            }
                            else if( finalScore >= 70)
                            {      
                               grade = "C";
                            }
                            else if( finalScore >= 60)
                            {
                                grade = "D";
                            }
                            else 
                            {
                                grade = "F";
                            } // end grade if
                          
                            System.out.println(first + " " + last.charAt(0));
                            System.out.println("Average for tests: " + finalScore);
                            System.out.println("Final letter grade is: " + grade + "\n");
                           
                      } // end yes if
                      if(answer == 'n' || answer == 'N')
                      {
                            System.out.println("Good bye.");
                      } // end no if    
                }while(!(answer == 'Y' || answer == 'y' || answer == 'N' || answer == 'n')); // end do
    } // end main
} // end ScoresandLetterGradetest
