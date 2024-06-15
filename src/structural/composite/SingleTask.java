package structural.composite;

import java.time.LocalDateTime;

public class SingleTask implements Task {

    private String name;
    private LocalDateTime startdate;
    private LocalDateTime dueDate;
    private LocalDateTime endDate;

    public SingleTask(String name, LocalDateTime dueDate) {
        this.name = name;
        this.dueDate = dueDate;
    }

    public void startPerformingTask() {
        this.setStartdate(LocalDateTime.now());
        System.out.println("Starting task at - " + this.getStartdate().toString());
    }

    
    public void finishTask() {
        this.setEndDate(LocalDateTime.now());
        System.out.println("Finished task at - " + this.getEndDate().toString());
    }

    @Override
    public void showStatus() {
        System.out.println("Status of task - "+ this.getName());
        System.out.println("\tDue Date - " + this.getDueDate());
        System.out.println("\tStart Date - "+this.getStartdate());
        System.out.println("\tEnd Date - "+this.getEndDate());

    }

    public LocalDateTime getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDateTime startdate) {
        this.startdate = startdate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }
}
