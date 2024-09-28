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

public class Bortoman extends AppCompatActivity {
    private WebView webView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bortoman);

        webView3 = (WebView) findViewById(R.id.webView3);

        WebSettings webSettings = webView3.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView3.setWebViewClient(new WebViewClient());

        webView3.loadUrl("https://bartamanpatrika.com/home");

    }
}