public class Main {
    public static void main(String[] args) {
        Journalist journalist = new Journalist();
        journalist.addObservers(new Television());
        journalist.addObservers(new Internet());
        journalist.addObservers(new Radio());

        journalist.writeArticle("Latest news on Observer pattern in Java.");
    }
}