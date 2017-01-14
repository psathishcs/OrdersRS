package org.orders.controller;

import java.math.BigInteger;
import java.util.List;

import org.orders.entity.OrderItem;
import org.orders.entity.Orders;
import org.orders.repository.OrderItemRepository;
import org.orders.repository.OrdersRepository;
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
public class OrdersController {
	@Autowired
	private OrdersRepository repository;

	@RequestMapping(value="/orders", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="getAllOrders", nickname="getAllOrders")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Orders.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Orders> getAllOrders(){
		return repository.getAllOrders();
	}
	
	@RequestMapping(value="/orders/{orderID}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="orderID", value="orderID", required=true, dataType="BigInteger", 
		paramType="path")})
	@ApiOperation(value="getOrdersByID", nickname="getOrdersByID")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Orders.class),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public Orders getOrdersByID(@PathVariable BigInteger orderID){
		return repository.getOrdersByID(orderID);
	}
	
	@RequestMapping(value="/orders/customer/{customerID}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="customerID", value="customerID", required=true, dataType="BigInteger", 
		paramType="path")})
	@ApiOperation(value="getOrderItemByProductID", nickname="getOrderItemByProductID")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Orders.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Orders> getOrdersByCustomerID(@PathVariable Long customerID){
		return repository.getOrdersByCustomerID(customerID);
	}
	
	@RequestMapping(value="/orders/mode/{orderMode}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="orderMode", value="orderMode", required=true, dataType="String", 
		paramType="path")})
	@ApiOperation(value="getOrdersByOrderMode", nickname="getOrdersByOrderMode")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Orders.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Orders> getOrdersByOrderMode(@PathVariable String orderMode){
		return repository.getOrdersByOrderMode(orderMode);
	}
	
	@RequestMapping(value="/orders/status/{orderStatus}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="orderStatus", value="orderStatus", required=true, dataType="Short", 
		paramType="path")})
	@ApiOperation(value="getOrdersByOrderStatus", nickname="getOrdersByOrderStatus")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Orders.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Orders> getOrdersByOrderStatus(@PathVariable Short orderStatus){
		return repository.getOrdersByOrderStatus(orderStatus);
	}
	

	@RequestMapping(value="/orders/salesrep/{salesRepID}", method = RequestMethod.GET)
	@ResponseBody
	@ApiImplicitParams({@ApiImplicitParam(name="salesRepID", value="salesRepID", required=true, dataType="Long", 
		paramType="path")})
	@ApiOperation(value="getOrdersBySalesRepID", nickname="getOrdersBySalesRepID")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Success", response = Orders.class, responseContainer="List"),
			@ApiResponse(code=401, message="Unauthorized"),
			@ApiResponse(code=403, message="Forbidden"),
			@ApiResponse(code=404, message="Not Found"),
			@ApiResponse(code=500, message="Failed")})
	public List<Orders> getOrdersBySalesRepID(@PathVariable Long salesRepID){
		return repository.getOrdersBySalesRepID(salesRepID);
	}
	
}
