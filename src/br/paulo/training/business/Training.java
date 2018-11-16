package br.paulo.training.business;

import org.springframework.stereotype.Component;

@Component
public class Training {

		private String name;
		private String trainingDate;
		private String group;
		
		public Training() {
			
		}
		public Training(String name, String trainingDate, String group) {
			super();
			this.name = name;
			this.trainingDate = trainingDate;
			this.group = group;
		}
		
		/**
		 * @return the name
		 */
		
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the trainingDate
		 */
		public String getTrainingDate() {
			return trainingDate;
		}
		/**
		 * @param trainingDate the trainingDate to set
		 */
		public void setTrainingDate(String trainingDate) {
			this.trainingDate = trainingDate;
		}
		/**
		 * @return the group
		 */
		public String getGroup() {
			return group;
		}
		/**
		 * @param group the group to set
		 */
		public void setGroup(String group) {
			this.group = group;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Training [name=" + name + ", trainingDate=" + trainingDate + ", group=" + group + "]";
		}
}
