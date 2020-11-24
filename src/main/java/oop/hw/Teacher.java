package oop.hw;

public class Teacher extends Person {
  private String department;
  private String teacherId;

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getTeacherId() {
    return teacherId;
  }

  public void setTeacherId(String teacherId) {
    this.teacherId = teacherId;
  }

  public Teacher() {
    super();
    // TODO Auto-generated constructor stub
  }

  @Override
  public String run() {
    return "Teacher can run";
  }

  public void doResearch() {
  }

  public void teachCourse() {
  }
}
