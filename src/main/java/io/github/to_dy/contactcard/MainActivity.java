package io.github.to_dy.contactcard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void call(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:2347085301058"));
        startActivity(intent);
    }

    public void email(View view){
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto","yussufftolu@gmail.com", null));
        startActivity(Intent.createChooser(intent, "Choose an Email client :"));
    }

    private void link (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void linkedin(View view) {
        link("https://www.linkedin.com/in/toluyussuff");
    }

    public void facebook(View view) {
        link("https://www.facebook.com/todywa");
    }

    public void twitter(View view) {
        link("https://www.twitter.com/todywa");
    }

    public void github(View view) {
        link("https://www.github.com/to-dy");
    }

    public void slack(View view) {
        link("https://hnginterns.slack.com/team/tody");
    }

    public void instagram(View view) {
        link("https://www.instagram.com/todywa");
    }

}
