package com.yunlong.protocol;

import org.springframework.core.io.ProtocolResolver;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class CustomProtocolResolver implements ProtocolResolver {
	@Override
	public Resource resolve(String location, ResourceLoader resourceLoader) {
		System.out.println(location);

		return null;
	}
}
