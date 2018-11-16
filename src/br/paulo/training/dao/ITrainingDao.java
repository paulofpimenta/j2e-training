package br.paulo.training.dao;

import java.util.List;

import br.paulo.training.business.Training;

public interface ITrainingDao {
	
		public int addTraining(Training t);

		public int modifyTransaction(Training t);

		public void deleteTransaction(Training t);

		public Training retrieveTrainingById(int number);

		public List<Training> listTraining();
		
		public boolean compareTrainings(Training t1, Training t2);
	}

