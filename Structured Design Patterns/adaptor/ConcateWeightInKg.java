package adaptor;

public class ConcateWeightInKg implements WeightInKgAdaptor{
	WeightInPoundsAdaptee wpAdaptee;
	
	public ConcateWeightInKg(WeightInPoundsAdaptee wpAdaptee) {
		super();
		this.wpAdaptee = wpAdaptee;
	}

	@Override
	public double converttokg() {
		// TODO Auto-generated method stub
		double inPounds=wpAdaptee.weightinpound();
		return inPounds*2.5;
	}

}
