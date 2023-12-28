package work30.AbstractFactory;

public class JavaCourseFactory implements AbstractFactory{
    @Override
    public Teacher createTeacher() {
        return new JavaDev();
    }

    @Override
    public Language createLanguage() {
        return new Java();
    }

    @Override
    public LessonsProgram createLessonsProgram() {
        return new JavaProgram();
    }
}
