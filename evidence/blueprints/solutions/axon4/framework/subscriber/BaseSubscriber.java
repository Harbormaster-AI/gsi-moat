#header()
package ${aib.getRootPackageName()}.subscriber;

import org.axonframework.queryhandling.QueryGateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Base class for subscribers
 * <p>
 * @author ${aib.getAuthor()}
 */
@Component
public class BaseSubscriber implements ApplicationContextAware {
 
	public BaseSubscriber() {	
	}
	
	@Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        applicationContext = ctx;
    }

//************************************************************************
// Protected / Private Methods
//************************************************************************
    protected QueryGateway getQueryGateway() { return queryGateway; }

    // -------------------------------------------------
    // attributes
    // -------------------------------------------------

    protected static ApplicationContext applicationContext;
    @Autowired
    protected QueryGateway queryGateway;

}



