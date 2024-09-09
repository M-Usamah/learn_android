package com.example.registrationform;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onClickRegister(View view) {
        EditText firstNameEdit = findViewById(R.id.firstNameEdit);
        EditText lastNameEdit = findViewById(R.id.lastNameEdit);
        EditText emailEdit = findViewById(R.id.emailAddressEedit);  // Corrected ID

        TextView firstNameView = findViewById(R.id.firstNameView);
        TextView lastNameView = findViewById(R.id.lastNameView);
        TextView emailView = findViewById(R.id.emailAddresView);

        firstNameView.setText(firstNameEdit.getText().toString());
        lastNameView.setText(lastNameEdit.getText().toString());
        emailView.setText(emailEdit.getText().toString());
    }
}
