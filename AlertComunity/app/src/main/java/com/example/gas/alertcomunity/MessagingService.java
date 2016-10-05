package com.example.gas.alertcomunity;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by GAS on 30/09/2016.
 */
public class MessagingService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        // TODO(developer): Handle FCM messages here.
        // If the application is in the foreground handle both data and notification messages here.
        // Also if you intend on generating your own notifications as a result of a received FCM
        // message, here is where that should be initiated. See sendNotification method below.
       System.out.println( "From: " + remoteMessage.getFrom());
        String mensaje2=remoteMessage.getNotification().getBody();
        System.out.println("Notification Message Body: " + remoteMessage.getNotification().getBody());
        MainActivity.mensaje=mensaje2;

    }
}
