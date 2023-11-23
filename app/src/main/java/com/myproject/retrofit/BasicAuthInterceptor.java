package com.myproject.retrofit;

import java.io.IOException;

import okhttp3.Credentials;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class BasicAuthInterceptor implements Interceptor {

    private String credentials;

    public BasicAuthInterceptor(String appId, String secret){
        this.credentials = Credentials.basic(appId, secret);
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request authenticationRequest = request.newBuilder()
                .header("Authorization", credentials).build();
        return chain.proceed(authenticationRequest);
    }
}
