package cucu;

import java.util.List;

import io.cucumber.java.en.Given;

public class abcBinding {
	@Given("I am reading the name")
	public void i_am_reading_the_name(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> li = dataTable.asLists(String.class);
		System.out.println(li.get(0).get(0) + " " + li.get(1).get(0));
	}

	@Given("I am")
	public void i_am() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
