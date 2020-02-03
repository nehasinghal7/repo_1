package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// java based logging framework, used to log information, we configure log4j through configuration file . here using property file

// resource - https://springframework.guru/log4j-2-configuration-using-properties-file/
public class Log4jDemo {
	
	//create logger
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);
	
	public static void main(String[] args) {
		
		System.out.println("\n    Hello Word...........!   \n");
		
		logger.info("This is info msg");
		logger.error("This is error msg");
		logger.warn("This is warning msg");
		logger.fatal("This is fatal msg");
		
		System.out.println("completed");
	}

}
