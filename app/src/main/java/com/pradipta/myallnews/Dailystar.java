package com.pradipta.myallnews;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Dailystar extends AppCompatActivity {
    private WebView webView16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dailystar);

        webView16 = (WebView) findViewById(R.id.webView16);

        WebSettings webSettings = webView16.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView16.setWebViewClient(new WebViewClient());

        webView16.loadUrl("https://www.thedailystar.net/");

    }
}