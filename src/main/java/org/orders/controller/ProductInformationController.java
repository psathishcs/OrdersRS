package org.orders.controller;

import java.util.List;


import org.orders.entity.ProductInformation;
import org.orders.repository.ProductInformationRepository;
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
public class ProductInformationController {
	@Autowired
	private ProductInformationRepository repository;
	
	@RequestMapping(value="/prodInfo", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="getAllProductInformation", nickname="getAllProductInformation")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = ProductInformation.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<ProductInformation> getAllProductInformation(){
		return repository.getAllProductInformation();
	}
	
	@RequestMapping(value="/prodInfo/{productID}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="productID", value="productID", required=true, dataType="Long", 
		paramType="path")})
	@ApiOperation(value="getProductInformationByID", nickname="getProductInformationByID")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = ProductInformation.class),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public ProductInformation getProductInformationByID(@PathVariable Long productID){
		return repository.getProductInformationByID(productID);
	}
	
	@RequestMapping(value="/prodInfo/category/{categoryID}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="categoryID", value="categoryID", required=true, dataType="Short", 
		paramType="path")})
	@ApiOperation(value="getProductInformationByCategoryID", nickname="getProductInformationByCategoryID")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = ProductInformation.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<ProductInformation> getProductInformationByCategoryID(@PathVariable Short categoryID){
		return repository.getProductInformationByCategoryID(categoryID);
	}
	
	@RequestMapping(value="/prodInfo/name/{productName}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="productName", value="productName", required=true, dataType="String", 
		paramType="path")})
	@ApiOperation(value="getProductInformationByName", nickname="getProductInformationByName")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = ProductInformation.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<ProductInformation> getProductInformationByName(@PathVariable String productName){
		return repository.getProductInformationByName(productName);
	}
	
	@RequestMapping(value="/prodInfo/status/{productStatus}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="productStatus", value="productStatus", required=true, dataType="String", 
		paramType="path")})
	@ApiOperation(value="getProductInformationByProductStatus", nickname="getProductInformationByProductStatus")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = ProductInformation.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<ProductInformation> getProductInformationByProductStatus(@PathVariable String productStatus){
		return repository.getProductInformationByProductStatus(productStatus);
	}
	
	@RequestMapping(value="/prodInfo/supplier/{supplierID}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="supplierID", value="supplierID", required=true, dataType="Long", 
		paramType="path")})
	@ApiOperation(value="getProductInformationBySupplierID", nickname="getProductInformationBySupplierID")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = ProductInformation.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<ProductInformation> getProductInformationBySupplierID(@PathVariable Long supplierID){
		return repository.getProductInformationBySupplierID(supplierID);
	}
}

