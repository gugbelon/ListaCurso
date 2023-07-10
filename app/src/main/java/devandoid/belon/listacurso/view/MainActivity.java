package devandoid.belon.listacurso.view;

import static devandoid.belon.listacurso.controller.PessoaController.NOME_PREFERENCES;

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

    SharedPreferences preferences ;
    PessoaController controller;

    Pessoa pessoa;
    Pessoa outraPessoa;
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

        controller = new PessoaController(MainActivity.this);
        controller.toString();

        pessoa = new Pessoa();
        controller.buscar(pessoa);
        /*
        pessoa.setPrimeiroNome(preferences.getString("primeiroNome",""));
        pessoa.setSobreNome(preferences.getString("Sobrenome",""));
        pessoa.setCursoDesejado(preferences.getString("CursoDesejado",""));
        pessoa.setTelefoneContato(preferences.getString("TelefoneContato",""));
        */

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobreNomeAluno = findViewById(R.id.editSobreNomeAluno);
        editCursoDesejado = findViewById(R.id.editCursoDesejado);
        editFoneDeContato = findViewById(R.id.editFoneDeContato);

        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobreNomeAluno.setText(pessoa.getSobreNome());
        editCursoDesejado.setText(pessoa.getCursoDesejado());
        editFoneDeContato.setText(pessoa.getTelefoneContato());

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

                Toast.makeText(MainActivity.this, "Salvando o aplicativo" + pessoa.toString(), Toast.LENGTH_LONG).show();


                controller.salvar(pessoa);

            }
        });


    }
}