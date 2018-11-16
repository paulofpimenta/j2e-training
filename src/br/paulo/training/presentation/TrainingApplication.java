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
		

//		0) Créer base de données 'formationdb' et une table 'formation'
//
//		1) implémenter au moins 2 méthodes DAO JDBC (create + read)
//
//		2) implémenter au moins 2 méthodes DAO JPA  (create + read)
//
//		3) Ajouter un fichier xml conf Spring. Déclarer les beans DAOs et le bean Service
//
//		4) Implémenter une méthode de la couche service qui sollicite couche DAO JDBC
//
//		5) A partir d'une couche présentation , solliciter la méthode de la couche service
		
		context.close();
	}
	
}
