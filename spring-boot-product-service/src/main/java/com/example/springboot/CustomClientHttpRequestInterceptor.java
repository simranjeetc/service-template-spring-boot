package com.example.springboot;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

public class CustomClientHttpRequestInterceptor implements ClientHttpRequestInterceptor {

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        // Log the request details
        System.out.println("Intercepting Request: " + request.getURI());
        System.out.println("HTTP Method: " + request.getMethod());
        System.out.println("Request Headers: " + request.getHeaders());
        System.out.println("Request Body: " + new String(body));

        // Execute the request
        ClientHttpResponse response = execution.execute(request, body);

        // Log the response details
        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Headers: " + response.getHeaders());

        return response;
    }
}
