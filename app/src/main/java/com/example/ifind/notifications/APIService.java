package com.example.ifind.notifications;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAEUVt3Xg:APA91bEHSHc8S4paNZ8vDvsMdRxQGO19HW9WDNsJgDqtoXxJwKRv80zXzTF38Sx0z6kQAVAbTuJTihkwUR-YmHrs9XY-ynC5OAORMR914xni6aYuNptqE_PXnJyVVO_g8V8E4a5vZkrw"
    })

    @POST("fcm/send")
    Call<Response> sendNotification(@Body Sender body);
}
