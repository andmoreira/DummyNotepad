package pt.ulisboa.tecnico.sise.lab02.dummynotepad;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NewNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_note);

        Log.d("Notepad_app", "This is my first debugging message");

        final Button button = (Button) findViewById(R.id.OkButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = (EditText) findViewById(R.id.NoteTitleEditText);
                Log.d("Notepad_app", editText.getText().toString());

                TextView textView = (TextView) findViewById(R.id.NoteBodyEditText);
                Log.d("Notepad_app", textView.getText().toString());

                // This changes the text of the button after it is pressed for the first time
                button.setText(editText.getText().toString());

                Toast.makeText(view.getContext(),"Olá", Toast.LENGTH_SHORT).show();
//                Snackbar.make(findViewById(android.R.id.content), "Ora viva", Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}
