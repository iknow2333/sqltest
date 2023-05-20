public class Journalist extends NewsWorker implements EditNewsInterface {
    public Journalist(String name, String position) {
        super(name, position);
    }

    @Override
    public News editNews(News news) {
        news.setContent(news.getContent() + "\nEdited by Journalist");
        return news;
    }
}
