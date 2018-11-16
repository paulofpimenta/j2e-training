package br.paulo.training.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.paulo.training.business.Training;
import br.paulo.training.service.ITrainingService;
import br.paulo.training.service.TrainingService;



public class TrainingApplication {

	public static void main (String[] args) {
		
		// Container initialization
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Training t = context.getBean("training",Training.class);
		ITrainingService service = context.getBean("trainingService",TrainingService.class);
		service.addTraining(t);
		
		context.close();
	}
	
}
