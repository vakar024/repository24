package cucumber2;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class fruit 
{
	@Given("There are {word} fruits")
	public void There_fruits(String num, DataTable t)
	{
		List<Map<String,String>> data = t.asMaps(String.class, String.class);
		int n= data.size();
		for(int i=0;i<n;i++) {
		System.out.println("There are "+num+" fruits with "+data.get(i).get("with"));
		//System.out.println("There are "+num+" fruits with "+data.get(1).get("with"));
		//System.out.println("There are "+num+" fruits with "+data.get(2).get("with"));
	}}
	@When("I eat {word} fruits")
	public void I_eat_fruits(String str)
	{
		System.out.println("I eat "+str+" fruits");
	}
	@Then("I have {word} fruits")
	public void I_have_fruits(String str)
	{
		System.out.println("I have "+str+" fruits");
	}
}
