package com.example.socialmediaclone.repository;

import com.example.socialmediaclone.model.Post;
import com.example.socialmediaclone.model.User;
import com.example.socialmediaclone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
