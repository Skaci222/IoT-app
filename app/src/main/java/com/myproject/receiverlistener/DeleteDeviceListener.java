package com.myproject.receiverlistener;

import org.eclipse.paho.client.mqttv3.MqttException;
import org.json.JSONException;

public interface DeleteDeviceListener {
    void deleteDevice() throws JSONException, MqttException;
}
