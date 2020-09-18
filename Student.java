//Ihave add this
public class Student {
    // khai bao cac thuoc tinh cho Student
    private String name;
    private String id;
    private String group;
    private String email;
    // khai bao cac phuong thuc getter, setter cho Student

    public String getName() {
        return this.name;
    }

    public void setName(String s) {
        this.name = s;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String s) {
        this.id = s;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String s) {
        this.group = s;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String s) {
        this.email = s;
    }
    /**
     * Constructor 1
     */

    public Student() {
        // TODO:
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }
    /**
     * Constructor 2
     * @param name
     * @param id
     * @param email
     */

    public Student(String name, String id, String email) {
        // TODO:
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }
    /**
     * Constructor 3
     * @param s
     */

    public Student(Student s) {
        // TODO:
        this.name = s.name;
        this.id = s.id;
        this.email = s.email;
        this.group = s.group;
    }

    public String getInfo() {
        // TODO:
        return this.name + " - " + this.id + " - " + this.group + " - " + this.email;
    }
}
