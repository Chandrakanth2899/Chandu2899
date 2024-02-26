package learning.Day23;

public class StudentInfo {

    String name;
    int id;
    int age;
    long phone;

    StudentInfo(int id, String name, int age, long phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String toString() {
        return "id: " + id + " name: " + name + " age: " + age + " phone: " + phone;
    }

    public static void main(String[] args) {
        // Create an instance of StudentInfo
        StudentInfo student = new StudentInfo(1, "John", 20, 1234567890L);

        // Call the toString method and print the result
        System.out.println(student.toString());
    }
}
