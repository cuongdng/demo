public class StudentManagement {
    // TODO: khai bao thuoc tinh students la array chua cac doi tuong thuoc lop Student (max. 100)
    Student[] students = new Student[100];
    int index = 0;

    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        if (s1.getGroup().equals(s2.getGroup())) {
            return true;
        } else {
            return false;
        }
    }

    public void addStudent(Student newStudent) {
        // TODO:
        students[index] = newStudent;
        index++;
    }

    public String studentsByGroup() {
        // TODO:
        int cnt = 0;
        String tmp = "";
        String[] groupArr = new String[50];
        int numberOfGroup = 0;
        groupArr[numberOfGroup] = students[0].getGroup();
        for (int j = 1; j < index; j++) {
            for (int k = 0; k < numberOfGroup + 1; k++) {
                if (students[j].getGroup().equals(groupArr[k])) {
                    break;
                }
                else {
                    numberOfGroup++;
                    groupArr[numberOfGroup] = students[j].getGroup();
                }
            }
        }
        int x = 0;
        while (cnt < index) {
            tmp += "\n" + groupArr[x];
            for (int i = 0; i < index; i++) {
                if (students[i].getGroup().equals(groupArr[x])) {
                    tmp += "\n" + students[i].getInfo();
                    cnt++;
                } else {
                    continue;
                }
            }

            x++;
        }
        return tmp;
    }

    public void removeStudent(String id) {
        // TODO:
        for (int i = 0; i < index; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < index-1; j++) {
                    students[j] = students[j + 1];
                }
            }
        }
        index--;
    }

    public static void main(String[] args){
        StudentManagement lStudents = new StudentManagement();
        Student std1 = new Student("Nguyen Van A", "17020001", "17020001@vnu.edu.vn");
        std1.setGroup("K62CC");
        Student std2 = new Student("Nguyen Van B", "17020002", "17020002@vnu.edu.vn");
        std2.setGroup("K62CC");
        Student std3 = new Student("Nguyen Van C", "17020003", "17020003@vnu.edu.vn");
        std3.setGroup("K62CB");
        Student std4 = new Student("Nguyen Van D", "17020004", "17020004@vnu.edu.vn");
        std4.setGroup("K62CB"); 

        lStudents.addStudent(std1);
        lStudents.addStudent(std2);
        lStudents.addStudent(std3);
        lStudents.addStudent(std4);        

        System.out.println(lStudents.studentsByGroup());
    }
}
