public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student(68, "siwat", 3.43);
        Student s2 = new Student(68, "ratipat", 4.00);
        Student s3 = new Student(68, "siwat", 2.33);
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        IO.println(s1.getInfo());
    }
}
