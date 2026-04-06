public class Matrizes{
    public static void main(String[] args) {
        double [][] studentsGrades = new double[3][4];

        //Student 1
        studentsGrades[0][0] = 10;
        studentsGrades[0][1] = 7;
        studentsGrades[0][2] = 9;
        studentsGrades[0][3] = 9.5;
        //Student 2
        studentsGrades[1][0] = 9;
        studentsGrades[1][1] = 8;
        studentsGrades[1][2] = 7;
        studentsGrades[1][3] = 9;
        //Student 3
        studentsGrades[2][0] = 8;
        studentsGrades[2][1] = 9;
        studentsGrades[2][2] = 10;
        studentsGrades[2][3] = 7;

        for (int i = 0; i < studentsGrades.length; i++){
            for (int j = 0; j < studentsGrades[i].length; j++){
                System.out.print(studentsGrades[i][j] + " ");
            }
            System.out.println();
        }

        //If need alter some grade
        studentsGrades[1][3] = 8;
    }
}