public class Radio implements Observer{
    @Override
    public void update(String article) {
        System.out.println("Radio reporting the latest article: " + article);
    }
}
