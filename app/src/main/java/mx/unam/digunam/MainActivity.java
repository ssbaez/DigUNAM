package mx.unam.digunam;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn_login);


        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.



        decorView.setSystemUiVisibility(uiOptions);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                View v = getLayoutInflater().inflate(R.layout.dialog_signin, null);

                Button $btnD_crearCta = (Button) v.findViewById(R.id.btnD_crearCta);
                EditText $etD_cuenta = (EditText) v.findViewById(R.id.etD_cuenta);
                EditText $etD_pass = (EditText) v.findViewById(R.id.etD_password);
                TextView $tvD_forgotPass = (TextView) v.findViewById(R.id.tvD_forgotPass);
                Button $btnD_entrar = (Button) v.findViewById(R.id.btnD_entrar);

                $btnD_entrar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });

                builder.setView(v);
                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });

    }



}
