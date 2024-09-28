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

public class Eisomoy extends AppCompatActivity {
    private WebView webView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_eisomoy);

        webView4 = (WebView) findViewById(R.id.webView4);

        WebSettings webSettings = webView4.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView4.setWebViewClient(new WebViewClient());

        webView4.loadUrl("https://eisamay.com/bangladesh");

    }
}