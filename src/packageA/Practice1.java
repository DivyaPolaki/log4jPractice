package packageA;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Practice1 {
private static Logger log=LogManager.getLogger(Practice1.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("Practice1_This is to debug");
		log.fatal("Practice1_This is fatal error");
		log.error("Practice1_This is for error");
		log.info("Practice1_This is for info");
	}

}
