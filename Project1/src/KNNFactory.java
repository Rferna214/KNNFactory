public class KNNFactory extends KNNModel {
    private static Object KNNModel;


    public static Object createKNNModel(Distance Equations, int k) {
        KNNModel knnModel = new KNNModel(k) {
            @Override
            public double computeDistance(TrainSample x, TrainSample y) {
                return 0;
            }
        };
        switch (Equations) {
            case EUCLIDEAN:
                return KNNModel;
            case CITYBLOCK:
                return KNNModel;
            default:
                return KNNModel;

        }

    }

    @Override
    public double computeDistance(TrainSample x, TrainSample y) {
        return 0;
    }
}
