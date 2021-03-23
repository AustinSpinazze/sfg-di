package austinspinazze.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;


@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof austinspinazze.springframework.sfgdi.services.LifeCycleDemoBean){
            ((austinspinazze.springframework.sfgdi.services.LifeCycleDemoBean) bean).beforeInit();
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof austinspinazze.springframework.sfgdi.services.LifeCycleDemoBean){
            ((austinspinazze.springframework.sfgdi.services.LifeCycleDemoBean) bean).afterInit();
        }

        return bean;
    }
}
