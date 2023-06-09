package devandoid.belon.listacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandoid.belon.listacurso.R;
import devandoid.belon.listacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
    }
}