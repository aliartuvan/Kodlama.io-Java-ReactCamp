public class Instructor extends User{
    private String programmingLanguage;
    private String yearsOfExperience;



    public Instructor(int id, String fullName, String email, String passWord,
                      String programmingLanguage, String yearsOfExperience) {
        super(id, fullName, email, passWord);
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }


    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(String yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
