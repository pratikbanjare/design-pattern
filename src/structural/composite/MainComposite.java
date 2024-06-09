package structural.composite;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MainComposite {

    public static  void main (String[] args) throws InterruptedException {

        SingleTask laundary = new SingleTask("laundary", LocalDateTime.parse("2024-06-15T00:00:00"));
        laundary.startPerformingTask();
        System.out.println();
        laundary.showStatus();

        Thread.sleep(5000);
        System.out.println();
        laundary.finishTask();
        System.out.println();
        laundary.showStatus();

        System.out.println("----------------------------------X------------------------------------");
        System.out.println();
        GroupTask desginProject = new GroupTask("design Project");
        SingleTask adaptor = new SingleTask("adaptor",LocalDateTime.now().plusDays(1L));
        SingleTask bridge = new SingleTask("bridge",LocalDateTime.now().plusDays(2L));
        SingleTask composite = new SingleTask("composite",LocalDateTime.now().plusDays(3L));
        SingleTask decorator = new SingleTask("decorator",LocalDateTime.now().plusDays(4L));

        desginProject.add(adaptor);
        desginProject.add(bridge);
        desginProject.add(composite);
        desginProject.add(decorator);

        desginProject.showStatus();
        System.out.println();
        adaptor.startPerformingTask();
        Thread.sleep(5000);
        adaptor.finishTask();
        System.out.println();
        desginProject.showStatus();
        System.out.println("----------------------------------X------------------------------------");
        GroupTask javaProjects = new GroupTask("Java Project");
        javaProjects.add(desginProject);
        javaProjects.showStatus();


    }
}
