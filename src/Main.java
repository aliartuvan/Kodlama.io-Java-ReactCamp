public class Main {
    public static void main(String[] args) {

        String lesson1 = "Java";
        String lesson2 = "C#";
        String lesson3 = "Javascript";


        Student student1 = new Student(1,"Ali Artuvan","aliartuvan44@gmail.com","123","%x");
        Student student2 = new Student(2,"Baran Artuvan","baran@gmail.com","123789","%x");
        Student student3 = new Student(3,"Kemal Atlı","kemaldng@gmail.com","7723","%x");

        Student[] students =  {student1, student2};

        Instructor instructor = new Instructor(1,"Engin Demiroğ","engin@demir.org","....",
                "C#,Java,Js","20");
        StudentManager studentManager = new StudentManager();
        studentManager.addLesson(student1,lesson1);
        studentManager.addLesson(student2,lesson2);
        studentManager.addLesson(student3,lesson3);


        studentManager.deleteLesson(student1);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);
        instructorManager.view(student1); // eğitmen öğrencinin bütün bilgilerini görebilir
        studentManager.view(student2); // ama öğrenci sadece kullanıcı adını görebilir.
        instructorManager.delete(student1);
        // studentManager.delete(instructor); eğitmen sistemden öğrenci silebilir ama öğrenci eğitmeni silemez.






    }
}
