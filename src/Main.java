public class Main {
    public static void main(String[] args) {
        Journalist journalist = new Journalist();
        journalist.addObservers(new Television());

        journalist.writeArticle("Latest news on Observer pattern in Java.");
    }
}