package Project;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.channels.InterruptedByTimeoutException;

public class Api {
	
	public static void main(String args[]) throws IOException,InterruptedByTimeoutException, InterruptedException {
		
		var url="https://api.covidtracking.com";
		
		var request=HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
		var client =HttpClient.newBuilder().build();
		
		var response=client.send(request, HttpResponse.BodyHandlers.ofString());
		
		System.out.println(response.statusCode());
	    System.out.println(response.body());
	}
	
}
