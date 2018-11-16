package br.paulo.training.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.paulo.training.business.Training;

@Repository
public class TrainingDao implements ITrainingDao{

	@Override
	public int addTraining(Training t) {
		// TODO Auto-generated method stub
		System.out.println("I am creating a training..");
		return 0;
	}

	@Override
	public int modifyTransaction(Training t) {
		// TODO Auto-generated method stub
		System.out.println("I am modifing a training..");
		return 0;
	}

	@Override
	public void deleteTransaction(Training t) {
		// TODO Auto-generated method stub
		System.out.println("I am deleting a training..");
	}

	@Override
	public Training retrieveTrainingById(int number) {
		// TODO Auto-generated method stub
		System.out.println("I am retrieving a training by an ID..");
		return null;
	}

	@Override
	public List<Training> listTraining() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean compareTrainings(Training t1, Training t2) {
		// TODO Auto-generated method stub
		return false;
	}
	

	

}
