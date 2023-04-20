package pl.edu.pbs.apka9_sms;

import android.telephony.SmsManager;

public class SmsSender {

    public static void sendSms(String phoneNumber, String message) {
        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(phoneNumber, null, message, null, null);
    }
}
