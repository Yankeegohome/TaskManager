import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Sticker {

    final String firstStatus = "NEW";
    final String secondStatus = "IN_PROGRESS";
    final String thirdStatus = "DONE";
    HashMap<Integer, List<String>> tasks = new HashMap<>();

    public Sticker() {
    }

    public HashMap<Integer, List<String>> getTasks() {
        return tasks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sticker sticker = (Sticker) o;
        return Objects.equals(tasks, sticker.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tasks);
    }

    public synchronized void  addTaskToList(Integer taskId, String nameOfTask, String status) {
        List<String> itemList = tasks.get(taskId);
        if (itemList == null) {
            itemList = new ArrayList<>();
            itemList.add(nameOfTask);
            itemList.add(status);
            tasks.put(taskId, itemList);
        } else {
            String oldStatus = itemList.get(1);
            if (!itemList.contains(status) && itemList.contains(nameOfTask)) {
                itemList.remove(oldStatus);
                itemList.add(status);
            } else {
                System.out.println("По данному айди уже есть задача " + itemList.get(0));
            }
        }
    }
}
