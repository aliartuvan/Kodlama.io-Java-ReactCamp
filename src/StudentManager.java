public class StudentManager extends  UserManager{

    public void addLesson(Student user, String lesson) {
        System.out.println("Merhaba " +user.getFullName()+"! " + lesson + " kampına katıldınız. ");
    }

    public void deleteLesson(Student user) {
        System.out.println("Hoşçakal " +user.getFullName()+"! "  + " kampından ayrıldınız. ");
    }

}
