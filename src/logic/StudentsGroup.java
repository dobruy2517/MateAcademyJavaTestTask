package logic;

import helpers.HelperClass;

import java.util.ArrayList;
import java.util.List;

public class StudentsGroup extends HelperClass{
//    private HelperClass helperClass = new HelperClass();
    private Object [][] groupJournal;
    private String [] firstNameList = {"Stas", "Vasya", "Ivan", "Ken", "Stiven", "Irina", "Lesia", "Djulia", "Alla", "Elena"};
    private String [] lastNameList = {"Ivanov", "Petrov", "Sydorov", "Tompson", "Stivenson", "Fal", "Gal", "Djin", "GGG", "QWE"};
    private int [] academicPerformanceList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private String [] softSkilsList = {"Attentive", "Assertive", "Artistic Sense", "Able to Listen", "Energetic"};
    private String [] socialPerformanceList = {"active", "passive"};
    private String [] communicabilityList = {"high", "normal", "low"};
    private boolean [] presenceList = {true, false};


    public List<Students> getStudentsList() {
        return studentsList;
    }

    private List<Students> studentsList = new ArrayList<>();
    public Students student;

    public StudentsGroup(int studentsQuantity) {
        createStudentsGroup(studentsQuantity);
    }

    public  List<Students> createStudentsGroup(int studentsQuantity){
        for (int i = 0; i < studentsQuantity; i++) {
            student = new Students(firstNameList[randomArrIndexInBound(0, firstNameList.length)],
                    lastNameList[randomArrIndexInBound(0, lastNameList.length)],
                    academicPerformanceList[randomArrIndexInBound(0, academicPerformanceList.length)],
                    softSkilsList[randomArrIndexInBound(0, softSkilsList.length)],
                    socialPerformanceList[randomArrIndexInBound(0, socialPerformanceList.length)],
                    communicabilityList[randomArrIndexInBound(0, communicabilityList.length)],
                    presenceList[randomArrIndexInBound(0, presenceList.length)]);
            studentsList.add(student);

        }
        return studentsList;
    }

    public Students chooseClassMonitior(){
        Students classMonitor = null;
        for (int i = 0; i < studentsList.size(); i++) {
            if(studentsList.get(i).getAcademicPerformance() == getMaxIntValueFromArray(academicPerformanceList)){
                classMonitor = studentsList.get(i);
            }

        }
                System.out.println("Class monitor student");
                System.out.println(classMonitor.getFirstName() + " " + classMonitor.getLastName());
        return classMonitor;
    }


}
