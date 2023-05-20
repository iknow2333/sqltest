package javaj.system;

//创建nms系统
public class NmsSystem {
    // 创建com.cuc包
    public static void main(String[] args) {
        // 用户和新闻类的字段给定
        class User {
            String name;
            int age;
            String gender;
            String interest;

            public User(String name, int age, String gender, String interest) {
                this.name = name;
                this.age = age;
                this.gender = gender;
                this.interest = interest;
            }
        }

        class News {
            String title;
            String content;
            String author;
            String category;

            public News(String title, String content, String author, String category) {
                this.title = title;
                this.content = content;
                this.author = author;
                this.category = category;
            }
        }

        // 分别实例化一个作者和阅读者
        User writer = new User("张三", 25, "男", "科技");
        User reader = new User("李四", 18, "女", "娱乐");

        // 作者发布1000条新闻
        News[] newsArray = new News[1000];
        for (int i = 0; i < 1000; i++) {
            newsArray[i] = new News("新闻标题" + (i + 1), "新闻内容" + (i + 1), writer.name,
                    Math.random() > 0.5 ? "科技" : "娱乐"); // 随机生成新闻类别
        }

        // 阅读者根据用户特点获取5条新闻
        int count = 0; // 记录已获取的新闻数
        for (int i = 0; i < 1000 && count < 5; i++) {
            if (newsArray[i].category.equals(reader.interest)) { // 如果新闻类别与阅读者兴趣相同，则输出该新闻
                System.out.println(newsArray[i].title);
                System.out.println(newsArray[i].content);
                System.out.println(newsArray[i].author);
                System.out.println(newsArray[i].category);
                System.out.println();
                count++;
            }
        }
    }
}