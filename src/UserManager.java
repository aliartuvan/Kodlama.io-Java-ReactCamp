public class UserManager {

    public void view(User user) {
        System.out.println(user.getFullName() + " kullanıcısını görüntülüyorsunuz");
    }

    public void add(User user) {
        System.out.println("Kullanıcı " + user.getFullName() + " başarı ile eklendi.");
    }



    public void addMultiple(User[] users) {
        for (User user : users) {
            add(user); // çoklu ekleme
        }
    }






    public void update(User user) {
        System.out.println(user.getFullName() + " kullanıcısı başarı ile güncellendi.");

    }
}
