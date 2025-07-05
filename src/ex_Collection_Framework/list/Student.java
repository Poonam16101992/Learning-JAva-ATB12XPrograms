package ex_Collection_Framework.list;

public class Student {

    private String name;
    private Integer roll_no;

    Student(String name,Integer roll_no ){
        this.name=name;
        this.roll_no=roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(Integer roll_no) {
        this.roll_no = roll_no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                '}';
    }
    public void printDetails(){
        System.out.println("Student_name: "+this.name);
        System.out.println("Roll_no: "+this.roll_no);
    }
}
