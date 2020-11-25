package ro.upt.sma.context.location

import android.annotation.SuppressLint
import android.content.Context
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationRequest.PRIORITY_HIGH_ACCURACY
import com.google.android.gms.location.LocationServices

@SuppressLint("MissingPermission")

class LocationHandler(context: Context) {

    private val client: FusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context)

    fun registerLocationListener(locationCallback: LocationCallback) {
        // TODO 1: Create a LocationRequest with PRIORITY_HIGH_ACCURACY and smallest displacement to 10m.

            val locationRequest = LocationRequest.create()
            locationRequest.priority = PRIORITY_HIGH_ACCURACY

        // TODO 2: Register request and callback with the fused location service client.

        locationRequest(locationCallback)
        locationRequest?: return
        
    }

    private fun FusedLocationProviderClient(): Any {

    }

    fun unregisterLocationListener(locationCallback: LocationCallback) {
        client.removeLocationUpdates(locationCallback)
    }

}

private operator fun LocationRequest.invoke(locationCallback: LocationCallback) {

}
