package resources;
//enum special class in java which has collection of constants and methods

public enum APIresources {

	addPlaceAPI("/maps/api/place/add/json"), getPlaceAPI("/maps/api/place/get/json"),
	deletePlaceAPI("/maps/api/place/delete/json");
	private String resource ;

	APIresources(String resource) {
		// TODO Auto-generated constructor stub
		this.resource=resource;
		
	}
	public String getResource() 
		{
		return resource;
		}
}
