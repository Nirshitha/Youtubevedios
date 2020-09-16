package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {
RecyclerView vedio_recyclerView;
List<YoutubevideoPojo> youtubeVideos = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vedio_recyclerView=findViewById(R.id.vedio_recyclerView);
        vedio_recyclerView.setHasFixedSize(true);
        vedio_recyclerView.setLayoutManager( new LinearLayoutManager(this));
        youtubeVideos.add( new YoutubevideoPojo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/eWEF1Zrmdow\" frameborder=\"0\" allowfullscreen></iframe>","Princes Childrens") );
        youtubeVideos.add( new YoutubevideoPojo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/KyJ71G2UxTQ\" frameborder=\"0\" allowfullscreen></iframe>","Funny Faces") );
        youtubeVideos.add( new YoutubevideoPojo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/y8Rr39jKFKU\" frameborder=\"0\" allowfullscreen></iframe>","The Emoji Movie") );
        youtubeVideos.add( new YoutubevideoPojo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/8Hg1tqIwIfI\" frameborder=\"0\" allowfullscreen></iframe>","Funny Peppa Pig") );
        youtubeVideos.add( new YoutubevideoPojo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/uhQ7mh_o_cM\" frameborder=\"0\" allowfullscreen></iframe>","Spong Bob Magic") );
        youtubeVideos.add( new YoutubevideoPojo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/WRVsOCh907o\" frameborder=\"0\" allowfullscreen></iframe>","Bath Song Children") );
        youtubeVideos.add( new YoutubevideoPojo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/zd8Rkq2hTO8\" frameborder=\"0\" allowfullscreen></iframe>","The Boo Boo Song") );
        youtubeVideos.add( new YoutubevideoPojo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/zw_CgYQtr2U\" frameborder=\"0\" allowfullscreen></iframe>","Home With Boon") );
        youtubeVideos.add( new YoutubevideoPojo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/TltM1ljRcVU\" frameborder=\"0\" allowfullscreen></iframe>","Tom & Jerry") );
        youtubeVideos.add( new YoutubevideoPojo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/fHqjNHxmB7c\" frameborder=\"0\" allowfullscreen></iframe>","Chu Chu Tv") );
        VedioplayerAdapter videoAdapter = new VedioplayerAdapter(youtubeVideos);
        vedio_recyclerView.setAdapter(videoAdapter);



    }
}