package devandoid.belon.listacurso.controller;

import android.util.Log;

import androidx.annotation.NonNull;

import devandoid.belon.listacurso.model.Pessoa;

public class PessoaController {
    @NonNull
    @Override
    public String toString() {

        Log.d("mvc_controller", "iniciando a classe controller");

        return super.toString();
    }

    public void salvar(Pessoa pessoa) {

        Log.d("mvc_controller", "Salvando..." +pessoa.toString());
    }
}
