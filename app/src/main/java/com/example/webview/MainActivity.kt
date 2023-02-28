package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webViewSetup()
    }

    private fun webViewSetup(){
        var wb_webView = findViewById<WebView>(R.id.wb_webView)
        wb_webView.webViewClient = WebViewClient()

        wb_webView.apply{
            loadUrl("https://jrivera63.mccdgm.net/websites/midterm-project/index.html")
            settings.javaScriptEnabled = true

        }
    }

    override fun onBackPressed() {
        var wb_webView = findViewById<WebView>(R.id.wb_webView)
        if (wb_webView.canGoBack()) wb_webView.goBack() else super.onBackPressed()
    }
}