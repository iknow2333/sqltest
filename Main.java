public class Main {
    public static void main(String[] args) {
        // 创建新闻对象
        News news = new News("Breaking News", "A major event has occurred.");

        // 创建新闻工作者对象
        Journalist journalist = new Journalist("Alice", "Journalist");
        Editor editor = new Editor("Bob", "Editor");
        ChiefEditor chiefEditor = new ChiefEditor("Carol", "Chief Editor");

        // 新闻经过不同角色的编辑
        news = journalist.editNews(news);
        news = editor.editNews(news);
        news = chiefEditor.editNews(news);

        // 显示新闻工作者信息
        journalist.displayInfo();
        editor.displayInfo();
        chiefEditor.displayInfo();

        // 显示最终编辑后的新闻内容
        news.displayNews();
    }
}
