package com.webview.demo;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebSettings;

public class MainActivity extends AppCompatActivity {
    private Remote remoteUi;
    private String base;
    private WebView webView;
    private FloatingActionButton forwardButton;
    private FloatingActionButton backButton;
    private FloatingActionButton reloadButton;
    private ValueCallBack<Uri[]> fileUploadCallBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        base = "https://m.facebook.com/";
        remoteUi = (Remote) findViewById(R.id.main_web_view);
        remoteUi.setWebViewClient(new RemoteClient(base));
        WebSettings uiSettings = (WebSettings) remoteUi.getSettings();
        uiSettings.setJavaScriptEnabled(true);
        remoteUi.loadUrl(base);
        forwardButton=findViewById(R.id.forwardButton);
        
        
    }
}
