package com.example.payment.controller;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.payment.exception.InvalidInputException;
import com.example.payment.model.OrderData;
import com.example.payment.model.OrderItem;
import com.example.payment.repository.OrderItemRepository;
import com.example.payment.repository.OrderRepository;

@RestController // this is the combination of @Controller and @ResponseBody
@RequestMapping(path = "/", headers="content-type=*", consumes="text/plain", produces = {"application/xml","application/json"})
/* @Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Mapping
public @interface RequestMapping {
.....
	@AliasFor("value")
	String[] path() default {};
	RequestMethod[] method() default {};
	String[] headers() default {};
	String[] consumes() default {};
	.....
	String[] produces() default {};
	.....
	}
*/
public class MyController {

	private static final Logger logger = LoggerFactory.getLogger(MyController.class);
	
	@Autowired
	private OrderRepository orderRepo;
	
	@Autowired
	private OrderItemRepository orderItemRepo;
	
	@RequestMapping (path = "hello", method = RequestMethod.GET)
	/* @Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	@Documented
	@RequestMapping(method = RequestMethod.GET)
	public @interface GetMapping {
	.....
	@AliasFor(annotation = RequestMapping.class)
	String[] path() default {};
	}
*/
	public String hello() {
		throw new InvalidInputException("invalid input data");
		
	}
	
	@GetMapping("welcome/{name}")
	public String getInfo(@PathVariable("name") String str) {
		logger.info("entered method getInfo()");
		
		orderItemRepo.findAll().forEach(i -> System.out.println(i.getOrder().getId() + " "+i.getId()));
		
		Iterable<OrderData> s = orderRepo.findAll();
		s.forEach(i -> System.out.println(i.getId() + " "+ i.getDescription()));
		
		orderRepo.getOrdeItemDetails().forEach(i->System.out.println(i.getOrderId() + "  "+ i.getOrderItemId()));
		return "Welcome "+str; 
	}
	
	@GetMapping("greet")
	public String greet(@RequestParam(value = "id") int id) {
		OrderData o = new OrderData();
		o.setDescription("food");
		
		OrderItem i1 = new OrderItem();
		i1.setOrder(o);
		orderRepo.save(o);
		orderItemRepo.save(i1);
		
		return "how are you "+id;
	}
	
	@PostMapping("addOrder")
	
	public void postData() {
		//validate the input data(DTO)
;
		
		//convert Dto to Entity
		
		//process data(call service class for processing
		
		//convert Entity to DTO
		
		//Return  DTO		
	}
	
	@GetMapping("order")
	@Cacheable("order")
	public String cachedata() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		return "hfwrhwierfwieruweikfalkfalmflask";
		
	}
}
