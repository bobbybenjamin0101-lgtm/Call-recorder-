import android.content.Context
import android.content.Intent
import android.telephony.TelephonyManager
import android.os.Build
import android.telephony.TelephonyCallback

class CallReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == TelephonyManager.ACTION_PHONE_STATE_CHANGED) {
            val state = intent.getStringExtra(TelephonyManager.EXTRA_STATE)

            when (state) {A
