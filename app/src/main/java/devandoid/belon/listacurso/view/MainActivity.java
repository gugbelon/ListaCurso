package devandoid.belon.listacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandoid.belon.listacurso.R;
import devandoid.belon.listacurso.controller.PessoaController;
import devandoid.belon.listacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    public static final String NOME_PREFERENCES = "pref_listavip";
    SharedPreferences preferences;

    PessoaController controller;
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

        preferences = getSharedPreferences(NOME_PREFERENCES, 0);
        SharedPreferences.Editor listaVip = preferences.edit();

        controller = new PessoaController();
        controller.toString();

        pessoa = new Pessoa();

        pessoa.setPrimeiroNome(preferences.getString("primeiroNome",""));
        pessoa.setSobreNome(preferences.getString("Sobrenome",""));
        pessoa.setCursoDesejado(preferences.getString("CursoDesejado",""));
        pessoa.setTelefoneContato(preferences.getString("TelefoneContato",""));

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Lucas");
        outraPessoa.setSobreNome("Belon");
        outraPessoa.setCursoDesejado("Android");
        outraPessoa.setTelefoneContato("11-996008145");


        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobreNomeAluno = findViewById(R.id.editSobreNomeAluno);
        editCursoDesejado = findViewById(R.id.editCursoDesejado);
        editFoneDeContato = findViewById(R.id.editFoneDeContato);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);



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
                Toast.makeText(MainActivity.this,"Finalizando o aplicativo",Toast.LENGTH_LONG).show();
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

                Toast.makeText(MainActivity.this, "Salvando o cplicativo" + pessoa.toString(),Toast.LENGTH_LONG).show();

                controller.salvar(pessoa);


               listaVip.putString("primeiroNome", pessoa.getPrimeiroNome());
               listaVip.putString("Sobrenome", pessoa.getSobreNome());
               listaVip.putString("CursoDesejado",pessoa.getCursoDesejado());
               listaVip.putString("TelefoneContato ", pessoa.getTelefoneContato());
               listaVip.apply();

               controller.salvar(pessoa);

            }
        });



    }
}