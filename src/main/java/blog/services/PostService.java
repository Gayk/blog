package blog.services;

import blog.models.Post;
import blog.models.User;
import javafx.geometry.Pos;

import java.util.List;

/**
 * Created by monik on 23.01.2018.
 */
public interface PostService {
    List<Post> findAll();
    List<Post> findLatest5();
    Post findById(Long id);
    Post create (Post post);
    Post edit(Post post);
    void deleteById(Long id);

}
