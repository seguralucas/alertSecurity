package com.example.gas.alertcomunity;

import android.nfc.Tag;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by GAS on 30/09/2016.
 */
public class ControladorToken extends FirebaseInstanceIdService {

        @Override
        public void onTokenRefresh() {
            // Get updated InstanceID token.
            String refreshedToken = FirebaseInstanceId.getInstance().getToken();
            System.out.println("Refreshed token: " + refreshedToken);
        }

}
