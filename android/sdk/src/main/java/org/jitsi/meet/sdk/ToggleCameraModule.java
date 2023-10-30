package org.jitsi.meet.sdk;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;
import com.facebook.react.modules.core.DeviceEventManagerModule;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import org.jitsi.meet.sdk.log.JitsiMeetLogger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import android.app.ActivityManager;
import android.hardware.Camera;
import android.util.Log;




@ReactModule(name = ToggleCameraModule.NAME)
public class ToggleCameraModule extends ReactContextBaseJavaModule {

    private static Camera camera;
    public static final String NAME = "ToggleCamera";
    private final ReactApplicationContext reactContext; // ReactContext örneği
    

    public ToggleCameraModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return NAME;
    }

    // Kamera yönünü değiştiren fonksiyon
    public void toggleCameraFacingMode() {
       
            
        WritableMap eventData = Arguments.createMap();
        eventData.putString("message", "Kamera yönü değiştirildi");
        // Olayı gönder
        reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)
            .emit("TOGGLE_CAMERA_FACING_MODE_EVENT", eventData);
        
        

    }

    @ReactMethod
    public void toggleCameraFacingMode(Promise promise) {
        try {
            
            System.out.println("Java metod çağrıldı: message");
            toggleCameraFacingMode();
            promise.resolve(null);
        } catch (RuntimeException re) {
            promise.reject(re);
        }
    }
}
