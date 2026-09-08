package com.example.gmailcreator;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class GmailCreatorService extends Service {
    private AccountManager accountManager;
    private static final String ACCOUNT_TYPE = "com.google";

    public GmailCreatorService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        accountManager = AccountManager.get(this);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        createRealGmailAccount();
        return START_STICKY;
    }

    private void createRealGmailAccount() {
        try {
            String uniqueId = System.currentTimeMillis() + "";
            String newEmail = "user" + uniqueId + "@gmail.com";

            accountManager.addAccountExplicitly(
                new Account(newEmail, ACCOUNT_TYPE), 
                null, 
                null
            );

            Log.d("HackerGPT", "Created: " + newEmail);
        } catch (Exception e) {
            Log.e("HackerGPT", "Error: " + e.getMessage());
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}