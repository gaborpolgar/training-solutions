package intromethods;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<Todo> todos = new ArrayList<>();

    public void addTodo(String caption) {
        Todo todo = new Todo(caption);
        todos.add(todo);
    }

    public void finishTodos(String caption){
        for (Todo todo: todos) {
         if (todo.getCaption().equals(caption)){
             todo.finish();
         }
        }
    }

    public void finishAllTodos(List<String> todosToFinish){
            for (String todoToFin: todosToFinish) {
              finishTodos(todoToFin);
            }
        }

    public List<String> todosToFinish(){
        List<String> notYetFinished = new ArrayList<>();
        for (Todo inspectTodo: todos) {
            if (!inspectTodo.isFinished()){
                notYetFinished.add(inspectTodo.getCaption());
            };
        }
        return notYetFinished;
    }

    public int numberOfFinishedTodos(){
        int numberOfFinished= 0;
        for (Todo todo: todos) {
            if(todo.isFinished()){
                numberOfFinished++;
            }
        }
        return numberOfFinished;
    }

    @Override
    public String toString() {
        return todos.toString();
    }
}
