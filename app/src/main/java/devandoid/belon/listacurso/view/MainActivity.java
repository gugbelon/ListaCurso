package devandoid.belon.listacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandoid.belon.listacurso.R;
import devandoid.belon.listacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;

    EditText editPrimeiroNome;
    EditText editSobreNomeAluno;
    EditText editCursoDesejado;
    EditText editFoneDeContato;

    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        //pessoa.setPrimeiroNome("Gustavo");
        //pessoa.setSobreNome("Belon");
        //pessoa.setCursoDesejado("Android");
        //pessoa.setTelefoneContato("11-944903993");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Lucas");
        outraPessoa.setSobreNome("Belon");
        outraPessoa.setCursoDesejado("Android");
        outraPessoa.setTelefoneContato("11-996008145");

        dadosPessoa = " primeiroNome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " Curso Desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Telefone para contato: ";
        dadosPessoa += pessoa.getTelefoneContato();


        dadosOutraPessoa = " PrimeiroNome: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += " Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobreNome();
        dadosOutraPessoa += " Curso Desejado: ";
        dadosOutraPessoa += outraPessoa.getCursoDesejado();
        dadosOutraPessoa += " Telefone para contato: ";
        dadosOutraPessoa += outraPessoa.getTelefoneContato();

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobreNomeAluno = findViewById(R.id.editSobreNomeAluno);
        editCursoDesejado = findViewById(R.id.editCursoDesejado);
        editFoneDeContato = findViewById(R.id.editFoneDeContato);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        editPrimeiroNome.setText(outraPessoa.getPrimeiroNome());
        editSobreNomeAluno.setText(outraPessoa.getSobreNome());
        editCursoDesejado.setText(outraPessoa.getCursoDesejado());
        editFoneDeContato.setText(outraPessoa.getTelefoneContato());

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editPrimeiroNome.setText("");
                editSobreNomeAluno.setText("");
                editCursoDesejado.setText("");
                editFoneDeContato.setText("");
            }
        });
        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Finalizando o aplicativo", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
                pessoa.setSobreNome(editSobreNomeAluno.getText().toString());
                pessoa.setCursoDesejado(editCursoDesejado.getText().toString());
                pessoa.setTelefoneContato(editFoneDeContato.getText().toString());

                Toast.makeText(MainActivity.this, "Salvando o cplicativo" + pessoa.toString(), Toast.LENGTH_LONG).show();

            }
        });

    }
}