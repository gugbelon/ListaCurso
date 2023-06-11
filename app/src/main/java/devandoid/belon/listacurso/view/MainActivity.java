package devandoid.belon.listacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandoid.belon.listacurso.R;
import devandoid.belon.listacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;

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

        dadosPessoa = " primeiroNome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa = " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa = " Curso Desejado: ";
        dadosPessoa = pessoa.getCursoDesejado();
        dadosPessoa = " Telefone para contato: ";
        dadosPessoa += pessoa.getTelefoneContato(); dadosPessoa = " primeiroNome: ";

        dadosOutraPessoa = " PrimeiroNome";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa = " Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobreNome();
        dadosOutraPessoa = " Curso Desejado: ";
        dadosOutraPessoa = outraPessoa.getCursoDesejado();
        dadosOutraPessoa = " Telefone para contato: ";
        dadosOutraPessoa += outraPessoa.getTelefoneContato();

        int x = 0;
    }
}