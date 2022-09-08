package com.cydeo.solid_principles_practice.liskovSubstitution;

public class WhatsApp extends SocialMedia{


    @Override
    public void chatWithFriend() {

    }

    //WhatsApp does not support this method, that s why it is unnecessary code
    @Override
    public void publishPost(Object post) {
        //not applicable
    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupVideoCall(String... users) {

    }
}
