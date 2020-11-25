package ro.upt.sma.context.activity

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import com.google.android.gms.location.ActivityRecognition
import com.google.android.gms.location.ActivityRecognitionClient


class ActivityRecognitionHandler(context: Context) {

    private val client: ActivityRecognitionClient = ActivityRecognition.getClient(context)

    fun registerPendingIntent(): PendingIntent {

        // TODO 5: Create a pending intent for ActivityRecognitionService and register for updates to activity recognition client.

        val intent = Intent(ActivityRecognitionService) = PendingIntent.getService(this.client 0, 0)

        return null!!
    }

    fun unregisterPendingIntent(pendingIntent: PendingIntent) {
        client.removeActivityUpdates(pendingIntent)
    }

}
