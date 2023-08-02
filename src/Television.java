public class Television implements Observer{
    @Override
    public void update(String article) {
        System.out.println("Television reporting the latest article: " + article);
    }
}
