package org.orders.controller;

import java.util.List;
import org.orders.entity.Inventories;
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
public class InventoriesController {
	
	@Autowired
	private InventoriesRepository repository;

	@RequestMapping(value="/inventories", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="getAllInventories", nickname="getAllInventories")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Inventories.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Inventories> getAllInventories(){
		return repository.getAllInventories();
	}
	
	@RequestMapping(value="/inventories/product/{productID}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="productID", value="productID", required=true, dataType="Long", 
		paramType="path")})
	@ApiOperation(value="getInventoriesByProductID", nickname="getInventoriesByProductID")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Inventories.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Inventories> getInventoriesByProductID(@PathVariable Long productID){
		return repository.getInventoriesByProductID(productID);
	}
	
	@RequestMapping(value="/inventories/warehouse/{wareHouseID}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="wareHouseID", value="wareHouseID", required=true, dataType="Long", 
		paramType="path")})
	@ApiOperation(value="getInventoriesByWareHouseID", nickname="getInventoriesByWareHouseID")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Inventories.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Inventories> getInventoriesByWareHouseID(@PathVariable Short wareHouseID){
		return repository.getInventoriesByWareHouseID(wareHouseID);
	}



}
