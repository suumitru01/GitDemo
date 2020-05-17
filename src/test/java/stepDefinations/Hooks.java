package stepDefinations;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	@Before("@DeletePlace")
	public void beforeScenario() throws IOException {
		// Write a code which will give us place id
		// Execute This when place id is null

		StepDefination hk = new StepDefination();
		if (StepDefination.place_Id==null) {
			hk.add_Place_Payload_with("Rajesh", "French", "Ambala");
			hk.user_calls_with_http_request("addPlaceAPI", "POST");
			hk.verify_place_Id_created_maps_to_using("Rajesh", "getPlaceAPI");
		}
	}
}