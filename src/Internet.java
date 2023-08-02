public class Internet implements Observer{
    @Override
    public void update(String article) {
        System.out.println("Internet reporting the latest article: " + article);
    }
}
