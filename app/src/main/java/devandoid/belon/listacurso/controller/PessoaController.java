package devandoid.belon.listacurso.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import devandoid.belon.listacurso.model.Pessoa;
import devandoid.belon.listacurso.view.MainActivity;

public class PessoaController {

    SharedPreferences.Editor listaVip;
    SharedPreferences preferences;

    public static final String NOME_PREFERENCES = "pref_listavip";

    public PessoaController(MainActivity mainActivity) {

        preferences = mainActivity.getSharedPreferences(NOME_PREFERENCES, 0);
        listaVip = preferences.edit();
    }

    @NonNull
    @Override
    public String toString() {

        Log.d("mvc_controller", "iniciando a classe controller");

        return super.toString();
    }


    public void salvar(Pessoa pessoa) {

        Log.d("mvc_controller", "Salvando..." + pessoa.toString());

        listaVip.putString("primeiroNome", pessoa.getPrimeiroNome());
        listaVip.putString("Sobrenome", pessoa.getSobreNome());
        listaVip.putString("cursoDesejado", pessoa.getCursoDesejado());
        listaVip.putString("telefoneContato", pessoa.getTelefoneContato());
        listaVip.apply();

    }

    public Pessoa buscar (Pessoa pessoa) {
        pessoa.setPrimeiroNome(preferences.getString("primeiroNome", "NA"));
        pessoa.setSobreNome(preferences.getString("Sobrenome", "NA"));
        pessoa.setCursoDesejado(preferences.getString("cursoDesejado", "NA"));
        pessoa.setTelefoneContato(preferences.getString("(telefoneContato", "NA"));
        //listaVip.apply();
        return pessoa;
    }

    public void limpar (Pessoa pessoa) {
        listaVip.clear();
        listaVip.apply();
    }
}
