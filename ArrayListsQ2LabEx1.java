package arraylistsq2labex1;
import java.util.ArrayList;
import java.util.Collections;

class Student {
    String Name;
    int Score;
    
    
    public void displayArray(ArrayList<Student> AS) {
        //<your code to display the array elements>
        for(int i=0;i<AS.size();i++){
            System.out.println("Student " + (i+1)+"'s Name:"+AS.get(i).Name +", Score:"+ AS.get(i).Score);
        }
    }
    
     public void searchHighestScore(ArrayList<Student> AS) {
         //<your code to search for the highest score in the array>
         int highest = AS.get(0).Score;
         for(int i=1;i<AS.size();i++){
             if(AS.get(i).Score>highest){
                 highest = AS.get(i).Score;
             }
         }
         System.out.println("The highest score is "+ highest);

    }    
    public void sortScores(ArrayList<Student> AS) {
        //<your code to sort the array>
        int TempScore;
        String TempName;
        for(int i=1;i<AS.size();i++){
            for(int j=i;j>0;j--){
                if(AS.get(j).Score<AS.get(j-1).Score){
                    TempScore = AS.get(j).Score;
                    TempName = AS.get(j).Name;
                    AS.get(j).Score = AS.get(j-1).Score; 
                    AS.get(j).Name = AS.get(j-1).Name;
                    AS.get(j-1).Score = TempScore;
                    AS.get(j-1).Name = TempName;  
                }
            }
        }
        System.out.println("The Array is now sorted by Scores");
    }
    
    public void sortNames(ArrayList<Student> AS) {
        //<your code to sort the array according the names>
        int TempScore;
        String TempName;
        for(int i=1;i<AS.size();i++){
            for(int j=i;j>0;j--){
                if(AS.get(j).Name.charAt(0)<AS.get(j-1).Name.charAt(0)){
                    TempScore = AS.get(j).Score;
                    TempName = AS.get(j).Name;
                    AS.get(j).Score = AS.get(j-1).Score; 
                    AS.get(j).Name = AS.get(j-1).Name;
                    AS.get(j-1).Score = TempScore;
                    AS.get(j-1).Name = TempName;  
                }
            }
        }
        System.out.println("The Array is now sorted by Alphabetical order");
   }
}
public class ArrayListsQ2LabEx1 {
    static void display(ArrayList<Student2> AS) {
        //<your code to display the array elements>
        for(int i=0;i<AS.size();i++){
            System.out.println("Student " + (i+1)+"'s Name:"+AS.get(i).Name +", Score:"+ AS.get(i).Score);
        }
    }
    
     static void searchHighestScore(ArrayList<Student2> AS) {
         //<your code to search for the highest score in the array>
         int highest = AS.get(0).Score;
         for(int i=1;i<AS.size();i++){
             if(AS.get(i).Score>highest){
                 highest = AS.get(i).Score;
             }
         }
         System.out.println("The highest score is "+ highest);

    }    
    static ArrayList<Student2> sortScores(ArrayList<Student2> AS) {
        //<your code to sort the array>
        int TempScore;
        String TempName;
        ArrayList<Student2> AS2 = new ArrayList<Student2>();
        AS2 = AS;
        for(int i=1;i<AS2.size();i++){
            for(int j=i;j>0;j--){
                if(AS2.get(j).Score<AS2.get(j-1).Score){
                    TempScore = AS2.get(j).Score;
                    TempName = AS2.get(j).Name;
                    AS2.get(j).Score = AS2.get(j-1).Score; 
                    AS2.get(j).Name = AS2.get(j-1).Name;
                    AS2.get(j-1).Score = TempScore;
                    AS2.get(j-1).Name = TempName;  
                }
            }
        }
        System.out.println("The Array is now sorted by Scores");
        return AS2;
    }
    
    static void sortNames(ArrayList<Student2> AS) {
        //<your code to sort the array according the names>
        int TempScore;
        String TempName;
        for(int i=1;i<AS.size();i++){
            for(int j=i;j>0;j--){
                if(AS.get(j).Name.charAt(0)<AS.get(j-1).Name.charAt(0)){
                    TempScore = AS.get(j).Score;
                    TempName = AS.get(j).Name;
                    AS.get(j).Score = AS.get(j-1).Score; 
                    AS.get(j).Name = AS.get(j-1).Name;
                    AS.get(j-1).Score = TempScore;
                    AS.get(j-1).Name = TempName;  
                }
            }
        }
        System.out.println("The Array is now sorted by Alphabetical order");
   }

    public static void main(String[] args) {
        System.out.println("Array Demo 1:");
        String[] NameI = {"Bok", "Mik", "Jak", "Luds", "Kim"};
        int[] ScoreI = {90, 96, 91, 97, 99};
        
        ArrayList<Student> StudentArrayList = new ArrayList<Student>();
        for (int i = 0; i <= 4; i++) {
            StudentArrayList.add(new Student());
            StudentArrayList.get(i).Name = NameI[i];
            StudentArrayList.get(i).Score = ScoreI[i];
        }
        
       
        Student method = new Student();

        method.displayArray(StudentArrayList);

        method.searchHighestScore(StudentArrayList);

        method.sortScores(StudentArrayList);
        
        method.displayArray(StudentArrayList);

        method.sortNames(StudentArrayList);
        
        method.displayArray(StudentArrayList); 
        
        System.out.println("Array Demo 2:");
        
        ArrayList<Student2> Student2ArrayList = new ArrayList<>();

        for(int x=0; x<5; x++){Student2ArrayList.add(new Student2());}

        Student2ArrayList.get(0).Name = "Bok"; Student2ArrayList.get(0).Score = 90;
        Student2ArrayList.get(1).Name = "Mik"; Student2ArrayList.get(1).Score = 96;
        Student2ArrayList.get(2).Name = "Jak"; Student2ArrayList.get(2).Score = 91;
        Student2ArrayList.get(3).Name = "Luds"; Student2ArrayList.get(3).Score = 97;
        Student2ArrayList.get(4).Name = "Kim"; Student2ArrayList.get(4).Score = 99;

        display(Student2ArrayList);
        display(sortScores(Student2ArrayList));
        sortNames(Student2ArrayList);
        searchHighestScore(Student2ArrayList);
    }
    
    
}
