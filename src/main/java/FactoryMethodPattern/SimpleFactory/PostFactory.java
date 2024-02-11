package FactoryMethodPattern.SimpleFactory;

/**
 * This class acts as a simple factory for creation of 
 * different posts on web site.
 *
 */
public class PostFactory {

    public static Post cretePost(String type) {
        switch (type) {
            case "blog" :
                return new BlogPost();
            case "new" :
                return new NewsPost();
            case "product":
                return new ProductPost();
            default:
                throw new IllegalArgumentException("Post Type is Unknown");
        }
    }

}
