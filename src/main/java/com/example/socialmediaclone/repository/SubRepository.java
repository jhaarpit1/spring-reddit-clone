package com.example.socialmediaclone.repository;

import com.example.socialmediaclone.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

    @Repository
    public interface SubRepository extends JpaRepository<Subreddit, Long> {

        Optional<Subreddit> findByName(String subredditName);
    }

