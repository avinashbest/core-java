package com.avinashbest.MyTube;

public class Main {

    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("avinashbest3@gmail.com"));

        var processor = new VideoProcessor(
                new XVideoEncoder(),
                new NotificationService(),
                new SqlVideoDatabase()
        );
        processor.process(video);
    }
}
