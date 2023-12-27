package com.example.allproject;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class embed2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_embed2);

        // Assuming you have a WebView in your layout with the id 'webView'
        WebView webView = findViewById(R.id.webView);

        // Enable JavaScript (required for the YouTube player)
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Load the YouTube video using the YouTube embed URL
        String videoId = "YOUR_YOUTUBE_VIDEO_ID";
        String youtubeUrl = "https://www.youtube.com/watch?v=zSWdZVtXT7E" + videoId;
        String html = "<html><body><iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/zSWdZVtXT7E?si=TredCf8dp1UZWk3y\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe></body></html>";

        webView.loadData(html, "text/html", "utf-8");

        // Ensure that links open in the WebView, not in an external browser
        webView.setWebViewClient(new WebViewClient());
    }
}
