public class Student extends User {
    private String progressStatus;

    public Student(int id, String fullName, String email, String passWord, String progressStatus) {
        super(id, fullName, email, passWord);
        this.progressStatus = progressStatus;
    }


    public String getProgressStatus() {
        return progressStatus;
    }

    public void setProgressStatus(String progressStatus) {
        this.progressStatus = progressStatus;
    }
}
