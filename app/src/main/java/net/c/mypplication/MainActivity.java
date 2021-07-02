package net.c.mypplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edittext_ville,edittext_prix,edittext_surface,edittext_nbPiece;
    Button button_add,button_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext_ville = findViewById(R.id.edittext_ville);
        edittext_prix = findViewById(R.id.edittext_prix);
        edittext_surface = findViewById(R.id.edittext_surface);
        edittext_nbPiece = findViewById(R.id.edittext_nbPiece);


        button_add = findViewById(R.id.button_add);
        button_view = findViewById(R.id.button_view);


        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringVille = edittext_ville.getText().toString();
                String stringPrix = edittext_prix.getText().toString();
                String stringSurface= edittext_surface.getText().toString();
                String stringNBPiece = edittext_nbPiece.getText().toString();


                if (stringVille.length() <=0 || stringPrix.length() <=0|| stringSurface.length() <=0|| stringNBPiece.length() <=0){
                    Toast.makeText(MainActivity.this, "Enter All Data", Toast.LENGTH_SHORT).show();
                }else {
                    DatabaseHelperClass databaseHelperClass = new DatabaseHelperClass(MainActivity.this);
                    EmployeeModelClass employeeModelClass = new EmployeeModelClass(stringVille,stringPrix,stringSurface,stringNBPiece);
                    databaseHelperClass.addEmployee(employeeModelClass);
                    Toast.makeText(MainActivity.this, "Add Employee Successfully", Toast.LENGTH_SHORT).show();
                    finish();
                    startActivity(getIntent());
                }
            }
        });


        button_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ViewEmployeeActivity.class);
                startActivity(intent);
            }
        });


    }
}


