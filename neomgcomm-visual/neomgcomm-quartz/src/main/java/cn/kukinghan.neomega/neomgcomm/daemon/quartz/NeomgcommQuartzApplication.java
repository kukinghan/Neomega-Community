package cn.kukinghan.neomega.neomgcomm.daemon.quartz;

import cn.kukinghan.neomega.neomgcomm.common.feign.annotation.EnableNeomgcommFeignClients;
import cn.kukinghan.neomega.neomgcomm.common.security.annotation.EnableNeomgcommResourceServer;
import cn.kukinghan.neomega.neomgcomm.common.swagger.annotation.EnableNeomgcommDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author frwcloud
 * @date 2023-07-05
 */
@EnableNeomgcommDoc("job")
@EnableNeomgcommFeignClients
@EnableNeomgcommResourceServer
@EnableDiscoveryClient
@SpringBootApplication
public class NeomgcommQuartzApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeomgcommQuartzApplication.class, args);
	}

}
