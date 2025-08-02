import java.util.Scanner;
public class Grade_Calculator{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\n________ STUDENT GRADE CALCULATOR _________\n\nGrading System:\nMarks Range:  91-100   81-90   71-80   61-70   51-60   33-50   Below 33\nGrade:\t\tO\t A\t B\t C\t D\t E\t  F");
            System.out.print("\nEnter number of subjects: ");
            int numSubject=sc.nextInt();
            int M[]=new int[numSubject];
            int totalMarks=0;
            System.out.println("Enter marks obtained(out of 100) in different subjects");
            for(int i=0;i<numSubject;i++){
                System.out.print("Subject-"+(i+1)+": ");
                M[i]=sc.nextInt();
                totalMarks+=M[i];
            }
            double avgMark=(double)totalMarks/numSubject;
            String grade;
            if(avgMark>90 && avgMark<=100){
                grade="O";
            }
            else if(avgMark>80 && avgMark<=90){
                grade="A";
            }
            else if(avgMark>70 && avgMark<=80){
                grade="B";
            }
            else if(avgMark>60 && avgMark<=70){
                grade="C";
            }
            else if(avgMark>50 && avgMark<=60){
                grade="D";
            }
            else if(avgMark>=33 && avgMark<=50){
                grade="E";
            }
            else{
                grade="F";
            }
            System.out.println("\nResult Summary\nTotal Marks: "+(numSubject*100)+"\nObtained Marks: "+totalMarks+"\nAverage Percentage: "+avgMark+"%"+"\nGrade: "+grade);
        }
    }
}