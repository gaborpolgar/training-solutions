package ioreader.states;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StateRegister {

    private List<State> states = new ArrayList<>();

    public List<State> getStates() {
        return new ArrayList<>(states);
    }


    public void readStatesFromFile(String fileName){

        Path file = Path.of("src\\main\\resources\\" + fileName);
        String line;
        try (BufferedReader reader = Files.newBufferedReader(file)){
            while ((line = reader.readLine()) != null){
               line = reader.readLine();
               String [] datas = line.split("-");
               State state = new State(datas[0], datas[1]);
               states.add(state);
            }

        } catch (IOException e) {
           throw new IllegalStateException("Can't read file!", e);
        }

    }

    public String findCapitalByStateName (String stateName){
        for (State state: states) {
            if (stateName.equals(state.getStateName())){
                return state.getCapital();
            }
        }
        throw new IllegalArgumentException("No state with this name!");
    }

}
