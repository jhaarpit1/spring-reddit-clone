package com.example.socialmediaclone.exceptions;

public class SpringSocialMediaException extends RuntimeException {
    public SpringSocialMediaException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }
    public SpringSocialMediaException(String exMessage) {
        super(exMessage);

    }
}
