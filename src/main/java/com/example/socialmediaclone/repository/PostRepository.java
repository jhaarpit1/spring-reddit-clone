package com.example.socialmediaclone.repository;
import com.example.socialmediaclone.model.Post;
import com.example.socialmediaclone.model.Subreddit;
import com.example.socialmediaclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

    @Repository
    public interface PostRepository extends JpaRepository<Post, Long> {
        List<Post> findAllBySubreddit(Subreddit subreddit);

        List<Post> findByUser(User user);
    }

