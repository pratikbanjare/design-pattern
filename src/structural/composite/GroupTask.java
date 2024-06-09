package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class GroupTask implements Task {

    private String name;
    private List<Task> tasks;

    public GroupTask(String name) {
        this.tasks = new ArrayList<>();
        this.name = name;
    }

    public void add(Task task){
        this.tasks.add(task);
    }


    public void remove(Task task){
        this.tasks.remove(task);
    }


    @Override
    public void showStatus() {
        tasks.forEach(Task::showStatus);
    }
}
