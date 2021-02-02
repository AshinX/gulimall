package com.fengyue.gulimall.gulimallsearch.gulimallsearch;

import com.alibaba.fastjson.JSONObject;
import com.fengyue.gulimall.gulimallsearch.gulimallsearch.pojo.User;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.io.IOException;

@SpringBootTest
class GulimallSearchApplicationTests {

	@Autowired
	private RestHighLevelClient client;

	@Test
	void contextLoads() throws IOException {

		IndexRequest request=new IndexRequest("users");
		request.id("1");
		User user = new User();
		user.setName("zhangsan");
		user.setAge(20);
		user.setAddress("address");
		request.source(JSONObject.toJSONString(user), XContentType.JSON);
		client.index(request, RequestOptions.DEFAULT);

	}




}
