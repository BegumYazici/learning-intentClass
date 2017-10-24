package intentclass.begi.com.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button sendSMS,sendMAIL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendSMS = (Button) findViewById(R.id.btn_sendSms);
        sendMAIL = (Button) findViewById(R.id.btn_sendMail);

        sendSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String smsNumber = "05535040000";
                String smsText = "Hello, I'm a test message!";
                Uri uri = Uri.parse("smsto:"+ smsNumber);
                Intent intent = new Intent(Intent.ACTION_SENDTO,uri);
                intent.putExtra("sms_body",smsText);
                startActivity(intent);
            }
        });

    }
}
