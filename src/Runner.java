import logic.Professors;
import logic.Students;
import logic.StudentsGroup;

public class Runner {
    public static void main(String[] args) {
        Professors professor = new Professors("Ivan", "Ivanovich", "building");
        StudentsGroup gr = new StudentsGroup(10);
        for (int i = 0; i < gr.getStudentsList().size(); i++) {
            System.out.println(gr.getStudentsList().get(i).getFirstName() + " " + gr.getStudentsList().get(i).getLastName()
                    + " " + gr.getStudentsList().get(i).isPresence() + "\n");

        }

        gr.chooseClassMonitior();

        professor.groutMuster(gr.getStudentsList());
    }
}
