package oop.hw;

public final class Student extends Person {
  private String department;
  private String studentId;
  private int grade;

  ////////////////////////
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getStudentId() {
    return studentId;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  ////////////////////////////////////////////////
  public Student() {
    super();
  }

  @Override
  public String run() {
    return "Student can run";
  }

  public void attendClass() {

  }

  public final void joinClub() {

  }
}
