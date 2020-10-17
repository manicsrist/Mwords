package com.example.mwords;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words= new ArrayList<Word>();

        words.add(new Word("Father","पिता (pitā) papa / बाप (bāp)",R.drawable.family_father,R.raw.father));
        words.add(new Word("mother/ mummy/ mom","(mātā) / माँ (māṅ)/मम्मी",R.drawable.family_mother,R.raw.mother));
        words.add(new Word("husband","पति (pati)",R.drawable.family_older_brother,R.raw.husband));
        words.add(new Word("wife","पत्नी (patnī) / बीवी (bīvī)",R.drawable.family_older_sister,R.raw.wife));
        words.add(new Word("Brother"," भाई ",R.drawable.family_older_brother,R.raw.brother));
        words.add(new Word("Sister","बहन",R.drawable.family_older_sister,R.raw.sister));
        words.add(new Word("Grandmother","दादी (dādī)/नानी (nānī)",R.drawable.family_grandmother,R.raw.grandmother));
        words.add(new Word("Grandfather","दादा (dādā)/नाना (nānā)",R.drawable.family_grandfather,R.raw.grandfather));
        words.add(new Word("Son","बेटा (beṭā)",R.drawable.family_younger_brother,R.raw.son));
        words.add(new Word("Daughter","बेटी (beṭī)",R.drawable.family_younger_sister,R.raw.doughter));
        words.add(new Word("Uncle","चाचा/मौसा/मामा/ताऊ/फूफा",R.drawable.family_father,R.raw.uncle));
        words.add(new Word("Aunt","चाची/ मौसी /ताई/मामी/बुआ",R.drawable.family_mother,R.raw.aunt));
        words.add(new Word("elder sister in law","भाभी",R.drawable.family_older_sister,R.raw.eldersisterinlaw));
        words.add(new Word("younger sister in law","भायाऊ",R.drawable.family_older_sister,R.raw.youngersisterinlaw));
        words.add(new Word("sister-in-law husband's elder sister/younger sister","ननद (nanad)",R.drawable.family_younger_sister,R.raw.eldersisterinlaw));
        words.add(new Word("brother-in-law","जेठ (jeṭh)",R.drawable.family_older_brother,R.raw.brother));
        words.add(new Word("brother-in-law husband's younger brother","देवर (devar)",R.drawable.family_younger_brother,R.raw.brother));
        words.add(new Word("sister-in-law husband's elder brother's wife","जेठानी (jeṭhānī)",R.drawable.family_mother,R.raw.sisterinlaw_husbands_elderbrotherswife));
        words.add(new Word("sister-in-law husband's younger brother's wife","देवरानी (devrānī)",R.drawable.family_older_sister,R.raw.sisinlaw_hybrothers));
        words.add(new Word("sister-in-law wife's sister","साली (sālī)",R.drawable.family_younger_sister,R.raw.sister));
        words.add(new Word("brother-in-law wife's brother","साला (sālā)",R.drawable.family_younger_brother,R.raw.brotherinlaw_wifesbrother));
        words.add(new Word("brother-in-law sister's husband","जीजा (jījā) / बहनोई (bahanoī)",R.drawable.family_older_brother,R.raw.brother));
        words.add(new Word("son-in-law daughter's husband","दामाद (dāmād) / जमाई (jamāī)",R.drawable.family_older_brother,R.raw.son));
        words.add(new Word("daughter-in-law son's wife","बहू (bahū)",R.drawable.family_older_sister,R.raw.doughterinlaw));
        words.add(new Word("Father-in-law Husband/Wife's father","ससुर (sasur)",R.drawable.family_father,R.raw.fatherinlaw));
        words.add(new Word("Mother-in-law Husband/Wife's mother","सास (sās)",R.drawable.family_mother,R.raw.motherinlaw));







        WordAdapter adapter = new WordAdapter(this, words,R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){

                Word word=words.get(position);
                MediaPlayer mediaPlayer= MediaPlayer.create(FamilyActivity.this,word.getmAudioResourceId());
                mediaPlayer.start();

            }
        });
    }
}