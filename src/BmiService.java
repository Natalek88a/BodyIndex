public class BmiService {
    public float calculate (int weight, int height) {
        float bodyMassIndex = weight * 10_000 / ((float) height * (float) height); //10_000 перевод см в метры (100^2)

        return bodyMassIndex;
    }
}
