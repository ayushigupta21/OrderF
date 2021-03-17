package com.project.Order.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Order.dto.OrderDTO;
import com.project.Order.dto.ProductsOrderedDTO;
import com.project.Order.entity.Order;
import com.project.Order.entity.ProductsOrdered;
import com.project.Order.repository.OrderRepository;
import com.project.Order.repository.ProductsOrderedRepository;


@Service
public class OrderService {
	
		Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	OrderRepository orderRepo;
	@Autowired
	ProductsOrderedRepository productsOrderedRepo;
	
/////////For OrderDetails table//////////
	
// Fetches all order details
	public List<OrderDTO> getAllOrders() {

		List<Order> orders = orderRepo.findAll();
		List<OrderDTO> orderDTOs = new ArrayList<>();

		for (Order order : orders) {
			OrderDTO orderDTO = OrderDTO.valueOf(order);
			orderDTOs.add(orderDTO);
		}

		logger.info("Order details : {}", orderDTOs);
		return orderDTOs;
	}
	
// Fetch specific order details
	public OrderDTO getSpecificOrder(Integer orderid) throws Exception {
		logger.info("Order details : {}", orderid);
		OrderDTO orderDTO = null;
		try {
		Optional<Order> optOrder = orderRepo.findById(orderid);
		if (optOrder.isPresent()) {
			Order order = optOrder.get();
			orderDTO = OrderDTO.valueOf(order);
		}
		else {
			throw new Exception("OrderService.Order_NOT_FOUND");
		}
		}
		catch(Exception e) {
			throw e;
		}
		return orderDTO;

	}
	
// Create/Add order
	public String addOrderDetails (Order order) {
		logger.info("Adding order details : {}");
		orderRepo.save(order);
		String s="Successfully Added";
		return s;
	}
	
// Delete order
	public String deleteSpecificOrder(Integer orderid) {
		logger.info("Deleting order details : {}", orderid);
		orderRepo.deleteById(orderid);
		String s="Successfully Deleted";
		return s;
	}
	
	
	/////////For ProductOrdered table//////////
	
	
// Fetches all products details
	public List<ProductsOrderedDTO> getAllProductsOrdered() {

		List<ProductsOrdered> productsOrdereds = productsOrderedRepo.findAll();
		List<ProductsOrderedDTO> productsOrderedDTOs = new ArrayList<>();

		for (ProductsOrdered productsOrdered : productsOrdereds) {
			ProductsOrderedDTO productsOrderedDTO = ProductsOrderedDTO.valueOf(productsOrdered);
			productsOrderedDTOs.add(productsOrderedDTO);
		}

	logger.info("Order details : {}", productsOrderedDTOs);
		return productsOrderedDTOs;
	}
	
	public List<ProductsOrderedDTO> getProductsOrdered(Integer orderid) {
		List<ProductsOrdered> productsOrdered = productsOrderedRepo.findByOrderid(orderid);
		List<ProductsOrderedDTO> productDTOs = new ArrayList<>();
		
		for(ProductsOrdered products : productsOrdered) {
			ProductsOrderedDTO productsDTO = ProductsOrderedDTO.valueOf(products);
			productDTOs.add(productsDTO);
		}
		return productDTOs;
	}

// Add product
	public String addProductOrderedDetails(ProductsOrdered order) {
		logger.info("Adding Productorder details : {}");
		System.out.println(order);
		productsOrderedRepo.save(order);
		String s="Successfully Added";
		return s;
		
	}
	
	//reorder
		public String reOrder(int Orderid,int Buyerid) {
			Order order = orderRepo.findByOrderid(Orderid);
			if(order!=null) {
				OrderDTO orderDTO = OrderDTO.valueOf(order);
				if(orderDTO.getBuyerid()==Buyerid) {
					List<ProductsOrdered> productsOrdered=productsOrderedRepo.findByOrderid(Orderid);
					List<ProductsOrderedDTO> productList=new ArrayList<>();
					for(ProductsOrdered product:productsOrdered) {
						ProductsOrderedDTO productDTO=ProductsOrderedDTO.valueOf(product);
						productList.add(productDTO);
					}
					
					OrderDTO newOrderDTO = new OrderDTO();
					newOrderDTO.setBuyerid(orderDTO.getBuyerid());
					newOrderDTO.setAddress(orderDTO.getAddress());
					newOrderDTO.setAmount(orderDTO.getAmount());
					newOrderDTO.setDate(LocalDate.now());
					newOrderDTO.setStatus("Order Placed");
					
					Order order1 = newOrderDTO.createEntity();
			        orderRepo.save(order1);
			        
			        for(ProductsOrderedDTO product1: productList) {
			        	ProductsOrderedDTO newProductOrderedDTO = new ProductsOrderedDTO();
				        newProductOrderedDTO.setOrderid(order1.getOrderid());
				        newProductOrderedDTO.setProdid(product1.getProdid());
				        newProductOrderedDTO.setSellerid(product1.getSellerid());
				        newProductOrderedDTO.setQuantity(product1.getQuantity());
				        newProductOrderedDTO.setPrice(product1.getPrice());
				        newProductOrderedDTO.setStatus("Order Placed");
				        
				        ProductsOrdered productOrdered = newProductOrderedDTO.createEntity();
				        productsOrderedRepo.save(productOrdered);
			        }
			        return " Reorder Successfull";
				}
				
				
			}
			
			return "Order not found for the buyer!!";
		}
	
	public OrderDTO getOrderDetails(Integer orderid) {
		Order order = orderRepo.findByOrderid(orderid);
		
		OrderDTO orderDTO = new OrderDTO();
		if(order!=null) {
			orderDTO = OrderDTO.valueOf(order);
			List<ProductsOrderedDTO> productsOrderedDTOs = getProductsOrdered(orderid);
			orderDTO.setOrderedProducts(productsOrderedDTOs);
		}
		return orderDTO;
	}

// To All View Products Ordered
	public List<ProductsOrderedDTO> getAllViewProdsOrdered(Integer prodid) {

		List<ProductsOrdered> productOrders = productsOrderedRepo.findByOrderid(prodid);	
		List<ProductsOrderedDTO> orderDTOs = new ArrayList<>();
		for (ProductsOrdered plan : productOrders) {
			ProductsOrderedDTO orderDTO = ProductsOrderedDTO.valueOf(plan);
			orderDTOs.add(orderDTO);
		}
		logger.info("Order details based on prodid : {}", orderDTOs);
		return orderDTOs;
	}

}
