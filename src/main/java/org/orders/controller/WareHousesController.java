package org.orders.controller;

import java.util.List;

import org.orders.entity.ProductInformation;
import org.orders.entity.WareHouses;
import org.orders.repository.ProductInformationRepository;
import org.orders.repository.WareHousesRepository;
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
public class WareHousesController {
	@Autowired
	private WareHousesRepository repository;
	
	@RequestMapping(value="/warehouses", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="getAllWareHouses", nickname="getAllWareHouses")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = ProductInformation.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<WareHouses> getAllWareHouses(){
		return repository.getAllWareHouses();
	}
	
	@RequestMapping(value="/warehouses/{wareHouseID}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="wareHouseID", value="wareHouseID", required=true, dataType="Integer", 
		paramType="path")})
	@ApiOperation(value="getWareHousesByID", nickname="getWareHousesByID")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = ProductInformation.class),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public WareHouses getWareHousesByID(@PathVariable Integer wareHouseID){
		return repository.getWareHousesByID(wareHouseID);
	}
	
	@RequestMapping(value="/warehouses/name/{wareHouseName}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="wareHouseName", value="wareHouseName", required=true, dataType="String", 
		paramType="path")})
	@ApiOperation(value="getWareHousesByName", nickname="getWareHousesByName")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = ProductInformation.class),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public WareHouses getWareHousesByName(@PathVariable String wareHouseName){
		return repository.getWareHousesByName(wareHouseName);
	}
}
