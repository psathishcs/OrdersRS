package org.orders.controller;

import java.util.List;

import org.orders.entity.Orders;
import org.orders.entity.ProductDescriptions;
import org.orders.repository.ProductDescriptionsRepository;
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
public class ProductDescriptionsController {
	@Autowired
	private ProductDescriptionsRepository repository;

	@RequestMapping(value="/prodDesc", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="getAllProductDescriptions", nickname="getAllProductDescriptions")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = ProductDescriptions.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<ProductDescriptions> getAllProductDescriptions(){
		return repository.getAllProductDescriptions();
	}
	
	@RequestMapping(value="/prodDesc/product/{productID}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="productID", value="productID", required=true, dataType="Long", 
		paramType="path")})
	@ApiOperation(value="getOrdersByProductID", nickname="getOrdersByProductID")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = ProductDescriptions.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<ProductDescriptions> getOrdersByProductID(@PathVariable Long productID){
		return repository.getProductDescriptionsByProductID(productID);
	}
	
	@RequestMapping(value="/prodDesc/language/{languageID}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="languageID", value="languageID", required=true, dataType="String", 
		paramType="path")})
	@ApiOperation(value="getOrdersByLanguageID", nickname="getOrdersByLanguageID")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = ProductDescriptions.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<ProductDescriptions> getOrdersByLanguageID(@PathVariable String languageID){
		return repository.getProductDescriptionsByLanguageID(languageID);
	}
	
}
