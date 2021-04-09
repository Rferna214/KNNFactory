import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class KNNModel {

    private ArrayList<TrainSample> trainData;

    int k = 0;

    public KNNModel() {
        this.k = 1;
    }

    public KNNModel(int k) {
        this.k = k;
        this.trainData = new ArrayList<>(k);
    }

    public abstract double computeDistance(TrainSample x, TrainSample y);

    public void predict(TrainSample sample) {
        ArrayList<double[]> distances = new ArrayList<>();

        for (TrainSample otherSample : trainData) {
            double distance = this.computeDistance(sample, otherSample);
            double[] arr = {distance, otherSample.getLabel()};
            distances.add(arr);
        }
    }

    public void addSamples(TrainSample sample) {
        trainData.add(sample);
    }

    public void addMultipleSamples(TrainSample sample) {
        for (TrainSample otherSample : trainData) {
            trainData.add(sample);
        }


    }

    public void setK(int k) {
        if (k < 0) {
            this.k = k;
        } else
            this.k = 0;
    }

    enum Distance {
        EUCLIDEAN,
        CITYBLOCK
    }

    public void knnFiles(String trainData) throws IOException {
        File file = new File("iris.txt");
        Scanner inputFile = new Scanner(file);
        String[] splitted = trainData.split(",");
        String labels = splitted[0];
        String features = splitted[1];
        while (inputFile.hasNext()) {
            String str = inputFile.nextLine();
            System.out.println(str);

        }
        inputFile.close();

    }

}



