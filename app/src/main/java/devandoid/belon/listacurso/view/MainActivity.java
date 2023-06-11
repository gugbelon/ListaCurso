package devandoid.belon.listacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandoid.belon.listacurso.R;
import devandoid.belon.listacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Gustavo");
        pessoa.setSobreNome("Belon");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("11-944903993");

        outraPessoa= new Pessoa();
        outraPessoa.setPrimeiroNome("Lucas");
        outraPessoa.setSobreNome("Belon");
        outraPessoa.setCursoDesejado("Android");
        outraPessoa.setTelefoneContato("11-996008145");

    }
}