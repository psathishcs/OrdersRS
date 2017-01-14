package org.orders.controller;

import java.math.BigInteger;
import java.util.List;

import org.orders.entity.OrderItem;
import org.orders.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class OrderItemController {
	@Autowired
	private OrderItemRepository repository;

	@RequestMapping(value="/orderitem", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="getAllOrderItem", nickname="getAllOrderItem")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = OrderItem.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<OrderItem> getAllOrderItem(){
		return repository.getAllOrderItem();
	}
	
	@RequestMapping(value="/orderitem/{orderID}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="orderID", value="orderID", required=true, dataType="BigInteger", 
		paramType="path")})
	@ApiOperation(value="getOrderItemByID", nickname="getOrderItemByID")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = OrderItem.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<OrderItem> getOrderItemByID(@PathVariable BigInteger orderID){
		return repository.getOrderItemByID(orderID);
	}
	
	@RequestMapping(value="/orderitem/product/{productID}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="productID", value="productID", required=true, dataType="BigInteger", 
		paramType="path")})
	@ApiOperation(value="getOrderItemByProductID", nickname="getOrderItemByProductID")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = OrderItem.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<OrderItem> getOrderItemByProductID(@PathVariable Long productID){
		return repository.getOrderItemByProductID(productID);
	}
	
	@RequestMapping(value="/orderitem/lineitem/{lineItemID}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="lineItemID", value="lineItemID", required=true, dataType="BigInteger", 
		paramType="path")})
	@ApiOperation(value="getOrderItemByLineItemID", nickname="getOrderItemByLineItemID")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = OrderItem.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<OrderItem> getOrderItemByLineItemID(@PathVariable Integer lineItemID){
		return repository.getOrderItemByLineItemID(lineItemID);
	}
	
	@RequestMapping(value="/orderitem/pricerange", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="minPrice", value="minPrice", required=true, dataType="Double", 
		paramType="query"),
		@ApiImplicitParam(name="maxPrice", value="maxPrice", required=true, dataType="Double", 
		paramType="query")})
	@ApiOperation(value="getProductsByPriceRange", nickname="getProductsByPriceRange")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = OrderItem.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<OrderItem> getProductsByPriceRange(@RequestParam(value="minPrice", defaultValue="0.0")Double minPrice, 
			@RequestParam(value="maxPrice")Double maxPrice ){
		return repository.getOrderItemByPriceRange(minPrice, maxPrice);
	}


}
