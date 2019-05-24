package com.example.backstagetask

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_new.*

class NewActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        web.settings.javaScriptEnabled=true
        web.settings.cacheMode=WebSettings.LOAD_CACHE_ELSE_NETWORK
        web.settings.cacheMode = WebSettings.LOAD_NO_CACHE

        web.webViewClient= object : WebViewClient(){
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        web.loadUrl("http://m-biz.in/")




    }
}
