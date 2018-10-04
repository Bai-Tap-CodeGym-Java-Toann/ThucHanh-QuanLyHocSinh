
public class Runner {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.displayAll();

        Student andy = new Student("toan", 18);
        studentManager.add(andy);
        System.out.println("added " + andy.getInfomation());
        studentManager.displayAll();

        Student booby = new Student("dz", 20);
        studentManager.add(booby);
        System.out.println("added " + booby.getInfomation());
        studentManager.displayAll();

        Student samy = new Student("tu", 29);
        studentManager.add(samy);
        System.out.println("added " + samy.getInfomation());
        studentManager.displayAll();

        studentManager.find("toan");
        studentManager.find("dz");
        studentManager.find("ohMan");
    }
}
