import java.util.ArrayList;
import java.util.List;

public class Journalist implements Subject {


    private final List<Observer> observers = new ArrayList<>();
    private String article;

    @Override
    public void addObservers(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObservers(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(article);
        }
    }

    public void writeArticle(String article){
        this.article = article;
        notifyObservers();
    }
}
