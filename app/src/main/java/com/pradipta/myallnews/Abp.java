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

public class Abp extends AppCompatActivity {
    private WebView webView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_abp);

        webView2 = (WebView) findViewById(R.id.webView2);

        WebSettings webSettings = webView2.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView2.setWebViewClient(new WebViewClient());

        webView2.loadUrl("https://bengali.abplive.com/");

    }
}