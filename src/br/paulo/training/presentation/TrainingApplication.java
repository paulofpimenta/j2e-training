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
		

//		0) Cr�er base de donn�es 'formationdb' et une table 'formation'
//
//		1) impl�menter au moins 2 m�thodes DAO JDBC (create + read)
//
//		2) impl�menter au moins 2 m�thodes DAO JPA  (create + read)
//
//		3) Ajouter un fichier xml conf Spring. D�clarer les beans DAOs et le bean Service
//
//		4) Impl�menter une m�thode de la couche service qui sollicite couche DAO JDBC
//
//		5) A partir d'une couche pr�sentation , solliciter la m�thode de la couche service
		
		context.close();
	}
	
}
