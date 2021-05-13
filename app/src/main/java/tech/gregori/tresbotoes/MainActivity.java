package tech.gregori.tresbotoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public static final String EXTRA_BUTTON_ID = "tech.gregori.tresbotoes.extra.button_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lauchSecondActivity(View view) {
        int id = view.getId();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_BUTTON_ID, id);
        Log.d(TAG, "lauchSecondActivity: Pressionado o botão com id: " + id);
        startActivity(intent);
    }
}