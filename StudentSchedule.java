import java.util.Scanner;

class StudentSchedule {
  private String courseName;
  private int periodNum;
  private String room;
  private String name;
  private int classAmmount;
  private String Schedule = "";

  public StudentSchedule(String student, int classes) {
    name = student;
    classAmmount = classes;
  }

  public String getSchedule() {
    return Schedule;
  }

  public void buildSchedule() {
    for (int i = 0; i < classAmmount; i++) {
      periodinfo();
      courseinfo();
      roominfo();
      Schedule += periodNum + "\t" + courseName + "\t" + room + "\n";
    }
  }

  private int periodinfo() {
    Scanner periodInfo = new Scanner(System.in);
    System.out.println("Enter a period #:");
    periodNum = periodInfo.nextInt();
    return periodNum;
  }

  private String courseinfo() {
    Scanner courseInfo = new Scanner(System.in);
    System.out.println("What is the name of the course for period " + periodNum + "?");
    courseName = courseInfo.nextLine();
    return courseName;
  }

  private String roominfo() {
    Scanner roomInfo = new Scanner(System.in);
    System.out.println("Which room do you have " + courseName + " in?");
    room = roomInfo.nextLine();
    return room;
  }

}
