package tablefactory;

import factory.Factory;
import factory.Link;
import factory.Page;
import factory.Tray;

/**
 * Created by kilo on 2018/8/15.
 */
public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
