package com.example.mwords;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;                                       

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

       final ArrayList<Word> words= new ArrayList<Word>();


        words.add(new Word("one","एक",R.drawable.number_one,R.raw.number_one));
        words.add(new Word("two","दो",R.drawable.number_two,R.raw.number_two));
        words.add(new Word("three","तीन",R.drawable.number_three,R.raw.number_three));
        words.add(new Word("four","चार",R.drawable.number_four,R.raw.number_four));
        words.add(new Word("five","पांच",R.drawable.number_five,R.raw.number_five));
        words.add(new Word("six","छ:",R.drawable.number_six,R.raw.number_six));
        words.add(new Word("seven","सात",R.drawable.number_seven,R.raw.number_seven));
        words.add(new Word("eight","आठ",R.drawable.number_eight,R.raw.number_eight));
        words.add(new Word("nine","नौ",R.drawable.number_nine,R.raw.number_nine));
        words.add(new Word("ten","दस",R.drawable.number_ten,R.raw.number_ten));
        words.add(new Word("eleven","ग्यारह (Gyaarah)",R.drawable.number_ten,R.raw.number_eleven));
        words.add(new Word("twelve","बारह (Baarah)",R.drawable.number_ten,R.raw.number_twelbe));
        words.add(new Word("thirteen","तेरह (Tehrah)",R.drawable.number_ten,R.raw.number_thirteen));
        words.add(new Word("fourteen","चौदह (Chaudah)",R.drawable.number_ten,R.raw.number_fourteen));
        words.add(new Word("fifteen","पंद्रह (Pandrah)",R.drawable.number_ten,R.raw.number_fifteen));
        words.add(new Word("sixteen","सोलह (Saulah)",R.drawable.number_ten,R.raw.number_sisteen));
        words.add(new Word("seventeen","सत्रह (Satrah)",R.drawable.number_ten,R.raw.number_seventeen));
        words.add(new Word("eighteen","अठारह (Atharah)",R.drawable.number_ten,R.raw.number_eighteen));
        words.add(new Word("nineteen","उन्नीस (Unnis)",R.drawable.number_ten,R.raw.number_ninteen));
        words.add(new Word("twenty","बीस (Bees)",R.drawable.number_ten,R.raw.number_twenty));




        WordAdapter adapter = new WordAdapter(this, words,R.color.category_number);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){

                Word word=words.get(position);
                MediaPlayer mediaPlayer= MediaPlayer.create(NumbersActivity.this,word.getmAudioResourceId());
                mediaPlayer.start();

            }
        });
       



      




    }
}