package tech.gregori.tresbotoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        int id = intent.getIntExtra(MainActivity.EXTRA_BUTTON_ID, R.id.texto_um);
        Log.d(TAG, "onCreate: Recebido id: " + id);

        String text = "";
        switch (id) {
            case R.id.texto_um:
                text = "Texto um pressionado!";
                break;
            case R.id.texto_dois:
                text = "Texto dois pressionado!";
                break;
            case R.id.texto_tres:
                text = "Texto três pressionado!";
                break;
            default:
                text = "Erro! Isso não deveria aparecer!";
                break;
        }

        TextView textView = findViewById(R.id.text_diplay);
        textView.setText(text);
    }
}