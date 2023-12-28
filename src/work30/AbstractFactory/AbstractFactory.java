package work30.AbstractFactory;

public interface AbstractFactory {
    Teacher createTeacher();
    Language createLanguage();
    LessonsProgram createLessonsProgram();
}
