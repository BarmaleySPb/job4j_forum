package forum.service;

import forum.repository.PostMemRepository;
import org.springframework.stereotype.Service;
import forum.model.Post;

import java.util.Collection;

@Service
public class PostService {
    private final PostMemRepository posts;

    public PostService(PostMemRepository posts) {
        this.posts = posts;
    }

    public Collection<Post> getAll() {
        return posts.getAllPosts();
    }

    public void add(Post post) {
        posts.add(post);
    }

    public Post get(int id) {
        return posts.get(id);
    }

    public void update(Post post) {
        posts.update(post);
    }

    public void delete(int id) {
        posts.delete(id);
    }
}