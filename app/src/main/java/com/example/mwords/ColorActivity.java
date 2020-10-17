package com.example.mwords;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words= new ArrayList<Word>();

        words.add(new Word("Red","लाल",R.drawable.color_red,R.raw.red));

        words.add(new Word("Green","हरा",R.drawable.color_green,R.raw.green));
        words.add(new Word("White","सफेद",R.drawable.color_white,R.raw.white));
        words.add(new Word("Black","काला",R.drawable.color_black,R.raw.black));
        words.add(new Word("Brown","भूरा",R.drawable.color_brown,R.raw.brown));

        words.add(new Word("Yellow","पीला",R.drawable.color_mustard_yellow,R.raw.yello));
        words.add(new Word("Silver ","चांदी जैसा रंग",R.drawable.color_gray,R.raw.gray));






        WordAdapter adapter = new WordAdapter(this, words,R.color.category_color);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){

                Word word=words.get(position);
                MediaPlayer mediaPlayer= MediaPlayer.create(ColorActivity.this,word.getmAudioResourceId());
                mediaPlayer.start();
            }
        });

    }
}