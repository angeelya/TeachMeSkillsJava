package work30.AbstractFactory;

public class CSharpCourseFactory implements AbstractFactory{
    @Override
    public Teacher createTeacher() {
        return new CSharpDev();
    }

    @Override
    public Language createLanguage() {
        return new CSharp();
    }

    @Override
    public LessonsProgram createLessonsProgram() {
        return new CSharpProgram();
    }
}
