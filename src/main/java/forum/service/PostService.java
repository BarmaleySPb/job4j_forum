package forum.service;

import forum.repository.PostRepository;
import org.springframework.stereotype.Service;
import forum.model.Post;

import java.util.Calendar;

@Service
public class PostService {
    private final PostRepository posts;

    public PostService(PostRepository posts) {
        this.posts = posts;
    }

    public Iterable<Post> getAll() {
        return posts.findAll();
    }

    public void add(Post post) {
        post.setCreated(Calendar.getInstance());
        posts.save(post);
    }

    public Post get(Long id) {
        return posts.findById(id).orElse(null);
    }

    public void delete(Post post) {
        posts.delete(post);
    }
}