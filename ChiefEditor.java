public class ChiefEditor extends NewsWorker implements EditNewsInterface {
    public ChiefEditor(String name, String position) {
        super(name, position);
    }

    @Override
    public News editNews(News news) {
        news.setContent(news.getContent() + "\nEdited by Chief Editor");
        return news;
    }
}
