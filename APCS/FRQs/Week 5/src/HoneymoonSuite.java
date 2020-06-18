public class HoneymoonSuite extends DeluxeSuite {
		public HoneymoonSuite(int id) {
			super(id);
		}
		@Override
		public String toString() {
			return super.toString() + "\nHoneymoon Package includes : " 
					+ "\n - 2 white terrycloth robes"
					+ "\n - free room service";
		}
		@Override
		public double getRoomRate() {
			return super.getRoomRate() + 25.00;
		}
}
