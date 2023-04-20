package pl.edu.pbs.apka9_sms;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendButton = findViewById(R.id.send_button);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber = "123456789"; // numer telefonu odbiorcy
                String message = "Cześć! To jest moja wiadomość SMS."; // treść wiadomości SMS
                SmsSender.sendSms(phoneNumber, message); // wysyłanie wiadomości SMS
            }
        });
    }
}
