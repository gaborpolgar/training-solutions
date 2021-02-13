package week15d03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PostFinder {

    private List<Post> posts = new ArrayList<>();

    public PostFinder(List<Post> posts) {
        this.posts = posts;
    }

    public List<Post> findPostsFor(String user) {
        List<Post> result = new ArrayList<>();
        for (Post post : posts) {
            if (isCheckedConditions(user, result, post)) {
                result.add(post);
            }
        }
            return result;
    }

    private boolean isCheckedConditions(String user, List<Post> result, Post post) {
        return isNotBlank(post.getContent()) && isNotBlank(post.getTitle())
                && post.getPublishedAt().isBefore(LocalDate.now()) && user.equals(post.getOwner());
    }

    private boolean isNotBlank(String user) {
        return user != null && !user.isBlank();
    }
}
