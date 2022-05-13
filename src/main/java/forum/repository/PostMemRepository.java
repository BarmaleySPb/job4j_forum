package forum.repository;

import forum.model.Post;
import org.springframework.stereotype.Repository;

import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Repository
 */

public class PostMemRepository {

    private final Map<Integer, Post> posts = new HashMap<>();

    private final AtomicInteger id = new AtomicInteger(1);

    public PostMemRepository() {
        Post post = Post.of("Продаю машину ладу 01.");
        post.setId(id.get());
        post.setCreated(Calendar.getInstance());
        post.setDescription("asd");
        posts.putIfAbsent(id.get(), post);
    }

    public Collection<Post> getAllPosts() {
        return posts.values();
    }

    public void add(Post post) {
        post.setId(id.incrementAndGet());
        posts.putIfAbsent(id.get(), post);
    }

    public Post get(int id) {
        return posts.get(id);
    }

    public void update(Post post) {
  /*      posts.replace(post.getId(), post); */
    }

    public void delete(int id) {
        posts.remove(id);
    }
}