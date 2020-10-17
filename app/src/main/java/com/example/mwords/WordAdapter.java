package com.example.mwords;

import android.app.Activity;
import android.telecom.TelecomManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words,int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColorResourceId=colorResourceId;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemview = convertView;
        if (listItemview == null) {
            listItemview = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Word currentWord= getItem(position);

        TextView hindiTextview =(TextView)listItemview.findViewById(R.id.hindi_text_view);
        hindiTextview.setText(currentWord.getmHindiTranslation());

        TextView EnglishTextview=(TextView)listItemview.findViewById(R.id.English_text_view);
        EnglishTextview.setText(currentWord.getmDefaultTranslation());

        ImageView imageView=(ImageView)listItemview.findViewById(R.id.image);
        imageView.setImageResource(currentWord.getImageResourceId());

        View textContainer= listItemview.findViewById(R.id.linear);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemview;
}}