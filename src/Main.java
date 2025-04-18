public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student(001, "Nguyen Van A", "A@example.com", 20, 10.0),
                new Student(002, "Bui Van Nong", "ElongMUsk@example.com", 21, 4.75),
                new Student(003, "Pham Trung Hiu", "Hiuthu2@example.com", 19, 7.25),
                new Student(004, "Nguyen Hoang Tuan", "Tuandeptrai@example.com", 22, 8.0),
                new Student(005, "Vu Thi Kieu Anh", "KieuAnhXinh@example.com", 20, 5.25)
        };

        int totalAge = 0;
        for (Student s : students) {
            totalAge += s.age;
        }
        double averageAge = (double) totalAge / students.length;
        System.out.printf("Average age: %.2f\n", averageAge);

        int passedCount = 0;
        for (Student s : students) {
            if (s.grade > 5) {
                passedCount++;
            }
        }
        System.out.println("Number of students passed: " + passedCount);

        for (Student s : students) {
            if (s.fullName.equalsIgnoreCase("Nguyen Van A")) {
                System.out.println("Email of Nguyen Van A: " + s.email);
                break;
            }
        }
    }
}