package com.example.mwords;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhraseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words= new ArrayList<Word>();

        words.add(new Word("Just Coming ","मैं अभी आ रहा हूँ |",R.raw.just));
        words.add(new Word(" Very Well ","बहुत अच्छा |",R.raw.verywell));
        words.add(new Word(" Fine/Very Good","अच्छी बात है |",R.raw.verygood));
        words.add(new Word(" As You Like/As You Please","जैसी आपकी मर्जी |",R.raw.asyoulike));
        words.add(new Word(" Anything Else"," और कुछ ?",R.raw.anythingelse));
        words.add(new Word("That’s enough "," बस, रहने दो",R.raw.thatsenough));
        words.add(new Word(" Thanks For This Honour"," इस सम्मान के लिए धन्यबाद |",R.raw.color_red));
        words.add(new Word(" O.K ","अच्छा |",R.raw.ok));
        words.add(new Word("Why Not"," क्यों नहीं ?",R.raw.whynot));
        words.add(new Word("Not a Bit","थोडा-सा भी नहीं |",R.raw.notabit));
        words.add(new Word("Take Care"," ध्यान रखना |",R.raw.takecare));
        words.add(new Word(" See You Tomorrow "," कल मिलेंगे |",R.raw.seeyoutomorrow));
        words.add(new Word(" Yes, by All Means"," हाँ जरूर |",R.raw.yesbyallmeans));
        words.add(new Word("That IS Too Much ","बहुत है |",R.raw.thatistoomuch));
        words.add(new Word(" Yes,Sir ! "," हाँ, सर |",R.raw.yessir));
        words.add(new Word("No, Not At All "," नहीं, कभी नहीं |",R.raw.color_red));
        words.add(new Word(" Never Mind/ Does’t Matter","कोई बात नहीं |",R.raw.nevermind));
        words.add(new Word(" Nothing Else","और कुछ नहीं |",R.raw.nothingelse));
        words.add(new Word(" Nothing Special","कोई ख़ास बात नहीं |",R.raw.nothingspecial));
        words.add(new Word(" Welcome "," आइये |",R.raw.welcome));




        WordAdapter adapter = new WordAdapter(this, words,R.color.category_phrase);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){

                Word word=words.get(position);
                MediaPlayer mediaPlayer= MediaPlayer.create(PhraseActivity.this,word.getmAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}