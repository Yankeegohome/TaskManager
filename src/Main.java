public class Main {
    public static void main(String[] args) {

        Epic task1 = new Epic();
        task1.setNameOfTask("Убраться");
        task1.setStatus("NEW");
        task1.newEpic();
        System.out.println(task1.toString());

    }
}

