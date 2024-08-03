import java.time.*;

public class Employee {

    private Integer tabNumber;
    private String phoneNumber;
    private String name;
    private LocalDate enrollmentDate;
    private Float experience=0.0f; //years

    public Employee(Integer tabNumber, String phoneNumber, String name, LocalDate enrollmentDate ){

        this.tabNumber=tabNumber;
        this.phoneNumber=phoneNumber;
        this.name=name;
        this.enrollmentDate=enrollmentDate;
        this.experience= Float.valueOf(LocalDate.now().getYear() - this.enrollmentDate.getYear() +(LocalDate.now().getDayOfYear() - this.enrollmentDate.getDayOfYear())/365);
    }

    public String getName(){
        return this.name;
    }
    public Integer getTabNumber(){
        return this.tabNumber;
    }
    public float getExperience(){
        return this.experience;
    }
    public String getPhone(){
        return this.phoneNumber;
    }

}
