package packageB;
import org.apache.logging.log4j.*;

public class Practice2 {
private static Logger log=LogManager.getLogger(Practice2.class.getName());
	public static void main(String[] args) {
		// TOO Auto-generated method stub
			log.debug("Practice2_This is to debug");
			log.fatal("Practice2_This is fatal error");
			log.error("Practice2_This is for error");
			log.info("Practice2_This is for info");
	}

}
