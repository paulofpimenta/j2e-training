package br.paulo.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.paulo.training.business.Training;
import br.paulo.training.dao.ITrainingDao;

@Service
public class TrainingService implements ITrainingService {
	
	// Deja fait
	@Autowired
	private ITrainingDao dao;
	
	

	@Override
	public int addTraining(Training t) {
		// TODO Auto-generated method stub

		return dao.addTraining(t);
	}

	@Override
	public int modifyTransaction(Training t) {
		// TODO Auto-generated method stub
		return dao.modifyTransaction(t);
	}

	@Override
	public void deleteTransaction(Training t) {
		// TODO Auto-generated method stub
		dao.deleteTransaction(t);
	}

	@Override
	public Training retrieveTrainingById(int number) {
		// TODO Auto-generated method stub
		return dao.retrieveTrainingById(number);
	}

	@Override
	public List<Training> listTraining() {
		// TODO Auto-generated method stub
		return dao.listTraining();
	}

	@Override
	public boolean compareTrainings(Training t1, Training t2) {
		// TODO Auto-generated method stub
		return false;
	}

}
