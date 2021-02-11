package week15d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Quiz {

    private Map<String, String> questions;

    public static void main(String[] args) {
        Quiz q = new Quiz();
        q.questions = q.readQuizFromFile();
        System.out.println(q.getAllQuestionsByTopic("magyar"));
        System.out.println("---------------");
        System.out.println(q.getRandomQuestionsData(1));
        System.out.println(q.getRandomQuestionsData(2));
        System.out.println(q.getRandomQuestionsData(1));
        System.out.println(q.getRandomQuestionsData(2));
        System.out.println("---------------");
        System.out.println(q.getOrganizedQuestionsByTopic());
        System.out.println(q.getMostPointsOfTopic());

    }

    public Map<String, String> readQuizFromFile(){
        Path file = Path.of("src\\main\\resources\\kerdesek.txt");
        try (BufferedReader reader = Files.newBufferedReader(file)){
            Map<String, String> questionS = new HashMap<>();
            String line;
            String actualQuestion = "";
            while ((line = reader.readLine()) != null){
            if (line.contains("?")){
                questionS.put(line, "");
                actualQuestion = line;
            } else {
                questionS.put(actualQuestion, line);
            }
            }
            return questionS;
        } catch (IOException ioe) {
            throw new IllegalStateException("The file can not read.", ioe);
        }
    }

    public List<String> getAllQuestionsByTopic(String topic){
    List<String> result = new ArrayList<>();
        for (Map.Entry<String, String> question: questions.entrySet()) {
            String [] parts = question.getValue().split(" ");
            if (topic.equals(parts[2])){
                result.add(question.getKey());
            }
        }
        return result;
    }

    public String getRandomQuestionsData(int seed){
        Random rnd = new Random(seed);
        int randomNumber = rnd.nextInt(questions.size());
        int counter = 0;
        for (Map.Entry<String, String> question: questions.entrySet()) {
            if (randomNumber == counter){
                return question.getKey() + "\n" + question.getValue();
            }
            counter++;
        }
        return "The method failed.";
    }

    public Map<String, List<String>> getOrganizedQuestionsByTopic(){
        Map<String, List<String>> results = new HashMap<>();
        for (Map.Entry<String, String> question: questions.entrySet()) {
            String [] parts = question.getValue().split(" ");
            String questionWithDatas = question.getKey() + " " + parts[0] + " " + parts[1];

            results.put(parts[2], results.containsKey(parts[2]) ? new ArrayList<>(results.get(parts[2])): new ArrayList<>(List.of(questionWithDatas)));
            if (!(results.get(parts[2]).contains(questionWithDatas))){
                results.get(parts[2]).add(questionWithDatas);
            }
        }
    return results;
    }

    public String getMostPointsOfTopic(){
        int counter = 0;
        int temp = 0;
        String result = "";
        Map<String, List<String>> topics = getOrganizedQuestionsByTopic();
        for (Map.Entry<String, List<String>> topic: topics.entrySet()) {
            for (String line :topic.getValue()) {
            String [] parts = line.split("\\?");
            String [] numbers = parts[1].trim().split(" ");
            counter += Integer.parseInt(numbers[1]);
            }
            if (counter > temp ){
                temp = counter;
                result = topic.getKey();
            }
            counter = 0;
        }
        return result;
    }



}
