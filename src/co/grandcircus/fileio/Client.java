package co.grandcircus.fileio;

public class Client {

		private String name;
		private int age;
		private double weight;
		
		public Client(String name, int age, double weight) {
			super();
			this.name = name;
			this.age = age;
			this.weight = weight;
		}
		
		
		public Client() {
			// TODO Auto-generated constructor stub
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getWeight() {
			return weight;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}
		@Override
		public String toString() {
			return "Client [name=" + name + ", age=" + age + ", weight=" + weight + "]";
		}
		
		

	}


