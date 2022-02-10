public class InstructorManager extends UserManager {
    @Override
    public void view(User user) {
        System.out.println(user.getFullName() + " kullanıcısını görüntülüyorsunuz bilgileri: \n " + user.getEmail() + "\n"
                + user.getPassWord() + "\n" + user.getId());
    }

    @Override
    public void add(User user) {
        System.out.println("Eğitmen " + user.getFullName() + " başarı ile eklendi.");
    }

    public void delete(User user) {
        System.out.println(user.getFullName() + " kullanıcısı başarı ile silindi.");
    }

    public void deleteMultiple(User[] users) {
        for (User user : users) {
            delete(user); // çoklu silme
        }


    }
}
