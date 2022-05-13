package forum.repository;

import org.springframework.data.repository.CrudRepository;
import forum.model.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
}
