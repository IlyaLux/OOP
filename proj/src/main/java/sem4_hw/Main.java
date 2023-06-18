package sem4_hw;


import sem4_hw.controller.StudentController;
import sem4_hw.repository.StudentRepository;
import sem4_hw.service.StudentService;
import sem4_hw.view.SortType;
import sem4_hw.view.StudentView;

import sem4_hw.controller.TeacherController;
import sem4_hw.repository.TeacherRepository;
import sem4_hw.service.TeacherService;
import sem4_hw.view.TeacherView;

public class Main {
    public static void main(String[] args) {
        StudentView view = getStudentView();
        TeacherView teacherView = getTeacherView();

        view.create("Иван Сидоров", 19, "12345");
        view.create("Петр Иванов", 18, "55893");
        view.create("Сидор Петров", 20, "18544");
        view.sendOnConsole(SortType.NONE);
        view.create("Александр Вовк", 17, "39984");
        view.create("Дмитрий Дубов", 18, "02158");
//        view.sendOnConsole(SortType.NONE);
//        view.sendOnConsole(SortType.FIRSTNAME);
//        view.sendOnConsole(SortType.LASTNAME);
        view.sendOnConsole(SortType.AGE);


        teacherView.create("Анастас Карипиди", 32, "96354");
        teacherView.create("Никита Большаков", 32, "30589");
        teacherView.create("Илья Люкс", 31, "98726");
        teacherView.create("Дмитрий Сычев", 37, "03689");
        teacherView.create("Виталий Данилин", 40, "97524");
        teacherView.create("Сергей Есенин", 33, "96884");
        teacherView.sendOnConsole(SortType.NONE);
        teacherView.sendOnConsole(SortType.LASTNAME);
//        teacherView.sendOnConsole(SortType.AGE);
//        teacherView.removeUser("Илья Люкс");
//        teacherView.sendOnConsole(SortType.NONE);
//        teacherView.edit("Илья Люкс", 32, "11111");
//        teacherView.sendOnConsole(SortType.ID);

    }

    private static StudentView getStudentView() {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
        return new StudentView(controller);
    }

    private static TeacherView getTeacherView() {
        TeacherRepository repository = new TeacherRepository();
        TeacherService service = new TeacherService(repository);
        TeacherController controller = new TeacherController(service);
        return new TeacherView(controller);
    }
}
