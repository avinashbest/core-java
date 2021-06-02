package com.avinashbest.MyTube;

public class VideoProcessor {
    private VideoEncoder encoder;
    private NotificationService emailService;
    private VideoDatabase database;

    /*Constructor Injection*/
    public VideoProcessor(VideoEncoder encoder, NotificationService emailService, VideoDatabase database) {
        this.encoder = encoder;
        this.emailService = emailService;
        this.database = database;
    }

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        emailService.sendEmail(video.getUser());
    }
}

