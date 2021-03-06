package lk.ijs.studentregistration.dto;

import java.time.LocalDate;

public class EducationDTO  implements SuperDTO {
    private String Qualification;
    private String inistution;
    private LocalDate isuseDate;
    private String specification;
    private String description;
    private String studentID;

    public EducationDTO()  {
    }

    public EducationDTO(String qualification, String inistution, LocalDate isuseDate, String specification, String description) {
        Qualification = qualification;
        this.inistution = inistution;
        this.isuseDate = isuseDate;
        this.specification = specification;
        this.description = description;
    }

    public EducationDTO(String qualification, String inistution, LocalDate isuseDate, String specification, String description, String studentID) {
        Qualification = qualification;
        this.inistution = inistution;
        this.isuseDate = isuseDate;
        this.specification = specification;
        this.description = description;
        this.studentID = studentID;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }

    public String getInistution() {
        return inistution;
    }

    public void setInistution(String inistution) {
        this.inistution = inistution;
    }

    public LocalDate getIsuseDate() {
        return isuseDate;
    }

    public void setIsuseDate(LocalDate isuseDate) {
        this.isuseDate = isuseDate;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "EducationTM{" +
                "Qualification='" + Qualification + '\'' +
                ", inistution='" + inistution + '\'' +
                ", isuseDate=" + isuseDate +
                ", specification='" + specification + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}
