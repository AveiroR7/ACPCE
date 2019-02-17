package app.acpce.org;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Management extends AppCompatActivity {

    private Button Login;
    private Button Createaccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management);

        Login = findViewById(R.id.Login_MGMT_BTN);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_management_main();


            }
        });

        Createaccount = findViewById(R.id.Create_ACC_MGMT_BTN);
        Createaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_management_register();
            }
        });


    }

    private void openactivity_management_register() {
        Intent intent = new Intent(this, ManagementRegister.class);
        startActivity(intent);
    }

    private void openactivity_management_main() {
        Intent intent = new Intent(this, ManagementMAIN.class);
        startActivity(intent);
    }

}
