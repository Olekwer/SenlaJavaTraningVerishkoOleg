package oleg.com.example;


import java.lang.reflect.Method;

import java.util.List;

import org.apache.log4j.Logger;

import com.example.api.Request;
import com.example.oleg.base.DataBase;
import com.example.oleg.controller.Facade;
import com.example.oleg.controller.IFacade;

/*
 * команды для запросов
 */
public class Parser {
	private IFacade facade;
	private Logger log = Logger.getLogger(DataBase.class);

	public Parser(){
		facade=Facade.getFacade();
		facade.init();
	}
	
	public Object invoke(Request request){
		String header= request.getHeader();
		Object result=null;
		List<Object> objects = (List<Object>) request.getObject();
		Facade facade = Facade.getFacade();
		facade.init();
		Object[] argss = new Object[objects.size()];
		for (int i = 0; i < objects.size(); i++) {
			argss[i] = objects.get(i);
		}
		
		try {
			Class<?> clazz = facade.getClass();
			Class<?> params[] = new Class[argss.length];

			if (params.length != 0) {
				for (int i = 0; i < argss.length; i++) {
					Class<?>clds=Class.forName(argss[i].getClass().getName());
					params[i]=clds;
				}
			}
			Method myMethod = clazz.getDeclaredMethod(header, params);
			
			result=myMethod.invoke(facade, argss);
			

		} catch (Exception e) {
			log.info(e);
		}
		
		return result;
	}

	
}
