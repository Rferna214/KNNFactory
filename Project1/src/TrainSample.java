public class TrainSample extends KNNModel{

    double [] features = new double[0];

    int label = 0;

    public TrainSample(double[] features, int label) {

    }

    public int getLabel(){
        return -1;
    }

    TrainSample trainSample = new TrainSample(features, label);

    @Override
    public double computeDistance(TrainSample x, TrainSample y) {
        return 0;
    }
}
