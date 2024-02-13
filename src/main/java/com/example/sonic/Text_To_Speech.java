package com.example.sonic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class Text_To_Speech extends AppCompatActivity {
    TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_to_speech);
        EditText e1=findViewById(R.id.editTextTextMultiLine);
        Button b1 =findViewById(R.id.button3);

        b1.setOnClickListener(v -> tts =new TextToSpeech(getApplicationContext(), status -> {
            if(status==TextToSpeech.SUCCESS){
                tts.setLanguage(Locale.CANADA);
                tts.setSpeechRate(1.0f);
                tts.speak(e1.getText().toString(),TextToSpeech.QUEUE_ADD,null);
            }
        }));

    }
}