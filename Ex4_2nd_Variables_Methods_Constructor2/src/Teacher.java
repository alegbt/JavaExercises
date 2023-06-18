public class Teacher {


    public String TeacherName;

    public Teacher(String teacherName){
        TeacherName=teacherName;
        System.out.println("teacher "+teacherName+ " created");
    }



    public int assignGrade(Student alum,int finalGrade){
        System.out.println("the student "+alum.name+ " final grade is: "+finalGrade);
        return alum.grade = finalGrade;
    }

}
