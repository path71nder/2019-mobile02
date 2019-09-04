package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	//  TODO: deklarasikan variabel di sini
	private int angka;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// TODO: bind layout di sini
		angka = findViewById(R.id.number_input);
	}

	// TODO: generate angka random di sini
	private void initRandomNumber() {
		Random tebak = new Random();
		angka = tebak.nextInt();
	}

	public void handleGuess(View view) {
		// TODO: Tambahkan logika untuk melakukan pengecekan angka
		initRandomNumber();
	}

	public void handleReset(View view) {
		// TODO: Reset tampilan
	}
}
