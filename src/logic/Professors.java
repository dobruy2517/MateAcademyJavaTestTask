package logic;

import java.util.List;

public class Professors {
    private String firstName;
    private String lastName;
    private String specialty;

    public Professors(){}

    public Professors(String firstName, String lastName, String specialty){
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
    }

    public int groutMuster(List<Students> list){
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isPresence() == true){
                count++;
            }
            System.out.println(list.get(i).getFirstName() + " " + list.get(i).getLastName() + " " + list.get(i).isPresence());
        }
        System.out.println("Quantity of present students - " + count);
        return count;
    }
}
