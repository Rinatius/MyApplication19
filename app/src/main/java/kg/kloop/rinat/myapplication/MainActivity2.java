package kg.kloop.rinat.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText grantName;
    EditText grantDescription;
    Button showGrantsButton;
    Button publishButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        grantName=(EditText)findViewById(R.id.grantName);
        grantDescription=(EditText)findViewById(R.id.grantDescription);
        showGrantsButton=(EditText)findViewById(R.id.showGrantsButton);
        publishButton=(Button)findViewById(R.id.publishButton);

        publishButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });


    }
}

