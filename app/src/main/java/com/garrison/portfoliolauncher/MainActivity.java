package com.garrison.portfoliolauncher;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    Context mContext;

    Button mSpotifyButton = null;
    Button mScoresButton = null;
    Button mLibraryButton = null;
    Button mBiggerButton = null;
    Button mReaderButton = null;
    Button mCapstoneButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;

        mSpotifyButton = (Button) findViewById(R.id.button_spotify);
        mSpotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Spotify Streamer clicked", Toast.LENGTH_LONG).show();
            }
        });

        mScoresButton = (Button) findViewById(R.id.button_scores);
        mScoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Scores App clicked", Toast.LENGTH_LONG).show();
            }
        });

        mLibraryButton = (Button) findViewById(R.id.button_library);
        mLibraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Library clicked", Toast.LENGTH_LONG).show();
            }
        });

        mBiggerButton = (Button) findViewById(R.id.button_bigger);
        mBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Build it Better clicked", Toast.LENGTH_LONG).show();
            }
        });

        mReaderButton = (Button) findViewById(R.id.button_reader);
        mReaderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "XYZ Reader clicked", Toast.LENGTH_LONG).show();
            }
        });

        mCapstoneButton = (Button) findViewById(R.id.button_capstone);
        mCapstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Capstone clicked", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
