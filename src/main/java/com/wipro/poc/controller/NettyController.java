/**
 * 
 */
package com.wipro.poc.controller;

import java.time.Instant;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.poc.constants.NettyServerConstants;

/**
 * @author MV20097470
 *
 */
@RestController
public class NettyController 
{
	@GetMapping(value = NettyServerConstants.GET_NETTY_RESPONSE)
	public String getNettyResponse() 
	{
		return "response from Netty Server with Url : [ " + NettyServerConstants.GET_NETTY_RESPONSE + " ] with current Time [ " + Date.from(Instant.now()) + " ]"; 
	}

}
