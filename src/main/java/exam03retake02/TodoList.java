package exam03retake02;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TodoList {

    private List<Todo> todos = new ArrayList<>();

    public int getNumberOfItemsLeft() {
//        int count = 0;
//        for (Todo todo : todos) {
//            if (todo.getState() == State.NON_COMPLETED){
//                count++;
//        }
//        }
//        return count;
        return (int) todos.stream().filter(t -> t.getState() == State.NON_COMPLETED).count();
    }

    public List<Todo> getTodo() {
        return new ArrayList<>(todos);
    }

    public void addTodo(Todo todo) {
        todos.add(todo);
    }

    public List<String> getMostImportantTodosText() {
        OptionalInt maxPriority = todos.stream().mapToInt(Todo::getPriority).min();
        if (maxPriority.isEmpty()) {
            return List.of();
        } else {
            return todos.stream()
                    .filter(t -> t.getPriority() == maxPriority.getAsInt())
                    .map(Todo::getText)
                    .collect(Collectors.toList());
        }
    }

    public void deleteCompleted() {
        todos.removeIf(t -> t.getState() == State.COMPLETED);
    }

    public List<Todo> getTodos() {
        return todos;
    }
}
