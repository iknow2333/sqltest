public class Editor extends NewsWorker implements EditNewsInterface {
    public Editor(String name, String position) {
        super(name, position);
    }

    @Override
    public News editNews(News news) {
        news.setContent(news.getContent() + "\nEdited by Editor");
        return news;
    }
}
