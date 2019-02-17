package app.acpce.org;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button student;
    private Button management;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        management=(Button) findViewById(R.id.management_button);
        management.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_management();
            }
        });

        student = (Button) findViewById(R.id.student_button);
        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_student();


            }
        });

    }
    public void openactivity_management(){
        Intent intent = new Intent(this,Management.class);
        startActivity(intent);
    }

    public void openactivity_student(){

        Intent intent = new Intent(this,Student.class);
        startActivity(intent);
    }


}