package app.acpce.org;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Student extends AppCompatActivity {
    private Button Login;
    private Button Createaccount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        Login = findViewById(R.id.loginstudent_BTN);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_student_main();


            }
        });

        Createaccount = findViewById(R.id.CreateaccountSTUD_BTN);
        Createaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_student_register();
            }
        });


    }

    public void openactivity_student_main() {
        Intent intent = new Intent(this, StudentMAIN.class);
        startActivity(intent);
    }

    public void openactivity_student_register() {
        Intent intent = new Intent(this, StudentRegister.class);
        startActivity(intent);
    }

}