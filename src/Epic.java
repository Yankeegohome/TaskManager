import java.util.Objects;

public class Epic extends Sticker {
    Integer epicId = 1;
    Sticker epicTask;

    String nameOfTask;
    String status;

    @Override
    public String toString() {
        return "Epic{" +
                "epicId=" + epicId +
                ", nameOfTask='" + nameOfTask + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public void setNameOfTask(String nameOfTask) {
        this.nameOfTask = nameOfTask;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void newEpic () {
        epicTask = new Sticker();
        epicTask.addTaskToList(epicId, nameOfTask, status);
        epicId++;

    }

}
