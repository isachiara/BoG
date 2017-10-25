package br.edu.ifpe.tads.pdm.bog;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.TextView;

public class DetailsGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_game);
        Intent i = getIntent();
        Games game = (Games)i.getSerializableExtra("game");
        //TextView name = (TextView) findViewById(R.id.game_name);
        TextView starRate = (TextView) findViewById(R.id.rate);
        TextView descricacao= (TextView) findViewById(R.id.descricao);
        TextView categoria = (TextView) findViewById(R.id.categoria);

        //name.setText(game.getNome());
        starRate.setText("Rank: " + game.getRatingBar());
        descricacao.setText("Descrição: \n" + game.getDescricao());
        categoria.setText("Gênero: " + game.getCategoria());

        setTitle(game.getNome());

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
