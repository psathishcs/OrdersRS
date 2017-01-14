package org.orders.controller;

import java.util.List;

import org.orders.entity.Customers;
import org.orders.entity.Inventories;
import org.orders.repository.CustomersRepository;
import org.orders.repository.InventoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class CustomersController {
	@Autowired
	private CustomersRepository repository;

	@RequestMapping(value="/customers", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="getAllCustomers", nickname="getAllCustomers")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Customers.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Customers> getAllCustomers(){
		return repository.getAllCustomers();
	}
	
	@RequestMapping(value="/customers/{customerID}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="customerID", value="customerID", required=true, dataType="Long", 
		paramType="path")})
	@ApiOperation(value="getCustomersByID", nickname="getCustomersByID")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Customers.class),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public Customers getCustomersByID(@PathVariable Long customerID){
		return repository.getCustomersByID(customerID);
	}
	
	@RequestMapping(value="/customers/firstname/{firstName}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="firstName", value="firstName", required=true, dataType="String", 
		paramType="path")})
	@ApiOperation(value="getCustomersByFirstName", nickname="getCustomersByFirstName")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Customers.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Customers> getCustomersByFirstName(@PathVariable String firstName){
		return repository.getCustomersByFirstName(firstName);
	}
	
	@RequestMapping(value="/customers/email/{custEmail}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="custEmail", value="custEmail", required=true, dataType="String", 
		paramType="path")})
	@ApiOperation(value="getCustomersByEmail", nickname="getCustomersByEmail")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Customers.class),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public Customers getCustomersByEmail(@PathVariable String custEmail){
		return repository.getCustomersByEmail(custEmail);
	}
	
	@RequestMapping(value="/customers/gender/{gender}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="gender", value="gender", required=true, dataType="Character", 
		paramType="path")})
	@ApiOperation(value="getCustomersByGender", nickname="getCustomersByGender")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Customers.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Customers> getCustomersByGender(@PathVariable Character gender){
		return repository.getCustomersByGender(gender);
	}
	
	@RequestMapping(value="/customers/maritalStatus/{maritalStatus}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="maritalStatus", value="maritalStatus", required=true, dataType="String", 
		paramType="path")})
	@ApiOperation(value="getCustomersByGender", nickname="getCustomersByGender")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Customers.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Customers> getCustomersByMaritalStatus(@PathVariable String maritalStatus){
		return repository.getCustomersByMaritalStatus(maritalStatus);
	}
	
}
