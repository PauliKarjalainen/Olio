package com.example.viikko75;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText inputText;
    EditText inputName;
    Context context = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        inputText = (EditText) findViewById(R.id.inputText);
        inputName = (EditText) findViewById(R.id.inputName);
        context = MainActivity.this;

        System.out.println("Kansion sijainti:" + context.getFilesDir());
    }

    public void readFile(View n){
        try {
            InputStream ins = context.openFileInput(String.valueOf(inputName.getText())); //"testi.txt"
            System.out.println("Kansion sijainti:" + context.getFilesDir());
            BufferedReader br = new BufferedReader(new InputStreamReader(ins));

            String s = "";
            textView.setText("");

            while ((s=br.readLine()) != null) {
                System.out.println(s);
                textView.append(s);
            }
            ins.close();

        } catch (IOException e) {
            Log.e("IOException", "Virhe syötteessä");
        } finally {
            System.out.println("Luettu.");
        }
    }

    public void writeFile(View n){
        try {
            OutputStreamWriter ows = new OutputStreamWriter(context.openFileOutput(String.valueOf(inputName.getText()), Context.MODE_PRIVATE)); //"testi.txt"
            System.out.println("Kansion sijainti:" + context.getFilesDir());
            String s = "";

            s = inputText.getText().toString();
            ows.write(s);
            ows.close();

        } catch (IOException e) {
            Log.e("IOException", "Virhe syötteessä");
        } finally {
            System.out.println("Kirjoitettu.");
        }
    }


    public void updateText(View n){
        textView.setText(inputText.getText());
        System.out.println("Button pressed");
    }
}