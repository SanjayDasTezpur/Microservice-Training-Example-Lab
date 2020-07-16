package demo.config.factory;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import com.sun.istack.internal.logging.Logger;

@Aspect
public class TraceLogger {
	private static final Logger LOG = Logger.getLogger(TraceLogger.class);

		@Before("execution(*)")
		public void log(JoinPoint joinpt) {
			LOG.info("Before calling "+ joinpt.getSignature().getName() + "with argument");
		}
	
}
