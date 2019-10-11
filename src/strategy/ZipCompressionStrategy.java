package strategy;

public class ZipCompressionStrategy implements CompressionStrategy {
    @Override
    public void compressFile(String filename) {
        System.out.println(filename + " compressed using Zip.");
    }
}
