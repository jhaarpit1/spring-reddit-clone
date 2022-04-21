package com.example.socialmediaclone.repository;

import com.example.socialmediaclone.model.Comment;
import com.example.socialmediaclone.model.Post;
import com.example.socialmediaclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
