package integradora.ingenieria.yacalu.yacalu1;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import integradora.ingenieria.yacalu.yacalu1.R;

public class FacebookActivity extends AppCompatActivity {

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);

        // Definimos el webView
        WebView browser = (WebView) findViewById(R.id.wv_web_view);

        browser.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        WebView.setWebContentsDebuggingEnabled(false);
        // Cargamos la web
        browser.loadUrl("https://www.facebook.com/Yacalu-App-258542968220566/");

    }
}