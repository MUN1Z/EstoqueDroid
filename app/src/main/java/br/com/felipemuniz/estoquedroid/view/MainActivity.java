package br.com.felipemuniz.estoquedroid.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.felipemuniz.estoquedroid.R;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}