package com.example.myapplication;

public class YoutubevideoPojo {
    String youtubelink,vedioTitle;
    public YoutubevideoPojo() {

    }
    public YoutubevideoPojo(String youtubelink,String vedioTitle) {
        this.youtubelink=youtubelink;
        this.vedioTitle=vedioTitle;
    }

    public String getVedioTitle() {
        return vedioTitle;
    }

    public void setVedioTitle(String vedioTitle) {
        this.vedioTitle = vedioTitle;
    }

    public String getYoutubelink() {
        return youtubelink;
    }

    public void setYoutubelink(String youtubelink) {
        this.youtubelink = youtubelink;
    }
}
