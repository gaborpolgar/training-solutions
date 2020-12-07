package intromethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TodoListMain {

    public static void main(String[] args) {
        TodoList list = new TodoList();

        list.addTodo("fogmosás");
        list.addTodo("alvás");
        list.addTodo("átöltözés");
        list.addTodo("esti mese");
        list.addTodo("filmnézés");
        System.out.println(list);
        list.finishTodos("fogmosás");
        System.out.println(list);
        list.finishAllTodos(Arrays.asList("átöltözés", "esti mese"));
        System.out.println(list.todosToFinish());
        System.out.println(list.numberOfFinishedTodos());

    }
}
