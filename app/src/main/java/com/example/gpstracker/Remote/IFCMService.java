package com.example.gpstracker.Remote;

import android.app.DownloadManager;

import com.example.gpstracker.Model.MyResponse;
import com.example.gpstracker.Model.Request;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;


public interface IFCMService {

    @Headers({

        "Content-Type:application/json",
            "Authorization:key=AAAArARkgjY:APA91bHlaKRIselTjma-v-JSMLAJiAhDOViz5094Pkl-IgV6qN7wm8V87JWCs8f9oyO3c9upwAySed_U3EMDKGbQcNs3H5oY9dyS6d1eimkoL4n8zLWVFICkGVWIN_gbxITpQQuKMlWD"

    })

    @POST("fcm/send")
    Observable<MyResponse> sendFriendRequestToUser(@Body Request body);
}
