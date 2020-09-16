package com.example.myapplication;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class VedioplayerAdapter extends RecyclerView.Adapter<VedioplayerAdapter.ViewHolder> {
    List<YoutubevideoPojo> youtubeVedioslist;

    public VedioplayerAdapter(List<YoutubevideoPojo> youtubeVideos) {
        this.youtubeVedioslist = youtubeVideos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vedioplayer_adapter_listitem, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.videoWeb.loadData(youtubeVedioslist.get(position).getYoutubelink(), "text/html", "utf-8");
        holder.vedio_title_tv.setText(youtubeVedioslist.get(position).getVedioTitle());
    }

    @Override
    public int getItemCount() {
        return youtubeVedioslist.size();
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull List<Object> payloads) {
        super.onBindViewHolder(holder, position, payloads);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        WebView videoWeb;
        TextView vedio_title_tv;


        public ViewHolder(View itemview) {
            super(itemview);
            videoWeb = (itemview).findViewById(R.id.videoWebView);
            vedio_title_tv=(itemview).findViewById(R.id.vedio_title_tv);

            videoWeb.getSettings().setJavaScriptEnabled(true);
            videoWeb.setWebChromeClient(new WebChromeClient() {

            });
        }
    }
}
